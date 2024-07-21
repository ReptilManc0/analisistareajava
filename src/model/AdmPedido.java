package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class AdmPedido {

    private final int codigoVenta;
    private final int nombreCliente;
    private final Date fechaVenta;
    private final double importeFinal;

    public AdmPedido(int codigoVenta, int nombreCliente, Date fechaVenta, double importeFinal) {
        this.codigoVenta = codigoVenta;
        this.nombreCliente = nombreCliente;
        this.fechaVenta = fechaVenta;
        this.importeFinal = importeFinal;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public int getNombreCliente() {
        return nombreCliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public double getImporteFinal() {
        return importeFinal;
    }

    public static ArrayList<AdmPedido> obtenerAdmPedidoVenta() {
        ArrayList<AdmPedido> listaAdmPedidoVenta = new ArrayList<>();
        String query = "SELECT * FROM ventas";
        Connection cn = Conexion.obtenerConexion();
        PreparedStatement st = null;
        try {
            st = cn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listaAdmPedidoVenta.add(new AdmPedido(rs.getInt("CodigoVenta"),
                        rs.getInt("NombreCliente"),
                        rs.getDate("FechaVenta"),
                        rs.getDouble("ImporteFinal")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errorcli: " + e);
        } finally {
            Conexion.cerrarConexion(cn);
        }
        return listaAdmPedidoVenta;
    }
}
