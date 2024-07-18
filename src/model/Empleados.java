package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class Empleados extends FuncionesGenerales{
    //Atributos de la clase empleados
    public Object CodigoEmpleado;
    public Object NombreEmpleado;
    public Object Rol;
    public Object DNIEmpleado;
    public Object CorreoEmpleado;
    public Object TelefonoEmpleado;
    // Método para agregar empleados
       public void AgregarEmpleado() {
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement statement = null;
        //Insercion de un nuevo proveedor en la BD
        try {
            String consulta = "INSERT INTO empleado (NombreEmpleado, Rol, DNIEmpleado, CorreoEmpleado, TelefonoEmpleado) values (?,?,?,?,?);";
            // Preparar la consulta
            statement = conexion.prepareStatement(consulta);
            //Preparacion de los parametros
            statement.setObject(1, NombreEmpleado);
            statement.setObject(2, Rol);
            statement.setObject(3, DNIEmpleado);
            statement.setObject(4, CorreoEmpleado);
            statement.setObject(5, TelefonoEmpleado);

            // Ejecutar la consulta
            statement.executeUpdate();
            statement.close();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Registro de Empleado exitoso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error emp: "+e);
        }

    }

    public ArrayList<Empleados> ReadEmpleado() {
        ArrayList<Empleados> p = new ArrayList<>();
        String query = "SELECT * FROM empleado";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Empleados c = new Empleados();
                c.CodigoEmpleado = rs.getInt("CodigoEmpleado");
                c.NombreEmpleado = rs.getString("NombreEmpleado");
                c.Rol = rs.getString("Rol");
                c.DNIEmpleado = rs.getString("DNIEmpleado");
                c.CorreoEmpleado = rs.getString("CorreoEmpleado");
                c.TelefonoEmpleado = rs.getString("TelefonoEmpleado");

                p.add(c);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erroremp: " + e);
        }

        return p;
    }

    public void ActualizarEmpleado() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "UPDATE empleado SET  NombreEmpleado=?, Rol=?, DNIEmpleado=?, CorreoEmpleado=?, TelefonoEmpleado=? WHERE CodigoEmpleado=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, NombreEmpleado);
            st.setObject(2, Rol);
            st.setObject(3, DNIEmpleado);
            st.setObject(4, CorreoEmpleado);
            st.setObject(5, TelefonoEmpleado);
            st.setObject(6, CodigoEmpleado);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Actualización de cliente exitoso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error emp: " + e);
        }

    }

    public void EliminarEmpleados() {
        Connection conexion = Conexion.obtenerConexion();
        String query = "DELETE FROM empleado WHERE CodigoEmpleado=?";
        try {
            PreparedStatement st = conexion.prepareStatement(query);
            st.setObject(1, CodigoEmpleado);
            st.execute();
            Conexion.cerrarConexion(conexion);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error emp  : " + e);
        }

    }
   
}


