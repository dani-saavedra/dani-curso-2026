package co.edu.unisabana.bajo;

import co.edu.unisabana.alto.NotificacionPort;

public class NotificacionAdapterTwilio implements NotificacionPort {

    public void enviarNotificacion(String producto, int celular) {
        System.out.println("Logica para enviar la notificacion Twilio " + celular);
    }
}
