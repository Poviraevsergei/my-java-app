package lesson20;

public class MyThread extends Thread {
    //1. наследование Thread
    //2. переопределить метод run()!!!

    //Содержит логику которую должен выполнять этот поток
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            synchronized (Main.class){
                Main.addOneToNumberVar();
            }
        }
    }
}
