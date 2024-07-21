/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PedidoProveedorCRUD {
    Connection  conexion = Conexion.obtenerConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() {
        List<PedidoProveedor> datos = new ArrayList<>();
        String sql ="Select * from pedidoproveedor";
        try {
            ps = con.prepareStatement(sql);
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
            ps = con.prepareStatement(sql);
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
    
}
