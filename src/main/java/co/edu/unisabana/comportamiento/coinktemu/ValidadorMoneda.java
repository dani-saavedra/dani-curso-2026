package co.edu.unisabana.comportamiento.coinktemu;

public interface ValidadorMoneda {

    boolean aceptaMoneda(Moneda moneda);

    int getValor();
}
