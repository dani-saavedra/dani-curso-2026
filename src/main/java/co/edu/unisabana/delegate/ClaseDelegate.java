package co.edu.unisabana.delegate;

public class ClaseDelegate {

    ClaseService proveedor;

    public void delegateHaceAlgo() {
        proveedor = new ClaseService();
        proveedor.haceAlgo();
    }
}
