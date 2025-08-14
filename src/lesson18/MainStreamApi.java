package lesson18;

import java.util.*;
import java.util.stream.Collectors;

public class MainStreamApi {
    public static void main(String[] args) {
/*        List<String> names = Arrays.asList("Anatoliy", "Boris", "Diana", "Diana", "Diana", "Dima");

        List<String> resultNames = names.stream()
                .filter(name -> name.startsWith("D")) //конвеерная функция может встречать много раз
                .skip(1)
                .distinct()
                .map(name -> name + name) //map преобразует обьект!
                .peek(name -> printMe(name)) //peek позволяет выполнить метод с использованием параметра из стрима
                .limit(5)
                .sorted()
                .flatMap(name -> Arrays.stream(name.split("a+")))
                .toList(); //терминальная функция возвращает результат и закрывает поток
        System.out.println(resultNames);*/

        /**
         * 1. Фильтрация и преобразование списка сотрудников
         * Дан список сотрудников List<Employee> employees.
         * Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
         * Ожидаемый результат: List<String> — имена подходящих сотрудников.
         */
        List<Employee> employees = Arrays.asList(
                new Employee(50000, "Security", "Danila"),
                new Employee(150000, "Security", "Жан"),
                new Employee(300000, "Security", "Сергей"),
                new Employee(200000, "Management", "Виталий")
        );

        employees.stream()
                .filter(e -> "Security".equals(e.getDepartment()))
                .parallel()
                .map(Employee::getName)
                .forEach(MainStreamApi::printMe);
        //.forEach(name -> printMe(name));
        //.max(Comparator.comparing(name -> name.length()));
        //.min(Comparator.comparing(name -> name.length()));
        //.allMatch(name -> name.equals("Жан"));
        //.noneMatch(name -> name.equals("Жан"));
        //.anyMatch(name -> name.equals("Жан"));
        //.count();
        //.collect(Collectors.toUnmodifiableSet());
        //.collect(Collectors.toSet());
        //.toArray()
        //.toList();
        //.findAny();
        //.findFirst();
        //System.out.println(resultNamesFromStream);
    }

    public static void printMe(String line) {
        System.out.println(line);
    }
}


/**
 * 2. Сумма чисел, кратных 3 или 5
 * Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5.
 * <p>
 * 3. Подсчёт количества уникальных слов
 * Дан список строк List<String> lines. Нужно посчитать количество уникальных слов (без учёта регистра).
 * Input:
 * List<String> lines = List.of(
 * "Stream API is powerful",
 * "Java stream is powerful",
 * "Powerful tools in Java"
 * );
 * <p>
 * Output: 7 (stream, api, is, powerful, java, tools, in)Stream API задачи:
 * 1. Фильтрация и преобразование списка сотрудников
 * Дан список сотрудников List<Employee> employees.
 * Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
 * Ожидаемый результат: List<String> — имена подходящих сотрудников.
 * <p>
 * 2. Сумма чисел, кратных 3 или 5
 * Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5.
 * <p>
 * 3. Подсчёт количества уникальных слов
 * Дан список строк List<String> lines. Нужно посчитать количество уникальных слов (без учёта регистра).
 * Input:
 * List<String> lines = List.of(
 * "Stream API is powerful",
 * "Java stream is powerful",
 * "Powerful tools in Java"
 * );
 * <p>
 * Output: 7 (stream, api, is, powerful, java, tools, in)
 */