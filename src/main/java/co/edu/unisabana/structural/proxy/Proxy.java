package co.edu.unisabana.structural.proxy;

public class Proxy implements Internet {

    private Internet internet;

    public Proxy() {
        this.internet = new InternetImpl();
    }

    @Override
    public String navegar(String url) {
        if (url.contains("xxx") || url.contains("juegos")) {
            throw new IllegalArgumentException("Sitio prohibido reportado al decano");
        }
        return internet.navegar(url);
    }
}
