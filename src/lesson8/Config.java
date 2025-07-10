package lesson8;

public class Config {
    public static final String DATABASE_LOGIN;
    public static final String DATABASE_PASSWORD;
    public static final String VERSION;

    static {
        System.out.println("Выполняю статический блок ...");
        DATABASE_LOGIN = System.getProperty("db_lgn");
        VERSION = System.getProperty("version");
        DATABASE_PASSWORD = System.getProperty("db_pwd");
    }
}
