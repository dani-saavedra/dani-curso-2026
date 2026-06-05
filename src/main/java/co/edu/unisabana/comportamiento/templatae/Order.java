package co.edu.unisabana.comportamiento.templatae;

public abstract class Order {

    final void atenderCliente() {
        tomarPedido();
        verificarDisponibilidad();
        preparar();
        facturar();
    }
    //Humano

    public void tomarPedido() {
        System.out.println("tomando pedido");
    }

    public void verificarDisponibilidad() {
        System.out.println("verifico disponibilidad");

    }

    public abstract void preparar();

    public abstract void facturar();//sistemas diferentes de facturas
}
