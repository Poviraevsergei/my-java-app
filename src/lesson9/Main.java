package lesson9;

import lesson9.abstract_class.Doctor;
import lesson9.abstract_class.Therapist;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
/*
        1. Смоделируй поведение животного. Создай интерфейс Animal с методами makeSound(), move(), eat(), sleep();
         Реализуй его в классах Dog и Bird.


        //Интерфейсная ссылка(для большей абстракции, для меньшей связанности кода).
        // В интерфейсную переменную можно засунуть любой обьект класса имплиментируюбщего этот интерфейс
        Animal animal = new Dog();
        animal.makeSound();
        animal.move();
        animal.sleep();*/

        Doctor doctor = new Therapist();
    }
}
