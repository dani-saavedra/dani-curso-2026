package co.edu.unisabana.alto;

public class Pago {

    private NotificacionPort notificacion;

    public Pago(NotificacionPort notificacion) {
        this.notificacion = notificacion;
    }

    public void procesarPago(String producto, int monto, int celular) {
        //Logica para procesar el pago
        System.out.println("Pagando el producto " + producto + " Total:" + monto);

        //Notificacion notificacion = new Notificacion();
        notificacion.enviarNotificacion(producto, celular);
    }
}
