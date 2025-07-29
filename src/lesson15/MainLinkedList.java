package lesson15;

import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        //LinkedList - коллекция на базе связанного списка
        //Быстрое добавление/удаление (О(1) при наличии ссылки на узел))
        //Медленный доступ по индексу
        //Элементы записывает в порядке добавления
        //Допускает дублирование
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println(numbers);
    }
}
