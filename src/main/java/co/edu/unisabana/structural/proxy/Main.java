package co.edu.unisabana.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new Proxy();
        System.out.println(internet.navegar("unisabana.edu"));
    }
}
