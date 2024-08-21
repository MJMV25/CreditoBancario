package Ejercicio4;

import java.util.Date;

public class ProductoPerecedero extends Producto {
    private Date fechaVencimiento;

    public ProductoPerecedero(String nombre, String descripcion, double precio, int stock, Date fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de vencimiento: " + fechaVencimiento;
    }
}
