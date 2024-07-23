/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import model.Inventario;

/**
 *
 * @author Cesar
 */
public class ControllerDisponibilidadProducto {
        public DefaultTableModel MostrarInventario() {
        DefaultTableModel tabla = new DefaultTableModel();
        Inventario inv = new Inventario();
        ArrayList<Inventario> invList = inv.ReadInv();
        tabla.setColumnIdentifiers(new Object[]{"Codigo Item", "Nombre del Producto", "Codigo del Proveedor", "Fecha de Entrega", "Stock", "Estado"});
        try {
            for (Inventario i : invList) {
                tabla.addRow(new Object[]{(i.CodigoItem), (i.NombreProducto), (i.CodigoProveedor), (i.FechaEntrega), (i.Stock), (i.Estado)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }
        public void EliminarInventarioyProducto(String id){
        Inventario inv = new Inventario();
        inv.CodigoProducto=id;
        inv.EliminarProducto();
        }
        
        public void addProducto(String nombreproducto, String precio, String stock, String codigoproveedor, String fechaentrega){
            Inventario inv = new Inventario();
            inv.NombreProducto= nombreproducto;
            inv.Precio=precio;
            inv.Stock=stock;
            inv.CodigoProveedor=codigoproveedor;
            inv.FechaEntrega=fechaentrega;
           
            inv.AgregarProductoInventario();
            
        }
}
