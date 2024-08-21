package Ejercicio2;

import java.util.ArrayList;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private ArrayList<Asiento> listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion, ArrayList<Asiento> listaAsientos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Funcion obtenerFuncion() {
        return funcion;
    }

    public ArrayList<Asiento> obtenerListaAsientos() {
        return listaAsientos;
    }

    public void confirmarReserva() {
        for (Asiento asiento : listaAsientos) {
            asiento.reservar();
        }
        cliente.agregarReserva(this);
    }

    public void ocuparAsientos() {
        for (Asiento asiento : listaAsientos) {
            asiento.ocupar();
        }
    }
}
