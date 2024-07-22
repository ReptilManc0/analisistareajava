
package model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PedidoProveedorCRUD {

    Connection  conexion = Conexion.obtenerConexion();
    

    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<PedidoProveedor> datos = new ArrayList<>();
        String sql ="Select * from pedidoproveedor";
        try {

            Connection  conexion = Conexion.obtenerConexion();

            

            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PedidoProveedor p = new PedidoProveedor();
                p.setId(rs.getInt(1));
                p.setProveedor(rs.getString(2));
                p.setFecha(rs.getString(3));
                p.setProducto(rs.getString(4));
                p.setDireccion(rs.getString(5));
                p.setEstado(rs.getString(6));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    public int Agregar(PedidoProveedor p){
        String sql ="Insert into pedidoproveedor(Proveedor,FechaPedido,Producto,Direccion,EstadoPedido) values (?,?,?,?,? )";
        try {

            Connection  conexion = Conexion.obtenerConexion();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, p.getProveedor());
            ps.setString(2, p.getFecha());
            ps.setString(3, p.getProducto());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
          return 1;
}
    
    public int Actualizar(PedidoProveedor p){
        int r = 0;
        
        String sql ="update pedidoproveedor set Proveedor=?, FechaPedido=?, Producto=?, Direccion=?, EstadoPedido=? where id=?";
        try {

            Connection  conexion = Conexion.obtenerConexion();
            ps= conexion.prepareStatement(sql);

            ps.setString(1, p.getProveedor());
            ps.setString(2, p.getFecha());
            ps.setString(3, p.getProducto());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getEstado());
            ps.setInt(6, p.getId());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
        }
        return r;
    }
    
    
    public void delete (int id){
        
        String sql = "delete from pedidoproveedor where id="+ id;
        try {

            Connection  conexion = Conexion.obtenerConexion();

            ps= conexion.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public ArrayList<String> ObtenerNombresProveedores() {
    ArrayList<String> l = new ArrayList<>();
    String query = "SELECT NombreProveedor FROM proveedor";
    PreparedStatement st = null;

    try {
        st = conexion.prepareStatement(query);
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            l.add(rs.getString("NombreProveedor"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Errorprov: " + e);
    }
    
    return l;
}

}
