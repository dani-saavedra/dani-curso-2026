package co.edu.unisabana.comportamiento.coinktemu;

public class Moneda200 implements ValidadorMoneda {


    @Override
    public boolean aceptaMoneda(Moneda moneda) {
        return moneda.getTexto().equals("COP 200");
    }

    @Override
    public int getValor() {
        return 200;
    }
}
