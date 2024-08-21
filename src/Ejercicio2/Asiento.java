package Ejercicio2;

public class Asiento {
    private int fila;
    private int columna;
    private String estado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public int obtenerFila() {
        return fila;
    }

    public int obtenerColumna() {
        return columna;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            estado = "reservado";
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
        }
    }
}
