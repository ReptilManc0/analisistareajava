package controllers;

import java.util.List;
import model.PedidoModel;
import java.util.Map;
import views.AdmPedido;
import views.DetallePedido;

public class AdmPedidoController {
    
    private PedidoModel modelo;
    private AdmPedido vista;
    
    public AdmPedidoController(AdmPedido vista){
        this.modelo = new PedidoModel();
        this.vista = vista;
    }
    
    public void cargarDetallesPedidos() {
        List<Map<String, Object>> detalles = modelo.obtenerAdmPedidoVenta();
        vista.mostrarDetallesPedidos(detalles);
    }
    
    public List<Map<String, Object>> obtenerDetallesPedido(int codigoVenta) {
    return modelo.obtenerDetallesPedido(codigoVenta);
}
    
    /*public void abrirVentanaDetallePedido(int codigoVenta) {
        List<Map<String, Object>> detalles = modelo.obtenerDetallesPedido(codigoVenta);
        DetallePedido detallePedido = new DetallePedido(codigoVenta, detalles);
        detallePedido.setVisible(true);
    }*/
}
