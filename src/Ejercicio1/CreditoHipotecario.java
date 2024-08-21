package Ejercicio1;

public class CreditoHipotecario extends Credito {
    private Propiedad propiedad;

    public CreditoHipotecario(SolicitudCredito solicitudCredito, Propiedad propiedad) {
        super(solicitudCredito);
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad() {
        return propiedad;
    }

    @Override
    public void aprobar() {
        if (propiedad != null && solicitudCredito.obtenerMonto() <= propiedad.obtenerValor()) {
            super.aprobar();
        } else {
            super.rechazar();
        }
    }
}
