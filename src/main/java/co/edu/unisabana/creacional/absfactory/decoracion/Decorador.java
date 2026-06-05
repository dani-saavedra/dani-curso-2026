package co.edu.unisabana.creacional.absfactory.decoracion;

public class Decorador {

    public void decorar(String estilo) {

        if (estilo.equals("Art Deco")) {
            Silla sillDeco = null;
            Sofa sofaDeco = null;
            Mesilla mesillaDeco = null;
        } else if (estilo.equals("Victoriano")) {
            Silla sillVictoriano = null;
            Sofa sofaVictoriano = null;
            Mesilla mesillaVictoriano = null;
        } else if (estilo.equals("Moderno")) {
            Silla sillModerna = null;
            Sofa sofaModerno = null;
            Mesilla mesillaModerna = null;
        }
    }
}
