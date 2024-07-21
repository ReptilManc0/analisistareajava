package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetallesVentas extends FuncionesGenerales {

    public Object CodigoDetalleVenta;
    public Object CodigoVenta;
    public Object CodigoProducto;
    public Object NombreProducto;

    public Object Cantidad;

    public Object ImporteParcial;

    public ArrayList<DetallesVentas> ObtenerDetallesVenta() {
        ArrayList<DetallesVentas> p = new ArrayList<>();
        String query = "SELECT "
                + "    dv.CodigoDetalleVenta,"
                + "    dv.CodigoVenta,"
                + "    p.NombreProducto,"
                + "    dv.Cantidad,"
                + "    dv.ImporteParcial "
                + "FROM "
                + "    detalleVenta dv "
                + " JOIN "
                + "    producto p ON dv.CodigoProducto = p.CodigoProducto "
                + " WHERE "
                + "    dv.CodigoVenta = ?;";
        Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = null;

        try {
            st = conexion.prepareStatement(query);
            st.setObject(1, CodigoVenta);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                DetallesVentas dv = new DetallesVentas();
                dv.CodigoDetalleVenta = rs.getInt("CodigoDetalleVenta");
                dv.CodigoVenta = rs.getString("CodigoVenta");
                dv.NombreProducto = rs.getString("NombreProducto");
                dv.Cantidad = rs.getString("Cantidad");
                dv.ImporteParcial=rs.getString("ImporteParcial");
                p.add(dv);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error prov: " + e);
        }

        return p;
    }
}
