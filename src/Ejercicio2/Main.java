package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sala sala1 = new Sala(1, 100);

        Funcion funcion1 = new Funcion("Avatar: The Way of Water", "18:00", sala1, 12.50);

        Cliente cliente1 = new Cliente("Carlos Gómez", "123456789", "Calle Luna 123");

        ArrayList<Asiento> asientosReservados = new ArrayList<>();
        Asiento asiento1 = sala1.obtenerAsiento(0, 1);
        Asiento asiento2 = sala1.obtenerAsiento(0, 2);
        if (asiento1 != null && asiento2 != null && asiento1.obtenerEstado().equals("disponible") && asiento2.obtenerEstado().equals("disponible")) {
            asientosReservados.add(asiento1);
            asientosReservados.add(asiento2);
        }

        Reserva reserva1 = new Reserva(cliente1, funcion1, asientosReservados);

        reserva1.confirmarReserva();

        mostrarReserva(reserva1);

        reserva1.ocuparAsientos();
        mostrarReserva(reserva1);
    }

    public static void mostrarReserva(Reserva reserva) {
        System.out.println("Cliente: " + reserva.obtenerCliente().obtenerNombre());
        System.out.println("Película: " + reserva.obtenerFuncion().obtenerPelicula());
        System.out.println("Hora de inicio: " + reserva.obtenerFuncion().obtenerHoraInicio());
        System.out.println("Asientos reservados:");
        for (Asiento asiento : reserva.obtenerListaAsientos()) {
            System.out.println("Fila: " + asiento.obtenerFila() + ", Columna: " + asiento.obtenerColumna() + " - Estado: " + asiento.obtenerEstado());
        }
        System.out.println();
    }
}
