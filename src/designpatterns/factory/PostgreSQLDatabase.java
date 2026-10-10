package designpatterns.factory;

public class PostgreSQLDatabase implements Database {
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostgreSQLDBFactory();
    }
}
