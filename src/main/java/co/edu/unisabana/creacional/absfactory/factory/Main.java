package co.edu.unisabana.creacional.absfactory.factory;

public class Main {

    public static void main(String[] args) {
        Dialog contextoWeb = new WindowsDiaglo();
        contextoWeb.render();
    }
}
