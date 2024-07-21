/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.PedidoProveedorCRUD;
import model.PedidoProveedor;
import views.PedidoProveedorview;

/**
 *
 * @author JAHIR
 */
public class ControlarPedidoProveedor implements ActionListener{

    
    PedidoProveedorCRUD dao = new PedidoProveedorCRUD();
    PedidoProveedor p = new PedidoProveedor();
    PedidoProveedorview vista = new PedidoProveedorview();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControlarPedidoProveedor(PedidoProveedorview v) {
        this.vista= v;
        this.vista.BtnListar.addActionListener(this);
        this.vista.BtnEnviar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== vista.BtnListar) {
                listar(vista.tabla);
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<PedidoProveedor>lista=dao.listar();
        Object[]object=new Object[6];
        for (int i = 0; i < lista.size() ; i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getProveedor();
            object[2] = lista.get(i).getFecha();
            object[3] = lista.get(i).getProducto();
            object[4] = lista.get(i).getDireccion();
            object[5] = lista.get(i).getEstado();
            modelo.addRow(object);
            
        }
        vista.tabla.setModel(modelo);
    }
    
    public void Agregar(){
        String prove = vista.txtProveedor.getText();
        String fecha = vista.txtFecha.getText();
        String producto = vista.txtProducto.getText();
        String direccion = vista.txtDireccion.getText();
        String estado = vista.txtEstado.getText();
    }
}
