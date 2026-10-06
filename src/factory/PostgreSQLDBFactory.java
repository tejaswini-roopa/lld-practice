package factory;

public class PostgreSQLDBFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
