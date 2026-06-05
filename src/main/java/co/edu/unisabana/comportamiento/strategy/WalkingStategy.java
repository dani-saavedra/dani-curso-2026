package co.edu.unisabana.comportamiento.strategy;

public class WalkingStategy implements RouteStrategy {
    @Override
    public String buildRoute(String origin, String destination) {
        return "Ruta entre " + origin + " y " + destination + " Tarda 20 minutos";
    }
}
