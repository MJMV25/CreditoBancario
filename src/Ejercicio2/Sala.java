package Ejercicio2;

import java.util.ArrayList;

public class Sala {
    private int numero;
    private int capacidad;
    private ArrayList<Asiento> listaAsientos;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int fila = 0; fila < capacidad / 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                listaAsientos.add(new Asiento(fila, columna));
            }
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        for (Asiento asiento : listaAsientos) {
            if (asiento.obtenerFila() == fila && asiento.obtenerColumna() == columna) {
                return asiento;
            }
        }
        return null;
    }
}
