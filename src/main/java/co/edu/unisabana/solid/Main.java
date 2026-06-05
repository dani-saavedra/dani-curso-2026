package co.edu.unisabana.solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final int DIECINUEVE = 19;

    public static void main(String[] args) {
        List<Carro> carros = Arrays.asList(new Audi(),
                new Mercedez());
        imprimirPrecio(carros);
    }

    /*
    static void imprimirPrecio(List<Carro> carros) {
        for (Carro carro : carros) {
            if (carro.getMarca().equals("Mercedes")) {
                System.out.println(200);
            } else if (carro.getMarca().equals("Nissan")) {
                System.out.println(50);
            } else if (carro.getMarca().equals("Audi")) {
                System.out.println(100);
            }
        }
    }
     */
    static void imprimirPrecio(List<Carro> carros) {

        for (Carro carro : carros) {
            if(carro instanceof Audi){
                System.out.println(((Audi) carro).getNumAsientos());
            }else if(carro instanceof Mercedez){
                ((Mercedez) carro).getAsientos();
            }

            System.out.println(carro.getPrecio() * 19);
        }
    }
}
