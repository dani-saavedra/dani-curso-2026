package co.edu.unisabana.poo;

public class Pajaro implements Animal, AnimalVolador {

    private int numero;

    @Override
    public void emitirSonido() {
        System.out.println("pio pio");
    }

    @Override
    public void volar() {
        System.out.println("Esta volando");
    }
}
