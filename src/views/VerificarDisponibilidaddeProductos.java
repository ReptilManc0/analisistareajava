package views;

import Controllers.*;
import model.Clientes;
import model.Productos;
import model.Ventas;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
        MostarInventario();
        ajustarImagen(bannerLupita, "src/Imagenes/banner_lupita.png");
    }
    
      private void ajustarImagen(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }

    
    
    
    public void MostarInventario(){
        DefaultTableModel t = new DefaultTableModel();
        jTableInventario.setModel(t);
        jComboBoxStock.removeAllItems();
        Proveedores pr = new Proveedores();
       ArrayList<String> s = pr.ObtenerIDsProveedores();
        for (String sr : s) {
            jComboBoxStock.addItem(sr);
        }
        
        ControllerDisponibilidadProducto p = new ControllerDisponibilidadProducto();
        jTableInventario.setModel(p.MostrarInventario());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jTextNombreProducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextPrecioProducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextStock = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFentrega = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFsalida = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBoxStock = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bannerLupita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(0, 51, 51));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Agregar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInventarioMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableInventario);
        if (jTableInventario.getColumnModel().getColumnCount() > 0) {
            jTableInventario.getColumnModel().getColumn(0).setResizable(false);
            jTableInventario.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableInventario.getColumnModel().getColumn(1).setResizable(false);
            jTableInventario.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableInventario.getColumnModel().getColumn(2).setResizable(false);
            jTableInventario.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableInventario.getColumnModel().getColumn(2).setHeaderValue("Descripción");
            jTableInventario.getColumnModel().getColumn(3).setResizable(false);
            jTableInventario.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableInventario.getColumnModel().getColumn(3).setHeaderValue("Categoría");
            jTableInventario.getColumnModel().getColumn(4).setResizable(false);
            jTableInventario.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableInventario.getColumnModel().getColumn(4).setHeaderValue("Precio Unitario");
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

        jTextStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextStockKeyReleased(evt);
            }
        });

        jLabel24.setText("Stock");

        jLabel25.setText("Codigo de Proveedor");

        jTextFentrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFentregaKeyReleased(evt);
            }
        });

        jLabel26.setText("Fecha de Entrega");

        jTextFsalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFsalidaKeyReleased(evt);
            }
        });

        jLabel27.setText("Fecha de Salida");

        jButton21.setBackground(new java.awt.Color(0, 51, 51));
        jButton21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Volver");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("VERIFICAR DISPONIBILIDAD DE PRODUCTOS");

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductosLayout.createSequentialGroup()
                                    .addComponent(jButton11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton21))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                                        .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jComboBoxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFentrega, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)))))
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel10)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(25, 25, 25))
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ProductosLayout.createSequentialGroup()
                                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ProductosLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProductosLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupitalogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 140));

        bannerLupita.setText("jLabel8");
        bannerLupita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bannerLupita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bannerLupita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
   
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTableInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInventarioMouseClicked
    
    }//GEN-LAST:event_jTableInventarioMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ControllerDisponibilidadProducto i = new ControllerDisponibilidadProducto();
        
        i.addProducto(jTextNombreProducto.getText(), jTextPrecioProducto.getText(), jTextStock.getText(), (
                jComboBoxStock.getSelectedItem()).toString(), jTextFentrega.getText(), jTextFsalida.getText());
        
        MostarInventario();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoActionPerformed

    private void jTextNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoKeyReleased

    private void jTextNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProductoKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProductoKeyTyped

    private void jTextPrecioProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioProductoKeyReleased

    private void jTextStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextStockKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStockKeyReleased

    private void jTextFentregaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFentregaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFentregaKeyReleased

    private void jTextFsalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFsalidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFsalidaKeyReleased

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
    private javax.swing.JPanel Productos;
    private javax.swing.JLabel bannerLupita;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JComboBox<String> jComboBoxStock;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JTextField jTextFentrega;
    private javax.swing.JTextField jTextFsalida;
    private javax.swing.JTextField jTextNombreProducto;
    private javax.swing.JTextField jTextPrecioProducto;
    private javax.swing.JTextField jTextStock;
    // End of variables declaration//GEN-END:variables
}
