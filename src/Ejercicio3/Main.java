package Ejercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tren tren1 = new Tren(101, "Ciudad A - Ciudad B");
        Vagon vagonEconomico = new Vagon("Clase económica", 50);
        Vagon vagonTurista = new Vagon("Clase turista", 30);

        tren1.agregarVagon(vagonEconomico);
        tren1.agregarVagon(vagonTurista);

        Date fechaViaje = new Date(); // Usar la fecha actual para simplicidad
        Viaje viaje1 = new Viaje(fechaViaje, "08:00", "12:00", tren1);

        Cliente cliente1 = new Cliente("Ana Pérez", "987654321", "Avenida Siempre Viva 742");

        Asiento asientoReservado = vagonEconomico.obtenerAsiento(10);
        if (asientoReservado != null && asientoReservado.obtenerEstado().equals("disponible")) {
            asientoReservado.reservar();
        }

        Boleto boleto1 = new Boleto(cliente1, viaje1, asientoReservado);
        cliente1.agregarBoleto(boleto1);

        mostrarBoleto(boleto1);

        asientoReservado.ocupar();
        mostrarBoleto(boleto1);
    }

    public static void mostrarBoleto(Boleto boleto) {
        System.out.println("Cliente: " + boleto.obtenerCliente().obtenerNombre());
        System.out.println("Viaje: " + boleto.obtenerViaje().obtenerTren().obtenerRuta());
        System.out.println("Hora de salida: " + boleto.obtenerViaje().obtenerHoraSalida());
        System.out.println("Asiento: " + boleto.obtenerAsiento().obtenerNumero() + " - Estado: " + boleto.obtenerAsiento().obtenerEstado());
        System.out.println();
    }
}
