/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.DetallesVentas;
import model.Empleados;
import model.Productos;
import model.Proveedores;
import model.Ventas;

/**
 *
 * @author Cesar
 */
public class VentanaPrincipalController {

    //PROVEEDORES
    public DefaultTableModel MostrarProveedores() {
        DefaultTableModel tabla = new DefaultTableModel();
        Proveedores prov = new Proveedores();
        ArrayList<Proveedores> provlist = prov.ReadProveedor();
        tabla.setColumnIdentifiers(new Object[]{"CodigoProveedor", "NombreProveedor", "CorreoProveedor", "TelefonoProveedor"});
        try {
            for (Proveedores p : provlist) {
                tabla.addRow(new Object[]{(p.CodigoProveedor), (p.NombreProveedor), (p.CorreoProveedor), (p.TelefonoProveedor)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }

    public void AddProveedor(String nombre, String correo, String Telefono) {
        Proveedores p = new Proveedores();
        p.NombreProveedor = nombre;
        p.CorreoProveedor = correo;
        p.TelefonoProveedor = Telefono;
        p.AgregarProveedor();
    }

    public void UpdateProveedor(String id, String nombre, String correo, String Telefono) {
        Proveedores p = new Proveedores();
        p.CodigoProveedor = id;
        p.NombreProveedor = nombre;
        p.CorreoProveedor = correo;
        p.TelefonoProveedor = Telefono;
        p.ActualizarProveedor();
    }

    public void deleteProveedor(String id) {
        Proveedores p = new Proveedores();
        p.CodigoProveedor = id;
        p.EliminarProveedor();
    }

    //PRODUCTOS
    public DefaultTableModel MostrarProductos() {

        DefaultTableModel tabla = new DefaultTableModel();

        Productos pr = new Productos();
        ArrayList<Productos> prlist = pr.ReadProducto();
        tabla.setColumnIdentifiers(new Object[]{"CodigoProducto", "NombreProducto", "Precio"});
        try {
            for (Productos p : prlist) {
                tabla.addRow(new Object[]{(p.CodigoProducto), (p.NombreProducto), (p.Precio)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }

    public void AddProducto(String nombre, String precio) {
        Productos p = new Productos();
        p.NombreProducto = nombre;
        p.Precio = precio;

        p.AgregarProducto();
    }

    public void UpdateProducto(String id, String nombre, String precio) {
        Productos p = new Productos();
        p.CodigoProducto = id;
        p.NombreProducto = nombre;
        p.Precio = precio;
        p.ActualizarProducto();
    }

    public void deleteProducto(String id) {
        Productos p = new Productos();
        p.CodigoProducto = id;
        p.EliminarProducto();
    }

    //CLIENTES
    public DefaultTableModel MostrarClientes() {

        DefaultTableModel tabla = new DefaultTableModel();

        Clientes pr = new Clientes();
        ArrayList<Clientes> prlist = pr.ReadCliente();
        tabla.setColumnIdentifiers(new Object[]{"CodigoCliente", "NombreCliente", "ApellidoCliente", "DNICliente", "CorreoCliente", "TelefonoCliente"});
        try {
            for (Clientes p : prlist) {
                tabla.addRow(new Object[]{(p.CodigoCliente), (p.NombreCliente), (p.ApellidoCliente), (p.DNICliente), (p.CorreoCliente), (p.TelefonoCliente)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }

    public void AddCliente(String nombre, String apellido, String dni, String correo, String telefono) {
        Clientes p = new Clientes();
        p.NombreCliente = nombre;
        p.ApellidoCliente = apellido;
        p.DNICliente = dni;
        p.CorreoCliente = correo;
        p.TelefonoCliente = telefono;

        p.AgregarCliente();
    }

    public void UpdateCliente(String id, String nombre, String apellido, String dni, String correo, String telefono) {
        Clientes p = new Clientes();
        p.CodigoCliente = id;
        p.NombreCliente = nombre;
        p.ApellidoCliente = apellido;
        p.DNICliente = dni;
        p.CorreoCliente = correo;
        p.TelefonoCliente = telefono;

        p.ActualizarCliente();
    }

    public void deleteCliente(String id) {
        Clientes p = new Clientes();
        p.CodigoCliente = id;
        p.EliminarCliente();
    }

    //VENTAS
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

    public void AddVenta(String cod_cliente, String fec_venta, String importe) {
        Ventas p = new Ventas();
        p.CodigoCliente = cod_cliente;
        p.FechaVenta = fec_venta;
        p.ImporteFinal = importe;

        p.AgregarVenta();
    }

    public void UpdateVenta(String id, String cod_cliente, String fec_venta, String importe) {
        Ventas p = new Ventas();
        p.CodigoVenta = id;
        p.CodigoCliente = cod_cliente;
        p.FechaVenta = fec_venta;
        p.ImporteFinal = importe;

        p.ActualizarVenta();
    }

    public void deleteVenta(String id) {
        Ventas p = new Ventas();
        p.CodigoVenta = id;
        p.EliminarVenta();
    }

    //Empleado
    public DefaultTableModel MostrarEmpleado() {

        DefaultTableModel tabla = new DefaultTableModel();

        Empleados pr = new Empleados();
        ArrayList<Empleados> prlist = pr.ReadEmpleado();
        tabla.setColumnIdentifiers(new Object[]{"CodigoEmpleado", "NombreEmpleado", "Rol", "DNIEmpleado", "CorreoEmpleado", "TelefonoEmpleado"});
        try {
            for (Empleados p : prlist) {
                tabla.addRow(new Object[]{(p.CodigoEmpleado), (p.NombreEmpleado), (p.Rol), (p.DNIEmpleado),(p.CorreoEmpleado),(p.TelefonoEmpleado)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }

    public void AddEmpleado(String nombre, String rol, String dni, String Correo, String Telefono) {
        Empleados p = new Empleados();
        p.NombreEmpleado = nombre;
        p.Rol = rol;
        p.DNIEmpleado = dni;
        p.CorreoEmpleado = Correo;
        p.TelefonoEmpleado = Telefono;
        p.AgregarEmpleado();
    }

    public void UpdateEmpleado(String id, String nombre, String rol, String dni, String Correo, String Telefono) {
        Empleados p = new Empleados();
        p.CodigoEmpleado = id;
        p.NombreEmpleado = nombre;
        p.Rol = rol;
        p.DNIEmpleado = dni;
        p.CorreoEmpleado = Correo;
        p.TelefonoEmpleado = Telefono;

        p.ActualizarEmpleado();
    }

    public void deleteEmpleado(String id) {
        Empleados p = new Empleados();
        p.CodigoEmpleado = id;
        p.EliminarEmpleados();
    }
    public DefaultTableModel MostrarDetalleVenta(String id){
     DefaultTableModel tabla = new DefaultTableModel();

        DetallesVentas dv = new DetallesVentas();
        dv.CodigoVenta=id;
        ArrayList<DetallesVentas> dvlist = dv.ObtenerDetallesVenta();
        tabla.setColumnIdentifiers(new Object[]{"Codigo de Detalle de Venta", "Codigo de Venta", "Nombre del Producto", "Cantidad", "ImporteParcial"});
        try {
            for (DetallesVentas d : dvlist) {
                tabla.addRow(new Object[]{(d.CodigoDetalleVenta), (d.CodigoVenta), (d.NombreProducto), (d.Cantidad),(d.ImporteParcial)});
            }

        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return tabla;
    }
}
