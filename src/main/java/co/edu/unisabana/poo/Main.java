package co.edu.unisabana.poo;

public class Main {

    public static void main(String[] args) {
        emitirSonido(new Perro());
    }

    static void emitirSonido(Animal animal){
        animal.emitirSonido();
    }
}
