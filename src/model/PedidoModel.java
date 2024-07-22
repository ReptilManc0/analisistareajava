package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class PedidoModel {

    public List<Map<String, Object>> obtenerAdmPedidoVenta() {
        Connection cn = Conexion.obtenerConexion();
        List<Map<String, Object>> detalles = new ArrayList<>();
        String query = "SELECT v.CodigoVenta, c.NombreCliente, v.FechaVenta, v.ImporteFinal "
                + "FROM ventas v "
                + "INNER JOIN clientes c ON v.CodigoCliente = c.CodigoCliente";
        try (PreparedStatement ps = cn.prepareStatement(query); 
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Map<String, Object> listaAdmPedidoVenta = new HashMap<>();
                listaAdmPedidoVenta.put("CodigoVenta", rs.getInt("CodigoVenta"));
                listaAdmPedidoVenta.put("NombreCliente", rs.getString("NombreCliente"));
                listaAdmPedidoVenta.put("FechaVenta", rs.getDate("FechaVenta"));
                listaAdmPedidoVenta.put("ImporteFinal", rs.getDouble("ImporteFinal"));
                detalles.add(listaAdmPedidoVenta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        } finally {
            Conexion.cerrarConexion(cn);
        }
        return detalles;
    }
    
     public List<Map<String, Object>> obtenerDetallesPedido(int codigoVenta) {
        Connection cn = Conexion.obtenerConexion();
        List<Map<String, Object>> detalles = new ArrayList<>();
        String query = "SELECT dv.CodigoDetalleVenta, p.NombreProducto, dv.Cantidad, p.Precio, " +
                 "(dv.Cantidad * p.Precio) as Total " +
                 "FROM detalleventa dv " +
                 "INNER JOIN producto p ON dv.CodigoProducto = p.CodigoProducto " +
                 "WHERE dv.CodigoVenta = ?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setInt(1, codigoVenta);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> detalle = new HashMap<>();
                    detalle.put("CodigoDetalleVenta", rs.getInt("CodigoDetalleVenta"));
                    detalle.put("NombreProducto", rs.getString("NombreProducto"));
                    detalle.put("Cantidad", rs.getInt("Cantidad"));
                    detalle.put("Precio", rs.getDouble("Precio"));
                    detalle.put("Total", rs.getDouble("Total"));
                    detalles.add(detalle);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        } finally {
            Conexion.cerrarConexion(cn);
        }
        return detalles;
    }
}
