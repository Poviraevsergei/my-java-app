package lesson20;

import java.util.concurrent.Executors;

public class Main {
    static int number = 0;
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread.sleep(2000);
        System.out.println(number);
    }
}
