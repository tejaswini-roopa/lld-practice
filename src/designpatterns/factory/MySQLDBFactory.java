package designpatterns.factory;

public class MySQLDBFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
