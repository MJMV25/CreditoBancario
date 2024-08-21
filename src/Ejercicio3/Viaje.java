package Ejercicio3;

import java.util.Date;

public class Viaje {
    private Date fecha;
    private String horaSalida;
    private String horaLlegada;
    private Tren tren;

    public Viaje(Date fecha, String horaSalida, String horaLlegada, Tren tren) {
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.tren = tren;
    }

    public Date obtenerFecha() {
        return fecha;
    }

    public String obtenerHoraSalida() {
        return horaSalida;
    }

    public String obtenerHoraLlegada() {
        return horaLlegada;
    }

    public Tren obtenerTren() {
        return tren;
    }
}
