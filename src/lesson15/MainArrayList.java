package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainArrayList {
    public static void main(String[] args) {
        //ArrayList - коллекция на базе Массива.
        //Элементы записывает в порядке добавления
        //Допускает дублирование
        //Быстрый поиск по индексу O(1)
        //Медленная вставка/удаление O(n)
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.indexOf("Алексей"));
        list.add("Алексей");
        list.add("Сергей");
        list.remove(1);
        list.set(0,"Дима");
        list.add("Сергей");
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.contains("Артем"));
        System.out.println(list);
        System.out.println(list);
        System.out.println(list.size());
    }
}
