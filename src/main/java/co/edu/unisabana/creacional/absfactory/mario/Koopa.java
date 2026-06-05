package co.edu.unisabana.creacional.absfactory.mario;

public class Koopa implements Enemigo {

    private String nombre;
    private int vida;
    private int danio;


    public Koopa(int vida, int danio) {
        this.vida = vida;
        this.danio = danio;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }
}
