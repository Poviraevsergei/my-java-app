package lesson20;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("I'm daemon!");
            }
        } finally {
            System.out.println("Finally block");
        }

    }
}
