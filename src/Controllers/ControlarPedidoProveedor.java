/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
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
        v.setVisible(true);
        this.vista= v;
        this.vista.BtnListar.addActionListener(this);
        this.vista.BtnEnviar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        listar(vista.tabla);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== vista.BtnListar) {
                listar(vista.tabla);
                limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource()== vista.BtnEnviar) {
            Agregar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnEditar){
            int fila = vista.tabla.getSelectedRow();
            if (fila == 1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una sila");
            }else{
                int id= Integer.parseInt((String)vista.tabla.getValueAt(fila, 0).toString());
                String prove=(String)vista.tabla.getValueAt(fila, 1);
                String fecha=(String)vista.tabla.getValueAt(fila, 2);
                String producto=(String)vista.tabla.getValueAt(fila,3);
                String direccion=(String)vista.tabla.getValueAt(fila, 4);
                String estado=(String)vista.tabla.getValueAt(fila, 5);
                vista.txtID.setText(""+ id);
                vista.txtProveedor.setText(prove);
                vista.txtFecha.setText(fecha);
                vista.txtProducto.setText(producto);
                vista.txtDireccion.setText(direccion);
                vista.txtEstado.setText(estado);
                
            }
                   
        }
        if (e.getSource() == vista.btnActualizar) {
            Actualizar();
            limpiarTabla();
            listar(vista.tabla);
        }
        if (e.getSource() == vista.btnEliminar) {
            int fila = vista.tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un usuario");
            } else {
                int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());

                dao.delete(id);
                JOptionPane.showMessageDialog(vista, "Eliminación correcta");
            }
            limpiarTabla();
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
    
    public void Agregar() {
        int id = Integer.parseInt(vista.txtID.getText());
        String prove = (String) vista.txtProveedor.getText();
        String fecha = vista.txtFecha.getText();
        String producto = vista.txtProducto.getText();
        String direccion = vista.txtDireccion.getText();
        String estado = vista.txtEstado.getText();
        p.setId(id);
        p.setProveedor(prove);
        p.setFecha(fecha);
        p.setProducto(producto);
        p.setDireccion(direccion);
        p.setEstado(estado);
        int r = dao.Agregar(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Usuario Agregado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error comunicate con jahir");
        }
    }
    
    public void Actualizar (){
        int id = Integer.parseInt(vista.txtID.getText());
        String prove = (String) vista.txtProveedor.getText();
        String fecha = vista.txtFecha.getText();
        String producto = vista.txtProducto.getText();
        String direccion = vista.txtDireccion.getText();
        String estado = vista.txtEstado.getText();
        p.setId(id);
        p.setProveedor(prove);
        p.setFecha(fecha);
        p.setProducto(producto);
        p.setDireccion(direccion);
        p.setEstado(estado);
        int r = dao.Actualizar(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(vista, "Error al actualizar");
        }
    }
    
    void limpiarTabla(){
        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    
}