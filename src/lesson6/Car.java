package lesson6;

import java.util.Scanner;

public class Car {
    int year = 1;
    String brand;
    boolean isRun;

    //Блок инициализации(Логический блок) - он отрабатывает до конструктора
    {
       year = 2;
    }

    //Конструктор(метод) по умолчанию
    //1. Нет типа возвращаемого значения
    //2. Название такое-же как и у класса!!!
    //3. По умолчанию в классе есть неявный контруктор
    //4. При создании пользовательского конструктора, конструктор по умолчанию удаляется
    Car(int yearInput, String brandInput) {
        year = yearInput;
        brand = brandInput;
    }

    Car(String brand, int year) {
        this.year = year;
        this.brand = brand;
    }

    Car(int year) {
        this.year = year;
    }

    Boolean startEngine() {
        isRun = true;
        System.out.println("Двигатель запущен!");
        return isRun;
    }

    Boolean stopEngine() {
        isRun = false;
        System.out.println("Двигатель остановлен!");
        return isRun;
    }

    //void - если метод ничего не возвращает!!!(return)
    void drive(int km) {
        System.out.println("Авто проехало " + km + " km...");
    }

    String driveStringReturned(int km) {
        return "Авто проехало " + km + " km...";
    }

    String driveSomeDistance(int ... km) {
        String resultLine = "Авто проехало ";
        for (int oneDistance: km){
            resultLine = resultLine + oneDistance + " km... потом ";
        }
        resultLine = resultLine + "остановилась.";
        return resultLine;
    }

}