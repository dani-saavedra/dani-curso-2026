package co.edu.unisabana.bajo;

import co.edu.unisabana.alto.NotificacionPort;

public class NotificacionAdapterAldeamo implements NotificacionPort {

    public void enviarNotificacion(String producto, int celular) {
        System.out.println("Logica para enviar la notificacion Aldeamo " + celular);
    }
}
