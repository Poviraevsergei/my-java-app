package lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Анонимные классы - это классы, что не имеют имени и их создание происходит в момент инициализации объекта.
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Hi hi hi");
            }
        };

        //Для использования лямбды:
        //1. Создается функциональный интерфейс
        //2. Создание лямбда выражение(но не используется)
        Printer printHi = () -> System.out.println("Hi");
        Printer printBye = () -> System.out.println("Bye");

        //3. Использование лямбда выражения
        printHi.print();
        printBye.print();

        /**
         * Задача 1:
         * Создайте функциональный интерфейс StringFilter с методом boolean accept(String s).
         * В Main реализуйте метод public static List<String> filter(List<String> input, StringFilter filter).
         * 1. Отфильтруйте/оставьте только те строки длинна которых больше 5 символов
         * 2. Отфильтруйте/оставьте только те строки которые начинаются с большой буквы
         */
        List<String> inputStrings = Arrays.asList("Tms", "Привет!", "group36");
        StringFilter lengthFilter = line -> line.length() > 5;
        StringFilter upperLetterFilter = line -> {
            String firstLatter = String.valueOf(line.charAt(0));
            return firstLatter.matches("[A-ZА-Я]");
        };

        System.out.println(filter(inputStrings, upperLetterFilter));

        /**
         * Создайте функциональный интерфейс IntToStringConverter с методом String convert(int value).
         * В Main реализуйте метод public static List<String> convertAll(List<Integer> input, IntToStringConverter converter)
         * который будет преобразовывать число n в строку "Число: n".
         */
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3);
        System.out.println(convertAll(inputNumbers, number -> "Число: " + number));
    }

    public static List<String> convertAll(List<Integer> input, IntToStringConverter converter) {
        List<String> resultList = new ArrayList<>();

        for (Integer element : input) {
            resultList.add(converter.convert(element));
        }
        return resultList;
    }

    public static List<String> filter(List<String> input, StringFilter filter) {
        List<String> resultList = new ArrayList<>();

        for (String element : input) {
            if (filter.accept(element)) {
                resultList.add(element);
            }
        }
        return resultList;
    }

}


/**
 * TODO: Задача перед Stream API!
 * Создайте функциональный интерфейс StringCondition с методом boolean test(String s).
 * В Main реализуйте метод public static int count(List<String> input, StringCondition condition)
 * 1. Посчитать количество слов содержащих букву 'a'
 * 2. Посчитать кол-во слов написанных UpperCase
 */
