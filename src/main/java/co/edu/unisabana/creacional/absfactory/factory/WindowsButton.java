package co.edu.unisabana.creacional.absfactory.factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Renderizando button en windwos");
    }

    @Override
    public void onClick() {
        System.out.println("dando click al  button en windwos");

    }
}
