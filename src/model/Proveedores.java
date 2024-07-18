package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proveedores extends FuncionesGenerales {

    //Atributos de la clase proveedores
    public Object CodigoProveedor;
    public Object NombreProveedor;
    public Object TelefonoProveedor;
    public Object CorreoProveedor;

    //Método para agregar proveedores
    public void AgregarProveedor() {
        //Variables para la conexion
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement statement = null;
        //Insercion de un nuevo proveedor en la BD
        try {
            String consulta = "INSERT INTO proveedor (NombreProveedor, TelefonoProveedor,CorreoProveedor) values (?,?,?);";
            // Preparar la consulta
            statement = conexion.prepareStatement(consulta);
            //Preparacion de los parametros
            statement.setObject(1, NombreProveedor);
            statement.setObject(2, TelefonoProveedor);
            statement.setObject(3, CorreoProveedor);
            // Ejecutar la consulta
            int filasAfectadas = statement.executeUpdate();
            statement.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de proveedor exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prov: " + e);
        }
    }

    public ArrayList<Proveedores> ReadProveedor() {
        ArrayList<Proveedores> p = new ArrayList<>();
        String query = "SELECT * FROM proveedor";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Proveedores pr = new Proveedores();
                pr.CodigoProveedor = rs.getInt("CodigoProveedor");
                pr.NombreProveedor = rs.getString("NombreProveedor");
                pr.TelefonoProveedor = rs.getString("TelefonoProveedor");
                pr.CorreoProveedor = rs.getString("CorreoProveedor");

                p.add(pr);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prov: " + e);
        }

        return p;
    }

    public void ActualizarProveedor() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "UPDATE proveedor SET NombreProveedor=?,TelefonoProveedor=?,CorreoProveedor=? WHERE CodigoProveedor=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, NombreProveedor);
            st.setObject(2, TelefonoProveedor);
            st.setObject(3, CorreoProveedor);
            st.setObject(4, CodigoProveedor);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Actualización de proveedor exitoso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prov: " + e);
        }

    }

    public void EliminarProveedor() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "DELETE FROM proveedor WHERE CodigoProveedor=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1,CodigoProveedor);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamenta");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prov: " + e);
        }

    }
}
