package Creational;
public class Singleton {
    public static void main(String[] args) {
        DBConnect instance = DBConnect.getDBInstance();
    }
}

class DBConnect {
    private DBConnect() {
        if(dbInstance != null) {
            throw new RuntimeException("Use getDBInstance() to create instances...");
        }
    }

    static private volatile DBConnect dbInstance = null; // Lazily Loaded, created only when getdbinstance called

    static DBConnect getDBInstance() {
        if(dbInstance == null) {
            synchronized (DBConnect.class) { // to make it thread safe with synchronized and volatile keyword
                if(dbInstance == null) {
                    dbInstance = new DBConnect();
                }
            }
        }
        return dbInstance;
    }
}