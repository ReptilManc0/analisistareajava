package model;

import java.sql.*;
import java.util.*;

public class SalidaProductoModel {
    Connection  conn = Conexion.obtenerConexion();
    public List<Map<String, Object>> obtenerVentas() {
        List<Map<String, Object>> ventas = new ArrayList<>();
        String sql = "SELECT v.CodigoVenta, c.NombreCliente, v.FechaVenta " +
                     "FROM ventas v " +
                     "INNER JOIN clientes c ON v.CodigoCliente = c.CodigoCliente";
        
        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                Map<String, Object> venta = new HashMap<>();
                venta.put("CodigoVenta", rs.getInt("CodigoVenta"));
                venta.put("NombreCliente", rs.getString("NombreCliente"));
                venta.put("FechaVenta", rs.getDate("FechaVenta"));
                ventas.add(venta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conn);
        }
        return ventas;
    }

    public Map<String, Object> obtenerDetallesVenta(int codigoVenta) {
        Map<String, Object> detalles = new HashMap<>();
        String sql = "SELECT v.CodigoVenta, c.NombreCliente, v.FechaVenta " +
                     "FROM ventas v " +
                     "INNER JOIN clientes c ON v.CodigoCliente = c.CodigoCliente " +
                     "WHERE v.CodigoVenta = ?";
        
        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, codigoVenta);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    detalles.put("CodigoVenta", rs.getInt("CodigoVenta"));
                    detalles.put("NombreCliente", rs.getString("NombreCliente"));
                    detalles.put("FechaVenta", rs.getDate("FechaVenta"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conn);
        }
        return detalles;
    }

    public List<Map<String, Object>> obtenerEmpleados() {
        List<Map<String, Object>> empleados = new ArrayList<>();
        String sql = "SELECT CodigoEmpleado, NombreEmpleado FROM empleado WHERE Rol = 'Repartidor'";
        
        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                Map<String, Object> empleado = new HashMap<>();
                empleado.put("CodigoEmpleado", rs.getInt("CodigoEmpleado"));
                empleado.put("NombreEmpleado", rs.getString("NombreEmpleado"));
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conn);
        }
        return empleados;
    }

    public List<Map<String, Object>> obtenerProductos() {
        List<Map<String, Object>> productos = new ArrayList<>();
        String sql = "SELECT p.CodigoProducto, p.NombreProducto, i.Stock " +
                     "FROM producto p " +
                     "INNER JOIN inventario i ON p.CodigoProducto = i.CodigoProducto";
        
        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                Map<String, Object> producto = new HashMap<>();
                producto.put("CodigoProducto", rs.getInt("CodigoProducto"));
                producto.put("NombreProducto", rs.getString("NombreProducto"));
                producto.put("Stock", rs.getInt("Stock"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(conn);
        }
        return productos;
    }

    public boolean registrarSalida(int codigoVenta, int codigoEmpleado, List<Map<String, Object>> productos) {
        Connection conn = null;
        try {
            conn = Conexion.obtenerConexion();
            conn.setAutoCommit(false);

            // Insertar en la tabla Delivery
            String sqlDelivery = "INSERT INTO delivery (CodigoVenta, CodigoEmpleado) VALUES (?, ?)";
            try (PreparedStatement pstmtDelivery = conn.prepareStatement(sqlDelivery)) {
                pstmtDelivery.setInt(1, codigoVenta);
                pstmtDelivery.setInt(2, codigoEmpleado);
                pstmtDelivery.executeUpdate();
            }

            // Actualizar el inventario
            String sqlInventario = "UPDATE inventario SET Stock = Stock - ? WHERE CodigoProducto = ?";
            try (PreparedStatement pstmtInventario = conn.prepareStatement(sqlInventario)) {
                for (Map<String, Object> producto : productos) {
                    pstmtInventario.setInt(1, (Integer) producto.get("Cantidad"));
                    pstmtInventario.setInt(2, (Integer) producto.get("CodigoProducto"));
                    pstmtInventario.executeUpdate();
                }
            }

            conn.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}