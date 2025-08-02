package lesson15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        //1. HashSet
        //2. TreeSet
        //3. LinkedHashSet

        //1. HashSet - коллекция на базе Hash таблицы хранит уникальные значения.
        //Неупорядоченная коллекция
        //Быстрый поиск
        //Key из Map, Value muted!
        User user1 = new User();

        //Перед использование лучше переопеделить equals и hashcode
        // класса объекты которого собираемся хранить.
        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(user1);

        System.out.println(userHashSet);

        //2. TreeSet - коллекция на базе красно-черного бинарного дерева.
        //Хранит уникальные эл-ты в отсортированном виде.
        //Эффективна для поиска уникальных значений(но не для постоянного добавления)
        TreeSet<String> names = new TreeSet<>();
        names.add("A");
        names.add("C");
        names.add("B");
        names.add("B");
        System.out.println(names);

        //2. LinkedHashSet - хранит эл-ты в порядке добавления!
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);
    }
}
