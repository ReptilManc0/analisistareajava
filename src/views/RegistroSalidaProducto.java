package views;

import Controllers.SalidaProductoController;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;


public class RegistroSalidaProducto extends javax.swing.JFrame {
    private SalidaProductoController controlador;
    private DefaultTableModel modeloTabla;
    
    public RegistroSalidaProducto() {
        initComponents();
        controlador = new SalidaProductoController();
        inicializarComponentes();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Salida de Productos");
        ajustarImagen(bannerLupita, "src/Imagenes/banner_lupita.png");
    }
    
    private void ajustarImagen(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void inicializarComponentes() {
        // Inicializar la tabla
        modeloTabla = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Código", "Producto", "Cantidad"}
        );
        tblProductos.setModel(modeloTabla);

        // Cargar datos iniciales
        cargarVentas();
        cargarEmpleados();
        cargarProductos();
        
        spnCantidad.setValue(1);
        // Agregar listeners
        cmbCodigoVenta.addActionListener(e -> actualizarDetallesVenta());
        cmbCodigoEmpleado.addActionListener(e -> actualizarNombreEmpleado());
        cmbCodigoProducto.addActionListener(e -> actualizarNombreProducto());
        btnAgregarProducto.addActionListener(e -> agregarProducto());
        btnRegistrarSalida.addActionListener(e -> registrarSalida());
        btnCancelar.addActionListener(e -> limpiarFormulario());
    }
    
     private void cargarVentas() {
        List<Map<String, Object>> ventas = controlador.obtenerVentas();
        cmbCodigoVenta.removeAllItems();
        for (Map<String, Object> venta : ventas) {
            cmbCodigoVenta.addItem(venta.get("CodigoVenta").toString());
        }
    }

    private void cargarEmpleados() {
        List<Map<String, Object>> empleados = controlador.obtenerEmpleados();
        cmbCodigoEmpleado.removeAllItems();
        for (Map<String, Object> empleado : empleados) {
            cmbCodigoEmpleado.addItem(empleado.get("CodigoEmpleado").toString());
        }
    }
    
    private void cargarProductos() {
        List<Map<String, Object>> productos = controlador.obtenerProductos();
        cmbCodigoProducto.removeAllItems();
        for (Map<String, Object> producto : productos) {
            cmbCodigoProducto.addItem(producto.get("CodigoProducto").toString());
        }
    }

    private void actualizarDetallesVenta() {
        int codigoVenta = Integer.parseInt(cmbCodigoVenta.getSelectedItem().toString());
        Map<String, Object> detalles = controlador.obtenerDetallesVenta(codigoVenta);
        txtNombreCliente.setText(detalles.get("NombreCliente").toString());
        txtFechaVenta.setText(detalles.get("FechaVenta").toString());
    }
    
    private void actualizarNombreEmpleado() {
        List<Map<String, Object>> empleados = controlador.obtenerEmpleados();
        String codigoEmpleado = cmbCodigoEmpleado.getSelectedItem().toString();
        for (Map<String, Object> empleado : empleados) {
            if (empleado.get("CodigoEmpleado").toString().equals(codigoEmpleado)) {
                txtNombreEmpleado.setText(empleado.get("NombreEmpleado").toString());
                break;
            }
        }
    }

    private void actualizarNombreProducto() {
        List<Map<String, Object>> productos = controlador.obtenerProductos();
        String codigoProducto = cmbCodigoProducto.getSelectedItem().toString();
        for (Map<String, Object> producto : productos) {
            if (producto.get("CodigoProducto").toString().equals(codigoProducto)) {
                txtNombreProducto.setText(producto.get("NombreProducto").toString());
                break;
            }
        }
    }
    
     private void agregarProducto() {
        String codigo = cmbCodigoProducto.getSelectedItem().toString();
        String nombre = txtNombreProducto.getText();
        int cantidad = (Integer) spnCantidad.getValue();

        Vector<Object> fila = new Vector<>();
        fila.add(codigo);
        fila.add(nombre);
        fila.add(cantidad);
        modeloTabla.addRow(fila);
    }
     
     private void registrarSalida() {
        int codigoVenta = Integer.parseInt(cmbCodigoVenta.getSelectedItem().toString());
        int codigoEmpleado = Integer.parseInt(cmbCodigoEmpleado.getSelectedItem().toString());
        
        List<Map<String, Object>> productos = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            Map<String, Object> producto = new HashMap<>();
            producto.put("CodigoProducto", Integer.parseInt((String) modeloTabla.getValueAt(i, 0)));
            producto.put("Cantidad", (Integer) modeloTabla.getValueAt(i, 2));
            productos.add(producto);
        }

        boolean exito = controlador.registrarSalida(codigoVenta, codigoEmpleado, productos);
        if (exito) {
            JOptionPane.showMessageDialog(this, "Salida registrada con éxito");
            limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la salida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     private void limpiarFormulario() {
        cmbCodigoVenta.setSelectedIndex(0);
        cmbCodigoEmpleado.setSelectedIndex(0);
        cmbCodigoProducto.setSelectedIndex(0);
        txtNombreCliente.setText("");
        txtFechaVenta.setText("");
        txtNombreEmpleado.setText("");
        txtNombreProducto.setText("");
        spnCantidad.setValue(0);
        modeloTabla.setRowCount(0);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCodigoVenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bannerLupita = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCodigoEmpleado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbCodigoProducto = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnRegistrarSalida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1268, 682));
        setMinimumSize(new java.awt.Dimension(1268, 682));
        setPreferredSize(new java.awt.Dimension(1268, 682));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setBackground(new java.awt.Color(0, 51, 51));
        jButton21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Volver");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 48)); // NOI18N
        jLabel1.setText("Registro de Salida de Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, 40));

        jLabel4.setText("Código de Venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        cmbCodigoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel5.setText("Nombre del Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        bannerLupita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bannerLupita.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bannerLupita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bannerLupita.setMaximumSize(new java.awt.Dimension(1265, 568));
        bannerLupita.setMinimumSize(new java.awt.Dimension(1265, 568));
        bannerLupita.setPreferredSize(new java.awt.Dimension(1265, 568));
        getContentPane().add(bannerLupita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 190));
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 100, -1));

        jLabel6.setText("Fecha de Venta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));
        getContentPane().add(txtFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 110, -1));

        jLabel7.setText("Codigo del Empleado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        cmbCodigoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel8.setText("Nombre de Empleado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));
        getContentPane().add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 110, -1));

        jLabel9.setText("Código del Producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        cmbCodigoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        jLabel10.setText("Nombre del Producto");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 90, -1));

        jLabel11.setText("Cantidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 20));
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, 30));

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, 140));

        btnRegistrarSalida.setText("Registrar Salida");
        getContentPane().add(btnRegistrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, -1, -1));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        MenuAdministrador m = new MenuAdministrador();
        m.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroSalidaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroSalidaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bannerLupita;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JComboBox<String> cmbCodigoEmpleado;
    private javax.swing.JComboBox<String> cmbCodigoProducto;
    private javax.swing.JComboBox<String> cmbCodigoVenta;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}
