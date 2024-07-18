package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Productos extends FuncionesGenerales{
    //Atributos de la clase productos
    public Object CodigoProducto;
    public Object NombreProducto;
    public Object Precio;

    public void AgregarProducto(){
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement statement = null;
        //Insercion de un nuevo proveedor en la BD
        try {
            String consulta = "INSERT INTO producto (NombreProducto,Precio) values (?,?);";
            // Preparar la consulta
            statement = conexion.prepareStatement(consulta);
            //Preparacion de los parametros
            statement.setObject(1, NombreProducto);
            statement.setObject(2, Precio);
            
            // Ejecutar la consulta
            statement.executeUpdate();
            statement.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de producto exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prod: " + e);
        }
    
    }
     public ArrayList<Productos> ReadProducto() {
        ArrayList<Productos> p = new ArrayList<>();
        String query = "SELECT * FROM producto";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Productos pr = new Productos();
                pr.CodigoProducto= rs.getInt("CodigoProducto");
                pr.NombreProducto = rs.getString("NombreProducto");
                pr.Precio = rs.getString("Precio");
               

                p.add(pr);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prod: " + e);
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
            JOptionPane.showMessageDialog(null, "Error prod: " + e);
        }

    }

    public void EliminarProducto() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "DELETE FROM producto WHERE CodigoProducto=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1,CodigoProducto);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prod: " + e);
        }

    }
}

