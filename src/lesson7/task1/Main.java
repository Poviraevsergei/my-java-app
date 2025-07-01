package lesson7.task1;

public class Main {
    public static void main(String[] args) {
        String loginFromVMOptions = System.getProperty("login");
        String passwordFromVMOptions = System.getProperty("password");
        boolean isLog = Boolean.parseBoolean(System.getProperty("log"));

        if (isLog) {
            System.out.println(loginFromVMOptions);
            System.out.println(passwordFromVMOptions);
        }
    }
}
