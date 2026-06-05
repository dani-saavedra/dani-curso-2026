package co.edu.unisabana.creacional.absfactory.mario;

public class MundoHardCoreFactory implements AbstractMundoFactory {

    @Override
    public Bloque crearBloque() {
        return new Moneda();
    }

    @Override
    public Enemigo crearEnemigo() {
        return new Goomba(100, 100);
    }

    @Override
    public void jugar() {
        crearBloque();
        crearEnemigo();
    }
}
