/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class Inventario {

    public Object CodigoItem;
    public Object CodigoProducto;
    public Object NombreProducto;
    public Object Precio;
    public Object Stock;
    public Object CodigoProveedor;
    public Object FechaEntrega;
    public Object Estado;

    public void AgregarProducto() {
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement stmt = null;
        //Insercion de un nuevo proveedor en la BD
        //CALL AddNewProduct(NombreProducto, Precio, Stock, CodigoProveedor, FechaEntrega);
        try {
            String consulta = "CALL AddNewProduct(?, ?, ?, ?, ?)";
            // Preparar la consulta
            stmt.setObject(1, NombreProducto);
            stmt.setObject(2, Precio);
            stmt.setObject(3, Stock);
            stmt.setObject(4, CodigoProveedor);
            stmt.setObject(5, FechaEntrega);

            // Ejecutar la consulta
            stmt.executeQuery();
            stmt.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de producto exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Inv: " + e);
        }

    }

    public ArrayList<Inventario> ReadInv() {
        ArrayList<Inventario> p = new ArrayList<>();
        String sql = "SELECT i.CodigoItemInventario, p.NombreProducto, i.CodigoProveedor, "
                + "i.FechaEntrega, i.Stock, "
                + "CASE WHEN i.Stock < 5 THEN 'Reabastecer' ELSE 'Suficiente Stock' END AS Estado "
                + "FROM inventario i "
                + "JOIN producto p ON i.CodigoProducto = p.CodigoProducto";

        try (
                 Connection conexion = Conexion.obtenerConexion();  Statement stmt = conexion.createStatement();  ResultSet rs = stmt.executeQuery(sql);) {
            // Process the result set
            while (rs.next()) {
                Inventario i = new Inventario();
                i.CodigoItem = rs.getInt("CodigoItemInventario");
                i.NombreProducto = rs.getString("NombreProducto");
                i.CodigoProveedor = rs.getInt("CodigoProveedor");
                i.FechaEntrega = rs.getDate("FechaEntrega");
                i.Stock = rs.getInt("Stock");
                i.Estado = rs.getString("Estado");
                
                p.add(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return p;
    }

    public void ActualizarProducto() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "UPDATE producto SET NombreProducto=?, Precio=? WHERE CodigoProducto=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, NombreProducto);
            st.setObject(2, Precio);
            st.setObject(3, CodigoProducto);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Actualización de producto exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Inv: " + e);
        }

    }

    public void EliminarProducto() {
        String sql = "{CALL DeleteProduct(?)}";

        try (
                 Connection conexion = Conexion.obtenerConexion();  CallableStatement stmt = conexion.prepareCall(sql);) {
            stmt.setObject(1, CodigoProducto);

            ResultSet rs = stmt.executeQuery();
            JOptionPane.showMessageDialog(null, "Eliminación de producto exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Inv: " + e);
        }

    }

}
