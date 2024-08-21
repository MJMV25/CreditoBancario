package Ejercicio1;

public class Credito {
    protected SolicitudCredito solicitudCredito;
    protected String estado;

    public Credito(SolicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
        this.estado = "pendiente";
    }

    public SolicitudCredito obtenerSolicitudCredito() {
        return solicitudCredito;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void aprobar() {
        this.estado = "aprobado";
    }

    public void rechazar() {
        this.estado = "rechazado";
    }
}
