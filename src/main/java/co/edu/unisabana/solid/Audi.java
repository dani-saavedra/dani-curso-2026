package co.edu.unisabana.solid;

public class Audi implements Carro {
    @Override
    public int getPrecio() {
        return 100;
    }

    @Override
    public void cualquiera() {
        System.out.println("Estoy haciendo algo...");
    }

    int getNumAsientos() {
        return 4;
    }
}
