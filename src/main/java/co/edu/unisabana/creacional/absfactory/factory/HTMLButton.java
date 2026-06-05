package co.edu.unisabana.creacional.absfactory.factory;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Pitando la pagina el boton");
    }

    @Override
    public void onClick() {
        System.out.println("dando click en el navegador");

    }
}
