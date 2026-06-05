package co.edu.unisabana.creacional.absfactory.mario;

public class Main {

    public static void main(String[] args) {

        AbstractMundoFactory factory;


        factory = new MundoHardCoreFactory();
        factory.jugar();
    }
}
