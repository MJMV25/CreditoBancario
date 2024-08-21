package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "12345678", "Calle Principal 123", "Buen historial", 3000);

        SolicitudCredito solicitudPersonal = new SolicitudCredito(cliente, "personal", 5000, 3, 0.05);
        Credito creditoPersonal = new Credito(solicitudPersonal);

        if (cliente.obtenerHistorialCrediticio().equals("Buen historial")) {
            creditoPersonal.aprobar();
        } else {
            creditoPersonal.rechazar();
        }
        mostrarEstadoCredito(creditoPersonal);

        Propiedad propiedad = new Propiedad("Avenida Siempre Viva 742", 120000);

        SolicitudCredito solicitudHipotecaria = new SolicitudCredito(cliente, "hipotecario", 100000, 20, 0.03);
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(solicitudHipotecaria, propiedad);

        creditoHipotecario.aprobar();
        mostrarEstadoCredito(creditoHipotecario);
    }

    public static void mostrarEstadoCredito(Credito credito) {
        System.out.println("Tipo de crédito: " + credito.obtenerSolicitudCredito().obtenerTipoCredito());
        System.out.println("Cliente: " + credito.obtenerSolicitudCredito().obtenerCliente().obtenerNombre());
        System.out.println("Monto: $" + credito.obtenerSolicitudCredito().obtenerMonto());
        System.out.println("Plazo: " + credito.obtenerSolicitudCredito().obtenerPlazo() + " años");
        System.out.println("Estado: " + credito.obtenerEstado());
        System.out.println();
    }
}
