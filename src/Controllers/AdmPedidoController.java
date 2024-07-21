package controllers;

//import model.AdmPedido;
import java.util.ArrayList;
/*import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;*/
import javax.swing.table.DefaultTableModel;
import model.Ventas;

public class AdmPedidoController {
    
    
     public DefaultTableModel MostrarVentas() {

        DefaultTableModel tabla = new DefaultTableModel();

        Ventas pr = new Ventas();
        ArrayList<Ventas> prlist = pr.ReadVentas();
        tabla.setColumnIdentifiers(new Object[]{"CodigoVenta", "CodigoCliente", "FechaVenta", "ImporteFinal"});
        try {
            for (Ventas p : prlist) {
                tabla.addRow(new Object[]{(p.CodigoVenta), (p.CodigoCliente), (p.FechaVenta), (p.ImporteFinal)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }
     
    /*public DefaultTableModel mostrarAdmPedidoVenta() {

        DefaultTableModel tabla = new DefaultTableModel();

        AdmPedido pr = new AdmPedido();
        ArrayList<AdmPedido> listAdmPedidoVenta = pr.obtenerAdmPedidoVenta();
        tabla.setColumnIdentifiers(new Object[]{"CodigoVenta", "CodigoCliente", "FechaVenta", "ImporteFinal"});
        try {
            for (AdmPedido p : listAdmPedidoVenta) {
                tabla.addRow(new Object[]{(p.CodigoVenta), (p.CodigoCliente), (p.FechaVenta), (p.ImporteFinal)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }*/
    
    
    
    
    
    /*private  views.AdmPedido vista;
    private ArrayList<model.AdmPedido> listaVentas;

    public AdmPedidoController(AdmPedido vista) {
        this.vista = vista;
        inicializar();
    }

    private void inicializar() {
        // Obtener las ventas desde el modelo
        listaVentas = model.AdmPedido.obtenerAdmPedidoVenta();
        
        // Convertir la lista de ventas a un arreglo de objetos para actualizar la tabla
        Object[][] datosVentas = new Object[listaVentas.size()][4];
        for (int i = 0; i < listaVentas.size(); i++) {
            model.AdmPedido venta = listaVentas.get(i);
            datosVentas[i][0] = venta.getCodigoVenta();
            datosVentas[i][1] = venta.getNombreCliente();
            datosVentas[i][2] = venta.getFechaVenta();
            datosVentas[i][3] = venta.getImporteFinal();
        }
        
        // Actualizar la vista con las ventas obtenidas
        vista.actualizarTablaVentas(datosVentas);

        // Agregar listener para el doble clic en la tabla
        vista.getTableVentaAdmPedido().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = vista.getTableVentaAdmPedido().getSelectedRow();
                    String codigoVenta = vista.getTableVentaAdmPedido().getValueAt(row, 0).toString();
                    // Aquí puedes llamar a otro método para mostrar los detalles de la venta
                    mostrarDetallesVenta(codigoVenta);
                }
            }
        });
    }

    private void mostrarDetallesVenta(String codigoVenta) {
        // Aquí implementas la lógica para mostrar los detalles de la venta
        // Puedes crear una nueva ventana o actualizar una existente con los detalles
    }

    public static void main(String[] args) {
        AdmPedido vista = new AdmPedido();
        new AdmPedidoController(vista);
        vista.setVisible(true);
    }*/
}
