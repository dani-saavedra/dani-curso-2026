package co.edu.unisabana;

import co.edu.unisabana.alto.Pago;
import co.edu.unisabana.bajo.NotificacionAdapterAldeamo;

public class Main {
    public static void main(String[] args) {
        Pago pago = new Pago(new NotificacionAdapterAldeamo());
        pago.procesarPago("Jarabe", 200, 30254670);
    }
}