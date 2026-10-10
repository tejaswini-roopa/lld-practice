package designpatterns.singleton;

public class Client {
    static void main(String[] args) {
        DatabaseConnection dbc = DatabaseConnection.getInstance();
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
    }
}
