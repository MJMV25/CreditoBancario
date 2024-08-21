package Ejercicio4;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public int obtenerStock() {
        return stock;
    }

    public void modificarStock(int nuevoStock) {
        this.stock = nuevoStock;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: $" + precio + ", Stock: " + stock;
    }
}