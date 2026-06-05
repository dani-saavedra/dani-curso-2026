package co.edu.unisabana.comportamiento.coinktemu;

public class Moneda500 implements ValidadorMoneda {


    @Override
    public boolean aceptaMoneda(Moneda moneda) {
        return moneda.getTexto().equals("COP 500") || moneda.getTexto().equals("500 pesos");
    }

    @Override
    public int getValor() {
        return 500;
    }
}
