package co.edu.unisabana.comportamiento.state;

public class Order {

    private String status;

    public Order() {
        this.status = "CREATED";
    }

    public void pay() {
        if (status.equals("CREATED")) {
            System.out.println("Pedido pagado");
            status = "PAID";
        } else if (status.equals("PAID")) {
            System.out.println("Ya está pagado");
        } else if (status.equals("SHIPPED")) {
            System.out.println(
                    "Ya fue enviado"
            );
        } else if (status.equals("DELIVERED")) {
            System.out.println(
                    "Pedido finalizado"
            );
        } else if (status.equals("CANCELLED")) {
            System.out.println(
                    "Pedido cancelado"
            );
        }
    }

    public void ship() {

        if (status.equals("CREATED")) {
            System.out.println(
                    "No se puede enviar sin pagar"
            );
        } else if (status.equals("PAID")) {
            System.out.println(
                    "Pedido enviado"
            );

            status = "SHIPPED";

        } else if (status.equals("SHIPPED")) {

            System.out.println(
                    "Ya enviado"
            );

        } else if (status.equals("DELIVERED")) {

            System.out.println(
                    "Ya entregado"
            );

        } else if (status.equals("CANCELLED")) {

            System.out.println(
                    "Pedido cancelado"
            );
        }
    }

    public void deliver() {

        if (status.equals("SHIPPED")) {
            System.out.println(
                    "Pedido entregado"
            );

            status = "DELIVERED";

        } else {

            System.out.println(
                    "No se puede entregar"
            );
        }
    }

    public void cancel() {

        if (status.equals("DELIVERED")) {

            System.out.println(
                    "No se puede cancelar"
            );

        } else if (status.equals("CANCELLED")) {

            System.out.println(
                    "Ya cancelado"
            );

        } else {

            System.out.println(
                    "Pedido cancelado"
            );

            status = "CANCELLED";
        }
    }
}
