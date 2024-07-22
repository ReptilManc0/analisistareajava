package model ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ventas extends FuncionesGenerales{
    //Atributos de la clase ventas
    
    public Object CodigoVenta;
    public Object CodigoCliente;
    public Object FechaVenta;
    public Object ImporteFinal;
    
 public void AgregarVenta() {
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement statement = null;
        //Insercion de un nuevo proveedor en la BD
        try {
            String consulta = "INSERT INTO ventas (CodigoCliente, FechaVenta, ImporteFinal) values (?,?,?);";
            // Preparar la consulta
            statement = conexion.prepareStatement(consulta);
            //Preparacion de los parametros
            statement.setObject(1, CodigoCliente);
            statement.setObject(2, FechaVenta);
            statement.setObject(3, ImporteFinal);
            

            // Ejecutar la consulta
            statement.execute();
            statement.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error venta: "+e);
        }

    }

    public ArrayList<Ventas> ReadVentas() {
        ArrayList<Ventas> p = new ArrayList<>();
        String query = "SELECT * FROM ventas";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Ventas v = new Ventas();
                v.CodigoVenta = rs.getInt("CodigoVenta");
                v.CodigoCliente = rs.getInt("CodigoCliente");
                v.FechaVenta = rs.getString("FechaVenta");
                v.ImporteFinal = rs.getString("ImporteFinal");

                p.add(v);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error venta : "+e);
        }

        return p;
    }
    
    public void ActualizarVenta() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "UPDATE ventas SET  CodigoCliente=?, FechaVenta=?, ImporteFinal=? WHERE CodigoVenta=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, CodigoCliente);
            st.setObject(2, FechaVenta);
            st.setObject(3, ImporteFinal);
            st.setObject(4, CodigoVenta);

            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Actualización de proveedor exitoso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error venta: "+e);
        }

    }

    public void EliminarVenta() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "DELETE FROM ventas WHERE CodigoVenta= ?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, CodigoVenta);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamenta");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error venta: "+e);
        }

    }
   
}
