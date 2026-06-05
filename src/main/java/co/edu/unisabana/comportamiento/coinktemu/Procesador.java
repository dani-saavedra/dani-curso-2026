package co.edu.unisabana.comportamiento.coinktemu;

import java.util.Arrays;
import java.util.List;

public class Procesador {

    private List<ValidadorMoneda> monedasValidas;

    public Procesador() {
        this.monedasValidas = Arrays.asList(
                new Moneda200(),
                new Moneda100(),
                new Moneda500());
    }

    public Integer sumarMonedas(List<Moneda> monedas) {
        int dineroIngresado = 0;
        for (Moneda moneda : monedas) {
            for (ValidadorMoneda validadorMoneda : monedasValidas) {
                if (validadorMoneda.aceptaMoneda(moneda)) {
                    dineroIngresado += validadorMoneda.getValor();
                    break;
                }
            }
        }
        return dineroIngresado;
    }
}
