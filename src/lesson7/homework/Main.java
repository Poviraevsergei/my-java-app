package lesson7.homework;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.showColor();

        //получение методанных
        Field field = apple.getClass().getDeclaredField("color");

        //Reflection API: отменяем private
        field.setAccessible(true);
        field.set(apple, "Red");

        apple.showColor();
    }
}
