package Ejercicio3;

import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Boleto> historialCompras;

    public Cliente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.historialCompras = new ArrayList<>();
    }

    public ArrayList<Boleto> obtenerHistorialCompras() {
        return historialCompras;
    }

    public void agregarBoleto(Boleto boleto) {
        historialCompras.add(boleto);
    }
}
