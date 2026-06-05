package co.edu.unisabana.comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.navegacion("Chia", "Bogota", new RoadStategy());
    }
}
