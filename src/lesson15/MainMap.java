package lesson15;

import java.util.Collection;
import java.util.HashMap;

public class MainMap {
    public static void main(String[] args) {
        //Map - интерфейс отдельный от Collections хранит 2 значения(key, value)
        //Key - всегда уникальный
        //Value - может дублироваться
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");

        System.out.println(numbers.get(2));

        System.out.println(numbers);
    }
}
