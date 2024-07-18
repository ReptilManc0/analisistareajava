package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Clientes extends FuncionesGenerales {

    //Atributos de la clase clientes
    public Object CodigoCliente;
    public Object NombreCliente;
    public Object ApellidoCliente;
    public Object DNICliente;
    public Object CorreoCliente;
    public Object TelefonoCliente;
    //Método para agregar clientes

    public void AgregarCliente() {
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement statement = null;
        //Insercion de un nuevo proveedor en la BD
        try {
            String consulta = "INSERT INTO clientes (NombreCliente, ApellidoCliente, DNICLiente, CorreoCliente, TelefonoCliente) values (?,?,?,?,?);";
            // Preparar la consulta
            statement = conexion.prepareStatement(consulta);
            //Preparacion de los parametros
            statement.setObject(1, NombreCliente);
            statement.setObject(2, ApellidoCliente);
            statement.setObject(3, DNICliente);
            statement.setObject(4, CorreoCliente);
            statement.setObject(5, TelefonoCliente);

            // Ejecutar la consulta
            statement.executeUpdate();
            statement.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de cliente exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }

    }

    public ArrayList<Clientes> ReadCliente() {
        ArrayList<Clientes> p = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Clientes c = new Clientes();
                c.CodigoCliente = rs.getInt("CodigoCliente");
                c.NombreCliente = rs.getString("NombreCliente");
                c.ApellidoCliente = rs.getString("ApellidoCliente");
                c.DNICliente = rs.getString("DNICliente");
                c.CorreoCliente = rs.getString("CorreoCliente");
                c.TelefonoCliente = rs.getString("TelefonoCliente");

                p.add(c);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        }

        return p;
    }

    public void ActualizarCliente() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "UPDATE clientes SET  NombreCliente=?, ApellidoCliente=?, DNICliente=?, CorreoCliente=?, TelefonoCliente=? WHERE CodigoCliente=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, NombreCliente);
            st.setObject(2, ApellidoCliente);
            st.setObject(3, DNICliente);
            st.setObject(4, CorreoCliente);
            st.setObject(5, TelefonoCliente);
            st.setObject(6, CodigoCliente);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Actualización de cliente exitoso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        }

    }

    public void EliminarCliente() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "DELETE FROM clientes WHERE CodigoCliente=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, CodigoCliente);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        }

    }
     public ArrayList<String> ObtenerIDsClientes(){
    ArrayList<String> l = new ArrayList<>();
    String query = "SELECT CodigoCliente FROM clientes";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                l.add(String.valueOf(rs.getInt("CodigoCliente")));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        }
    
    return l;
    }
}
