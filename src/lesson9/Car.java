package lesson9;

//мы описываем функционал, который должен быть у класса имплиментирующего этот интерфейс,
// но БЕЗ конкретной реализации.
public interface Car {

    //static final по умолчанию
    int WHEELS_COUNT = 4;

    //public мод. доступа по умолчанию
    //абстрактный метод - метод который который не имеет реализации
    void startEngine();

    //Методы по умолчанию(default)
    default void stopEngine() {
        System.out.print("Двигатель остановлен ...");
        someMethod();
    }

    private void someMethod() {
        System.out.print("Hello i'm private method!");
    }

    static void someMethodStatic() {
        System.out.print("Hello i'm static method!");
    }
}

