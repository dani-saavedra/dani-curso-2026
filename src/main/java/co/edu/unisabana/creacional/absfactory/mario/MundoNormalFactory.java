package co.edu.unisabana.creacional.absfactory.mario;

public class MundoNormalFactory implements AbstractMundoFactory {
    @Override
    public Bloque crearBloque() {
        return new Champinon();
    }

    @Override
    public Enemigo crearEnemigo() {
        return new Goomba(10, 10);
    }

    @Override
    public void jugar() {
        crearBloque();
        crearEnemigo();
    }
}
