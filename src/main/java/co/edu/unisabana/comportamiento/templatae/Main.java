package co.edu.unisabana.comportamiento.templatae;

public class Main {
    public static void main(String[] args) {
        Order bebida = new OrderBebida();
        bebida.atenderCliente();

        System.out.println("========");
        Order postre = new OrderPostre();
        postre.atenderCliente();
    }
}
