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

public class DetallesVentaView extends javax.swing.JFrame {

    public DetallesVentaView(String id) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Gestor de inventario");

        Font font = new Font("Georgia", Font.ITALIC, 14);
        UIManager.put("OptionPane.messageFont", font);
        MostarInventario(id);
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

    
    
    
    public void MostarInventario(String id){
        DefaultTableModel t = new DefaultTableModel();
        jTableInventario.setModel(t);
        
        VentanaPrincipalController v = new VentanaPrincipalController();
        
        
        
        
        jTableInventario.setModel(v.MostrarDetalleVenta(id));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bannerLupita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("DETALLES DE VENTA");

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel10)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void jTableInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInventarioMouseClicked
    
    }//GEN-LAST:event_jTableInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(DetallesVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesVentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String id ="";
                new DetallesVentaView(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Productos;
    private javax.swing.JLabel bannerLupita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableInventario;
    // End of variables declaration//GEN-END:variables
}
