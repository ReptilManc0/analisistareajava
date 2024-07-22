package views;

import Controllers.VentanaPrincipalController;
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

public class MenuAdministrador extends javax.swing.JFrame {

    public MenuAdministrador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Menú Principal");

        Font font = new Font("Georgia", Font.ITALIC, 14);
        UIManager.put("OptionPane.messageFont", font);
        MostrarProveedores();
        MostrarClientes();
        MostrarProductos();
        MostrarVentas();
        MostrarEmpleado();
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        Pestañas = new javax.swing.JTabbedPane();
        Proveedores = new javax.swing.JPanel();
        jTextNombreProvee = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonAgregarProveedor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProveedor = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jTextTelfProvee = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextCorreoProvee = new javax.swing.JTextField();
        jButtonEliminarProveedor = new javax.swing.JButton();
        jTextRUCProve = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
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
        jTextIDProducto = new javax.swing.JTextField();
        Clientes = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JtextNombreCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtextApellidoCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextDNICliente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTelefonoCliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextCorreoCliente = new javax.swing.JTextField();
        BotonActualizarCliente = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jTextIDCLiente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Ventas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextMontoTotalVentas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboClienteVentas = new javax.swing.JComboBox<>();
        BotonActualizarVentas = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jTextIDVentas = new javax.swing.JTextField();
        jButtonVerDetallesVentas = new javax.swing.JButton();
        jTextFieldFechaVenta = new javax.swing.JTextField();
        Ventas1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDNIEmpleado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        BotonActualizarVentas1 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jTextIDEmpleados = new javax.swing.JTextField();
        jTextFieldNombreEmpleado = new javax.swing.JTextField();
        jTextFieldRol = new javax.swing.JTextField();
        jTextFieldCorreoEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTelefonoEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bannerLupita = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 48)); // NOI18N
        jLabel10.setText("PANEL DE ADMINISTRADOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton1.setLabel("Verificar Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton7.setText("Cerrar sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 204, 255));
        jButton24.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton24.setText("Pedido al Proveedor");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 204, 255));
        jButton25.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton25.setText("Administrar Pedido");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(204, 204, 255));
        jButton37.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton37.setText("Registrar Salida de Producto");
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

        jTextNombreProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreProveeActionPerformed(evt);
            }
        });
        jTextNombreProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreProveeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreProveeKeyTyped(evt);
            }
        });

        jLabel13.setText("Nombre");

        jLabel14.setText("ID");

        jButtonAgregarProveedor.setBackground(new java.awt.Color(0, 51, 51));
        jButtonAgregarProveedor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonAgregarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarProveedor.setText("Agregar");
        jButtonAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProveedorActionPerformed(evt);
            }
        });

        jTableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Proveedor", "Nombre de Proveedor", "Correo Electrónico", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProveedor);
        if (jTableProveedor.getColumnModel().getColumnCount() > 0) {
            jTableProveedor.getColumnModel().getColumn(0).setResizable(false);
            jTableProveedor.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableProveedor.getColumnModel().getColumn(1).setResizable(false);
            jTableProveedor.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableProveedor.getColumnModel().getColumn(2).setResizable(false);
            jTableProveedor.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableProveedor.getColumnModel().getColumn(3).setPreferredWidth(30);
        }
        jTableProveedor.getAccessibleContext().setAccessibleName("");

        jLabel28.setText("Teléfono");

        jTextTelfProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextTelfProveeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelfProveeKeyTyped(evt);
            }
        });

        jLabel29.setText("Correo Electrónico");

        jTextCorreoProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCorreoProveeKeyReleased(evt);
            }
        });

        jButtonEliminarProveedor.setBackground(new java.awt.Color(0, 51, 51));
        jButtonEliminarProveedor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarProveedor.setText("Eliminar");
        jButtonEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProveedorActionPerformed(evt);
            }
        });

        jTextRUCProve.setEnabled(false);
        jTextRUCProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRUCProveActionPerformed(evt);
            }
        });
        jTextRUCProve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextRUCProveKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRUCProveKeyTyped(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProveedoresLayout = new javax.swing.GroupLayout(Proveedores);
        Proveedores.setLayout(ProveedoresLayout);
        ProveedoresLayout.setHorizontalGroup(
            ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProveedoresLayout.createSequentialGroup()
                        .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextRUCProve, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(52, 52, 52)
                        .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTextNombreProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTelfProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(52, 52, 52)
                        .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jTextCorreoProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ProveedoresLayout.createSequentialGroup()
                        .addComponent(jButtonAgregarProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarProveedor)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        ProveedoresLayout.setVerticalGroup(
            ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextRUCProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNombreProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTelfProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextCorreoProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarProveedor)
                    .addComponent(jButton2)
                    .addComponent(jButtonEliminarProveedor))
                .addGap(37, 37, 37))
        );

        Pestañas.addTab("Proveedores", Proveedores);

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
                    .addGroup(ProductosLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(12, 12, 12)
                        .addComponent(BotonActualizarProducto)
                        .addGap(12, 12, 12)
                        .addComponent(jButton20))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addComponent(BotonActualizarProducto))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        Pestañas.addTab("Productos", Productos);

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Agregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 51, 51));
        jButton14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Eliminar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre");

        JtextNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextNombreClienteActionPerformed(evt);
            }
        });
        JtextNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtextNombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtextNombreClienteKeyTyped(evt);
            }
        });

        jLabel16.setText("Apellidos");

        jtextApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtextApellidoClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextApellidoClienteKeyTyped(evt);
            }
        });

        jLabel17.setText("DNI");

        jTextDNICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNIClienteActionPerformed(evt);
            }
        });
        jTextDNICliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDNIClienteKeyTyped(evt);
            }
        });

        jLabel20.setText("Teléfono");

        jTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTelefonoClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoClienteKeyTyped(evt);
            }
        });

        jLabel25.setText("Correo Electrónico");

        jTextCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCorreoClienteKeyReleased(evt);
            }
        });

        BotonActualizarCliente.setBackground(new java.awt.Color(0, 51, 51));
        BotonActualizarCliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BotonActualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarCliente.setText("Actualizar");
        BotonActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarClienteActionPerformed(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "DNI", "Correo Electrónico", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.setCellSelectionEnabled(true);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTableCliente);
        jTableCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setResizable(false);
            jTableCliente.getColumnModel().getColumn(1).setResizable(false);
            jTableCliente.getColumnModel().getColumn(2).setResizable(false);
            jTableCliente.getColumnModel().getColumn(3).setResizable(false);
            jTableCliente.getColumnModel().getColumn(4).setResizable(false);
            jTableCliente.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextIDCLiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextIDCLienteKeyReleased(evt);
            }
        });

        jLabel26.setText("ID");

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jTextIDCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtextNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtextApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jTextCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonActualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextIDCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JtextNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtextApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ClientesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(BotonActualizarCliente)
                    .addComponent(jButton14))
                .addGap(55, 55, 55))
        );

        Pestañas.addTab("Clientes", Clientes);

        jLabel3.setText("Fecha");

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "FechaVenta", "ImporteFinal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVentas);
        if (jTableVentas.getColumnModel().getColumnCount() > 0) {
            jTableVentas.getColumnModel().getColumn(0).setResizable(false);
            jTableVentas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableVentas.getColumnModel().getColumn(1).setResizable(false);
            jTableVentas.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableVentas.getColumnModel().getColumn(2).setResizable(false);
            jTableVentas.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Eliminar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel1.setText("Monto Total");

        jTextMontoTotalVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextMontoTotalVentasKeyReleased(evt);
            }
        });

        jLabel15.setText("Cliente");

        BotonActualizarVentas.setBackground(new java.awt.Color(0, 51, 51));
        BotonActualizarVentas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BotonActualizarVentas.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarVentas.setText("Actualizar");
        BotonActualizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarVentasActionPerformed(evt);
            }
        });

        jLabel74.setText("ID");

        jTextIDVentas.setEditable(false);
        jTextIDVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDVentasActionPerformed(evt);
            }
        });

        jButtonVerDetallesVentas.setBackground(new java.awt.Color(0, 51, 51));
        jButtonVerDetallesVentas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonVerDetallesVentas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerDetallesVentas.setText("Ver Detalles de Venta");
        jButtonVerDetallesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerDetallesVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel74))
                            .addComponent(jTextIDVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(jComboClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMontoTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(12, 12, 12)
                                .addComponent(BotonActualizarVentas)
                                .addGap(12, 12, 12)
                                .addComponent(jButton13)
                                .addGap(582, 582, 582)
                                .addComponent(jButtonVerDetallesVentas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextIDVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMontoTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton13)
                    .addComponent(BotonActualizarVentas)
                    .addComponent(jButtonVerDetallesVentas))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        Pestañas.addTab("Ventas", Ventas);

        jLabel4.setText("Rol");

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "FechaVenta", "ImporteFinal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpleado.setEnabled(false);
        jTableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEmpleado);
        if (jTableEmpleado.getColumnModel().getColumnCount() > 0) {
            jTableEmpleado.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableEmpleado.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableEmpleado.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpleado.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 51, 51));
        jButton15.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Eliminar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI");

        jTextFieldDNIEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDNIEmpleadoKeyReleased(evt);
            }
        });

        jLabel18.setText("Nombre");

        BotonActualizarVentas1.setBackground(new java.awt.Color(0, 51, 51));
        BotonActualizarVentas1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BotonActualizarVentas1.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizarVentas1.setText("Actualizar");
        BotonActualizarVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarVentas1ActionPerformed(evt);
            }
        });

        jLabel75.setText("ID");

        jTextIDEmpleados.setEnabled(false);
        jTextIDEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDEmpleadosActionPerformed(evt);
            }
        });

        jTextFieldCorreoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoEmpleadoKeyReleased(evt);
            }
        });

        jLabel7.setText("Correo");

        jTextFieldTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoEmpleadoKeyReleased(evt);
            }
        });

        jLabel9.setText("Monto Total");

        javax.swing.GroupLayout Ventas1Layout = new javax.swing.GroupLayout(Ventas1);
        Ventas1.setLayout(Ventas1Layout);
        Ventas1Layout.setHorizontalGroup(
            Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventas1Layout.createSequentialGroup()
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ventas1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel75))
                            .addComponent(jTextIDEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldDNIEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Ventas1Layout.createSequentialGroup()
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Ventas1Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(12, 12, 12)
                                .addComponent(BotonActualizarVentas1)
                                .addGap(12, 12, 12)
                                .addComponent(jButton15)
                                .addGap(125, 125, 125))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        Ventas1Layout.setVerticalGroup(
            Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventas1Layout.createSequentialGroup()
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Ventas1Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Ventas1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextIDEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventas1Layout.createSequentialGroup()
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDNIEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventas1Layout.createSequentialGroup()
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(BotonActualizarVentas1))
                    .addComponent(jButton15))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        Pestañas.addTab("Empleados", Ventas1);

        getContentPane().add(Pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1060, 610));

        bannerLupita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bannerLupita.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bannerLupita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bannerLupita.setMaximumSize(new java.awt.Dimension(1265, 568));
        bannerLupita.setMinimumSize(new java.awt.Dimension(1265, 568));
        bannerLupita.setPreferredSize(new java.awt.Dimension(1265, 568));
        getContentPane().add(bannerLupita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupitalogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        InicioDeSesion ini = new InicioDeSesion();
        ini.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VerificarDisponibilidaddeProductos v = new VerificarDisponibilidaddeProductos();
        v.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        PedidoProveedorview v = new PedidoProveedorview();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        AdmPedido v = new AdmPedido();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        RegistroSalidaProducto v = new RegistroSalidaProducto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void PestañasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PestañasStateChanged
        MostrarProveedores();
        MostrarClientes();
        MostrarProductos();
        MostrarVentas();
    }//GEN-LAST:event_PestañasStateChanged

    private void jButtonVerDetallesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerDetallesVentasActionPerformed
        DetallesVentaView dv= new DetallesVentaView(jTextIDVentas.getText());
        dv.setVisible(true);
        
    }//GEN-LAST:event_jButtonVerDetallesVentasActionPerformed

    private void jTextIDVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDVentasActionPerformed

    private void BotonActualizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarVentasActionPerformed
        VentanaPrincipalController v = new VentanaPrincipalController();
        v.UpdateVenta(jTextIDVentas.getText(), (jComboClienteVentas.getSelectedItem()).toString(), jTextFieldFechaVenta.getText(), jTextMontoTotalVentas.getText());
        MostrarVentas();
    }//GEN-LAST:event_BotonActualizarVentasActionPerformed

    private void jTextMontoTotalVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMontoTotalVentasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMontoTotalVentasKeyReleased

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        VentanaPrincipalController v = new VentanaPrincipalController();
        v.deleteVenta(jTextIDVentas.getText());
        MostrarVentas();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        VentanaPrincipalController v = new VentanaPrincipalController();
        v.AddVenta((jComboClienteVentas.getSelectedItem()).toString(), jTextFieldFechaVenta.getText(), jTextMontoTotalVentas.getText());
        MostrarVentas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTableVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentasMouseClicked

        int filaSeleccionada = jTableVentas.rowAtPoint(evt.getPoint());
        //evento para seleccionar una fila
        jTextIDVentas.setText(jTableVentas.getValueAt(filaSeleccionada, 0).toString());
        jComboClienteVentas.setSelectedItem(jTableVentas.getValueAt(filaSeleccionada, 1).toString());
        jTextFieldFechaVenta.setText(jTableVentas.getValueAt(filaSeleccionada, 2).toString());

        jTextMontoTotalVentas.setText(jTableVentas.getValueAt(filaSeleccionada, 3).toString());
    }//GEN-LAST:event_jTableVentasMouseClicked

    private void jTextIDCLienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIDCLienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDCLienteKeyReleased

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int filaSeleccionada = jTableCliente.rowAtPoint(evt.getPoint());
        //evento para seleccionar una fila
        jTextIDCLiente.setText(jTableCliente.getValueAt(filaSeleccionada, 0).toString());
        JtextNombreCliente.setText(jTableCliente.getValueAt(filaSeleccionada, 1).toString());
        jtextApellidoCliente.setText(jTableCliente.getValueAt(filaSeleccionada, 2).toString());
        jTextDNICliente.setText(jTableCliente.getValueAt(filaSeleccionada, 3).toString());
        jTextCorreoCliente.setText(jTableCliente.getValueAt(filaSeleccionada, 4).toString());
        jTelefonoCliente.setText(jTableCliente.getValueAt(filaSeleccionada, 5).toString());
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void BotonActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarClienteActionPerformed
        VentanaPrincipalController c = new VentanaPrincipalController();
        c.UpdateCliente(jTextIDCLiente.getText(), JtextNombreCliente.getText(), jtextApellidoCliente.getText(), jTextDNICliente.getText(), jTextCorreoCliente.getText(), jTelefonoCliente.getText());
        MostrarClientes();
    }//GEN-LAST:event_BotonActualizarClienteActionPerformed

    private void jTextCorreoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCorreoClienteKeyReleased

    }//GEN-LAST:event_jTextCorreoClienteKeyReleased

    private void jTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoClienteKeyTyped
        if (jTelefonoCliente.getText().length() >= 9) {
            evt.consume();
        }

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoClienteKeyTyped

    private void jTelefonoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoClienteKeyReleased

    }//GEN-LAST:event_jTelefonoClienteKeyReleased

    private void jTextDNIClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIClienteKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
        }
        if (jTextDNICliente.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextDNIClienteKeyTyped

    private void jTextDNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDNIClienteActionPerformed

    private void jtextApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextApellidoClienteKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtextApellidoClienteKeyTyped

    private void jtextApellidoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextApellidoClienteKeyReleased

    }//GEN-LAST:event_jtextApellidoClienteKeyReleased

    private void JtextNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtextNombreClienteKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_JtextNombreClienteKeyTyped

    private void JtextNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtextNombreClienteKeyReleased

    }//GEN-LAST:event_JtextNombreClienteKeyReleased

    private void JtextNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextNombreClienteActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        VentanaPrincipalController c = new VentanaPrincipalController();
        c.deleteCliente(jTextIDCLiente.getText());
        MostrarClientes();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        VentanaPrincipalController c = new VentanaPrincipalController();
        c.AddCliente(JtextNombreCliente.getText(), jtextApellidoCliente.getText(), jTextDNICliente.getText(), jTextCorreoCliente.getText(), jTelefonoCliente.getText());
        MostrarClientes();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDProductoActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();
        p.UpdateProveedor(jTextRUCProve.getText(), jTextNombreProvee.getText(), jTextCorreoProvee.getText(), jTextTelfProvee.getText());
        MostrarProveedores();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextRUCProveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRUCProveKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextRUCProveKeyTyped

    private void jTextRUCProveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRUCProveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRUCProveKeyReleased

    private void jTextRUCProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRUCProveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRUCProveActionPerformed

    private void jButtonEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProveedorActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();
        p.deleteProveedor(jTextRUCProve.getText());
        MostrarProveedores();
    }//GEN-LAST:event_jButtonEliminarProveedorActionPerformed

    private void jTextCorreoProveeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCorreoProveeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoProveeKeyReleased

    private void jTextTelfProveeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelfProveeKeyTyped
        if (jTextTelfProvee.getText().length() >= 9) {
            evt.consume();
        }
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelfProveeKeyTyped

    private void jTextTelfProveeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelfProveeKeyReleased

    }//GEN-LAST:event_jTextTelfProveeKeyReleased

    private void jTableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProveedorMouseClicked

        int filaSeleccionada = jTableProveedor.rowAtPoint(evt.getPoint());

        //evento para seleccionar una fila
        jTextRUCProve.setText(jTableProveedor.getValueAt(filaSeleccionada, 0).toString());
        jTextNombreProvee.setText(jTableProveedor.getValueAt(filaSeleccionada, 1).toString());
        jTextCorreoProvee.setText(jTableProveedor.getValueAt(filaSeleccionada, 2).toString());
        jTextTelfProvee.setText(jTableProveedor.getValueAt(filaSeleccionada, 3).toString());
    }//GEN-LAST:event_jTableProveedorMouseClicked

    private void jButtonAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProveedorActionPerformed

        VentanaPrincipalController p = new VentanaPrincipalController();

        p.AddProveedor(jTextNombreProvee.getText(), jTextCorreoProvee.getText(), jTextTelfProvee.getText());

        MostrarProveedores();
    }//GEN-LAST:event_jButtonAgregarProveedorActionPerformed

    private void jTextNombreProveeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProveeKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProveeKeyTyped

    private void jTextNombreProveeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProveeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProveeKeyReleased

    private void jTextNombreProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreProveeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProveeActionPerformed

    private void jTableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadoMouseClicked
 int filaSeleccionada = jTableProveedor.rowAtPoint(evt.getPoint());

        //evento para seleccionar una fila
        jTextIDEmpleados.setText(jTableEmpleado.getValueAt(filaSeleccionada, 0).toString());
        jTextFieldNombreEmpleado.setText(jTableEmpleado.getValueAt(filaSeleccionada, 1).toString());
        jTextFieldRol.setText(jTableEmpleado.getValueAt(filaSeleccionada, 2).toString());
        jTextFieldDNIEmpleado.setText(jTableEmpleado.getValueAt(filaSeleccionada, 3).toString());    
        jTextFieldCorreoEmpleado.setText(jTableEmpleado.getValueAt(filaSeleccionada, 4).toString());   
        jTextFieldTelefonoEmpleado.setText(jTableEmpleado.getValueAt(filaSeleccionada, 5).toString());    
    }//GEN-LAST:event_jTableEmpleadoMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();

        p.AddEmpleado(jTextFieldNombreEmpleado.getText(), jTextFieldRol.getText(), 
                jTextFieldDNIEmpleado.getText(), jTextFieldCorreoEmpleado.getText(), 
                jTextFieldTelefonoEmpleado.getText());

        MostrarEmpleado();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();

        p.deleteEmpleado(jTextIDEmpleados.getText());

        MostrarEmpleado(); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextFieldDNIEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIEmpleadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIEmpleadoKeyReleased

    private void BotonActualizarVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarVentas1ActionPerformed
        VentanaPrincipalController p = new VentanaPrincipalController();

        p.UpdateEmpleado(jTextIDEmpleados.getText(), jTextFieldNombreEmpleado.getText(), jTextFieldRol.getText(), 
                jTextFieldDNIEmpleado.getText(), jTextFieldCorreoEmpleado.getText(), 
                jTextFieldTelefonoEmpleado.getText());

        MostrarEmpleado();   // TODO add your handling code here:
    }//GEN-LAST:event_BotonActualizarVentas1ActionPerformed

    private void jTextIDEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDEmpleadosActionPerformed

    private void jTextFieldTelefonoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoEmpleadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoEmpleadoKeyReleased

    private void jTextFieldCorreoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoEmpleadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoEmpleadoKeyReleased

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarCliente;
    private javax.swing.JButton BotonActualizarProducto;
    private javax.swing.JButton BotonActualizarVentas;
    private javax.swing.JButton BotonActualizarVentas1;
    private javax.swing.JPanel Clientes;
    private javax.swing.JTextField JtextNombreCliente;
    public javax.swing.JTabbedPane Pestañas;
    private javax.swing.JPanel Productos;
    private javax.swing.JPanel Proveedores;
    private javax.swing.JPanel Ventas;
    private javax.swing.JPanel Ventas1;
    private javax.swing.JLabel bannerLupita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAgregarProveedor;
    private javax.swing.JButton jButtonEliminarProveedor;
    private javax.swing.JButton jButtonVerDetallesVentas;
    private javax.swing.JComboBox<String> jComboClienteVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableProveedor;
    private javax.swing.JTable jTableVentas;
    private javax.swing.JTextField jTelefonoCliente;
    private javax.swing.JTextField jTextCorreoCliente;
    private javax.swing.JTextField jTextCorreoProvee;
    private javax.swing.JTextField jTextDNICliente;
    private javax.swing.JTextField jTextFieldCorreoEmpleado;
    private javax.swing.JTextField jTextFieldDNIEmpleado;
    private javax.swing.JTextField jTextFieldFechaVenta;
    private javax.swing.JTextField jTextFieldNombreEmpleado;
    private javax.swing.JTextField jTextFieldRol;
    private javax.swing.JTextField jTextFieldTelefonoEmpleado;
    private javax.swing.JTextField jTextIDCLiente;
    private javax.swing.JTextField jTextIDEmpleados;
    private javax.swing.JTextField jTextIDProducto;
    private javax.swing.JTextField jTextIDVentas;
    private javax.swing.JTextField jTextMontoTotalVentas;
    private javax.swing.JTextField jTextNombreProducto;
    private javax.swing.JTextField jTextNombreProvee;
    private javax.swing.JTextField jTextPrecioProducto;
    private javax.swing.JTextField jTextRUCProve;
    private javax.swing.JTextField jTextTelfProvee;
    private javax.swing.JTextField jtextApellidoCliente;
    // End of variables declaration//GEN-END:variables
}
