package views;

import Controllers.VentanaPrincipalController;
import model.Clientes;
import model.Productos;
import model.Ventas;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Proveedores;

public class VerificarDisponibilidaddeProductos extends javax.swing.JFrame {

    public VerificarDisponibilidaddeProductos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Gestor de inventario");

        Font font = new Font("Georgia", Font.ITALIC, 14);
        UIManager.put("OptionPane.messageFont", font);
        MostrarProveedores();
        MostrarClientes();
        MostrarProductos();
        MostrarVentas();

    }

    /*  private void CargarNombresProveedores() {
        Proveedores nombreProveedores = new Proveedores();
        // Obtener los nombres de los proveedores
        ResultSet resultSetProveedores = nombreProveedores.Consultar("SELECT Nombre FROM proveedor");
        try {
            // Crear un modelo para el JComboBox
            DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();

            // Agregar los nombres de los proveedores al modelo
            while (resultSetProveedores.next()) {
                String nombreProveedor = resultSetProveedores.getString("Nombre");
                modeloCombo.addElement(nombreProveedor);
            }

            // Asignar el modelo al JComboBox
            jComboProveedorProducto.setModel(modeloCombo);
        } catch (SQLException e) {
            // Manejar cualquier excepción
            e.printStackTrace();
        }
    }
     */
 /*
    private void CargarNombresClientes() {
        Clientes nombreClientes = new Clientes();
        // Obtener los nombres de los clientes
        ResultSet resultSetClientes = nombreClientes.Consultar("SELECT Nombre FROM clientes");
        try {
            // Crear un modelo para el JComboBox
            DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();

            // Agregar los nombres de los clientes al modelo
            while (resultSetClientes.next()) {
                String nombreCliente = resultSetClientes.getString("Nombre");
                modeloCombo.addElement(nombreCliente);
            }

            // Asignar el modelo al JComboBox
            jComboClienteVentas.setModel(modeloCombo);
        } catch (SQLException e) {
            // Manejar cualquier excepción
            e.printStackTrace();
        }
    }
     */
    //Validacion de Correo
    //Validacion general
    public void LimpiarClientes() {
        JtextNombreCliente.setText("");
        jTextDNICliente.setText("");
        jtextApellidoCliente.setText("");
        jTextCorreoCliente.setText("");
        jTelefonoCliente.setText("");
    }

    public void LimpiarProveedor() {
        jTextNombreProvee.setText("");
        jTextRUCProve.setText("");
        jTextTelfProvee.setText("");
        jTextCorreoProvee.setText("");

    }

    public void LimpiarProductos() {
        jTextIDProducto.setText("");
        jTextNombreProducto.setText("");
        jTextPrecioProducto.setText("");

    }

    public void LimpiarVenta() {
        jTextIDVentas.setText("");
        jTextFieldFechaVenta.setText("");

        jTextMontoTotalVentas.setText("");
    }

    public void MostrarClientes() {
        DefaultTableModel t = new DefaultTableModel();
        jTableCliente.setModel(t);
        VentanaPrincipalController p = new VentanaPrincipalController();
        jTableCliente.setModel(p.MostrarClientes());
    }

    public void MostrarProductos() {
        DefaultTableModel t = new DefaultTableModel();
        jTableProductos.setModel(t);
        VentanaPrincipalController p = new VentanaPrincipalController();
        jTableProductos.setModel(p.MostrarProductos());

    }

    public void MostrarProveedores() {
        DefaultTableModel t = new DefaultTableModel();
        jTableProveedor.setModel(t);
        VentanaPrincipalController p = new VentanaPrincipalController();
        jTableProveedor.setModel(p.MostrarProveedores());
    }

    public void MostrarVentas() {
        jComboClienteVentas.removeAllItems();
        DefaultTableModel t = new DefaultTableModel();
        jTableVentas.setModel(t);
        Clientes c = new Clientes();
        ArrayList<String> l = c.ObtenerIDsClientes();
        for (String s : l) {
            jComboClienteVentas.addItem(s);
        }

        VentanaPrincipalController p = new VentanaPrincipalController();
        jTableVentas.setModel(p.MostrarVentas());
    }
       public void MostrarEmpleado() {
       
        DefaultTableModel t = new DefaultTableModel();
        jTableEmpleado.setModel(t);

        VentanaPrincipalController p = new VentanaPrincipalController();
        jTableEmpleado.setModel(p.MostrarEmpleado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        Pestañas = new javax.swing.JTabbedPane();
        Productos = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextNombreProducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextPrecioProducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        BotonActualizarProducto = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextIDProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton1.setText("Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton7.setText("Cerrar sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 0, 204));
        jButton24.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton24.setText("Productos");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 0, 204));
        jButton25.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton25.setText("Clientes");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(204, 0, 204));
        jButton37.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton37.setText("Ventas");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 200, 780));

        Pestañas.setBackground(new java.awt.Color(153, 153, 153));
        Pestañas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Pestañas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PestañasStateChanged(evt);
            }
        });

        jLabel21.setText("ID");

        jTextNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreProductoActionPerformed(evt);
            }
        });
        jTextNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreProductoKeyTyped(evt);
            }
        });

        jLabel22.setText("Nombre");

        jTextPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPrecioProductoKeyReleased(evt);
            }
        });

        jLabel23.setText("Precio");

        jButton11.setBackground(new java.awt.Color(0, 51, 51));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Agregar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Categoría", "Precio Unitario", "Fecha de Agregación", "Cantidad en Stock", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableProductos.getColumnModel().getColumn(2).setHeaderValue("Descripción");
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableProductos.getColumnModel().getColumn(3).setHeaderValue("Categoría");
            jTableProductos.getColumnModel().getColumn(4).setResizable(false);
            jTableProductos.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableProductos.getColumnModel().getColumn(4).setHeaderValue("Precio Unitario");
        }

        jButton20.setBackground(new java.awt.Color(0, 51, 51));
        jButton20.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Eliminar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        BotonActualizarProducto.setBackground(new java.awt.Color(0, 51, 51));
        BotonActualizarProducto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BotonActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarProducto.setText("Actualizar");
        BotonActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarProductoActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 51, 51));
        jButton30.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Mostrar todo");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jTextIDProducto.setEnabled(false);
        jTextIDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel21))
                            .addComponent(jTextIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductosLayout.createSequentialGroup()
                            .addComponent(jButton11)
                            .addGap(12, 12, 12)
                            .addComponent(BotonActualizarProducto)
                            .addGap(12, 12, 12)
                            .addComponent(jButton20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton30))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton20)
                    .addComponent(BotonActualizarProducto)
                    .addComponent(jButton30))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        Pestañas.addTab("Productos", Productos);

        getContentPane().add(Pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1060, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Giraldos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1080, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        InicioDeSesion ini = new InicioDeSesion();
        ini.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed

    }//GEN-LAST:event_jButton37ActionPerformed

    private void PestañasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PestañasStateChanged
        MostrarProveedores();
        MostrarClientes();
        MostrarProductos();
        MostrarVentas();
    }//GEN-LAST:event_PestañasStateChanged

    private void jTextIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDProductoActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        MostrarProductos();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void BotonActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarProductoActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();
        p.UpdateProducto(jTextIDProducto.getText(), jTextNombreProducto.getText(), jTextPrecioProducto.getText());
        MostrarProductos();
    }//GEN-LAST:event_BotonActualizarProductoActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();
        p.deleteProducto(jTextIDProducto.getText());
        MostrarProductos();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int filaSeleccionada = jTableProductos.rowAtPoint(evt.getPoint());

        //evento para seleccionar una fila
        jTextIDProducto.setText(jTableProductos.getValueAt(filaSeleccionada, 0).toString());
        jTextNombreProducto.setText(jTableProductos.getValueAt(filaSeleccionada, 1).toString());
        jTextPrecioProducto.setText(jTableProductos.getValueAt(filaSeleccionada, 2).toString());
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        VentanaPrincipalController v = new VentanaPrincipalController();
        v.AddProducto(jTextNombreProducto.getText(), jTextPrecioProducto.getText());
        MostrarProductos();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextPrecioProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioProductoKeyReleased

    private void jTextNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProductoKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoKeyTyped

    private void jTextNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoKeyReleased

    private void jTextNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoActionPerformed

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
            java.util.logging.Logger.getLogger(VerificarDisponibilidaddeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificarDisponibilidaddeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificarDisponibilidaddeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificarDisponibilidaddeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificarDisponibilidaddeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarProducto;
    public javax.swing.JTabbedPane Pestañas;
    private javax.swing.JPanel Productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextIDProducto;
    private javax.swing.JTextField jTextNombreProducto;
    private javax.swing.JTextField jTextPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
