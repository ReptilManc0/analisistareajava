package Controllers;

import model.SalidaProductoModel;
import java.util.List;
import java.util.Map;

public class SalidaProductoController {
    private SalidaProductoModel modelo;

    public SalidaProductoController() {
        this.modelo = new SalidaProductoModel();
    }

    public List<Map<String, Object>> obtenerVentas() {
        return modelo.obtenerVentas();
    }

    public Map<String, Object> obtenerDetallesVenta(int codigoVenta) {
        return modelo.obtenerDetallesVenta(codigoVenta);
    }

    public List<Map<String, Object>> obtenerEmpleados() {
        return modelo.obtenerEmpleados();
    }

    public List<Map<String, Object>> obtenerProductos() {
        return modelo.obtenerProductos();
    }

    public boolean registrarSalida(int codigoVenta, int codigoEmpleado, List<Map<String, Object>> productos) {
        return modelo.registrarSalida(codigoVenta, codigoEmpleado, productos);
    }
}