package co.edu.unisabana.comportamiento.strategy;

public class Navigator {

    public void navegacion(String origen, String destino, RouteStrategy strategy) {

        System.out.println("=====================");
        System.out.println("Calculando ruta google maps - Temu");
        System.out.println("Origen:" + origen);
        System.out.println("Destino:" + destino);

        String resultado = strategy.buildRoute(origen, destino);

        presentarPublicidad(destino);
        System.out.println("Resultado " + resultado);

    }

    private void presentarPublicidad(String destino) {
        System.out.println("Mostrando publidad en " + destino);
    }
}
