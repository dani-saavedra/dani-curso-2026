package co.edu.unisabana.comportamiento.templatae;

public class OrderBebida extends Order {
    @Override
    public void preparar() {
        System.out.println("Preparando una bebeida");
    }

    @Override
    public void facturar() {
        System.out.println("Facturando una bebeida");

    }
}
