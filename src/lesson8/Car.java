package lesson8;

public class Car {
    private int speed;
    public static int count;

    //статический блок - отрабатывает при создание первого объекта из этой иерархии ОДИН РАЗ!!!
    static {
        System.out.println("Статический блок");
    }

    //логический блок - отрабатывает до конструктора
    {
        System.out.println("Логический блок");
    }


    public Car(int speed) {
        System.out.println("Конструктор");
        this.speed = speed;
        count++;
    }

    public int getSpeed() {
        return searchField();
    }

    void startAndGo(){
        System.out.println("Я разгоняюсь до " + speed + " скорости!");
    }

    int searchField(){
        System.out.println("Ищем поле ...");
        return speed;
    }
}
