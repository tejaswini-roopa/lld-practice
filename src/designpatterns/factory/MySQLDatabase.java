package designpatterns.factory;

public class MySQLDatabase implements Database{
    public DatabaseFactory createDatabaseFactory() {
        return new MySQLDBFactory();
    }
}
