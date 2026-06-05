package co.edu.unisabana.creacional.absfactory.mario;

public interface AbstractMundoFactory {

    Bloque crearBloque();

    Enemigo crearEnemigo();

    void jugar();
}
