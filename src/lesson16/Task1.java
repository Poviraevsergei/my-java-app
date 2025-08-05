package lesson16;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Пользователь вводит строку с клавиатуры. Для каждого слова подсчитать частоту его встречаемости.
        Слова, отличающиеся регистром букв считать разными. Использовать класс HashMap.
        После выполнения результат вывести в консоль.
         */
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] arrayWords = inputLine.split(" +");

        HashMap<String, Integer> map = new HashMap();
        for (String word : arrayWords) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.replace(word, ++count);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : arrayWords) {
            if (map.containsKey(word)) {
                if (map.get(word) == 1) {
                    System.out.println(word);
                }
            }
        }

        // HashSet<String> words = new HashSet<>(Arrays.asList(arrayWords));
        System.out.println(map);
    }
}
