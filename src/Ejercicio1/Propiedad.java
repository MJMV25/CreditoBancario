package Ejercicio1;

public class Propiedad {
    private String direccion;
    private double valor;

    public Propiedad(String direccion, double valor) {
        this.direccion = direccion;
        this.valor = valor;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public double obtenerValor() {
        return valor;
    }
}
