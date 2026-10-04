package singleton;

public class DatabaseConnection {
    private String url;
    private String username;
    private String password;
    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            synchronized (DatabaseConnection.class) {
                if(instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
