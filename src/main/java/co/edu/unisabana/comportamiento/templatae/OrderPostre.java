package co.edu.unisabana.comportamiento.templatae;

public class OrderPostre extends Order {
    @Override
    public void preparar() {
        System.out.println("Preparando una Postre");
    }

    @Override
    public void facturar() {
        System.out.println("Facturando una Postre");

    }
}
