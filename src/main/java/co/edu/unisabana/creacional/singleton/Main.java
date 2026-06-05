package co.edu.unisabana.creacional.singleton;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.ejecutarQuery("select * from usuario");
    }
}
