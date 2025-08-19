package lesson20;

import java.util.concurrent.Executors;

public class Main {
    private static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true); //делает поток демоном
        thread.start();
/*        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println(number);*/
    }

    public static void addOneToNumberVar() {
        ++Main.number;
    }
}
