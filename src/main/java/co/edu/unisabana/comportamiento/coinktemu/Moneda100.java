package co.edu.unisabana.comportamiento.coinktemu;

public class Moneda100 implements ValidadorMoneda {


    @Override
    public boolean aceptaMoneda(Moneda moneda) {
        return moneda.getTexto().equals("100 Pesos");
    }

    @Override
    public int getValor() {
        return 100;
    }
}
