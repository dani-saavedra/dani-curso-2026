package co.edu.unisabana.comportamiento.coinktemu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Procesador procesador = new Procesador();

        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("1 USD"));
        monedas.add(new Moneda("1 SOL"));
        monedas.add(new Moneda("COP 500"));
        monedas.add(new Moneda("COP 200"));
        monedas.add(new Moneda("100 Pesos"));

        Integer total = procesador.sumarMonedas(monedas);
        System.out.println("Dinero aceptado " + total);
    }
}
