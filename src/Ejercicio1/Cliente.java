package Ejercicio1;

public class Cliente extends Persona {
    private String historialCrediticio;
    private double ingresos;

    public Cliente(String nombre, String identificacion, String direccion, String historialCrediticio, double ingresos) {
        super(nombre, identificacion, direccion);
        this.historialCrediticio = historialCrediticio;
        this.ingresos = ingresos;
    }

    public String obtenerHistorialCrediticio() {
        return historialCrediticio;
    }

    public double obtenerIngresos() {
        return ingresos;
    }
}
