package co.edu.unisabana.solid;

public class Mercedez implements Carro {
    @Override
    public int getPrecio() {
        return 200;
    }

    @Override
    public void cualquiera() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    int getAsientos() {
        return 2;
    }
}
