package lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class TaskDate {
    public static void main(String[] args) {
        /*
        Напиши Java-программу, которая:
        Принимает от пользователя дату начала отпуска(формата dd.MM.yyyy) и количество дней.
        Вычисляет дату окончания отпуска.
        Проверяет, попадает ли отпуск на праздничные дни (1 января, 7 января, 9 мая).

        Выводит:
        Дату начала и окончания отпуска.
        Количество рабочих дней в отпуске (исключая выходные и праздники).
        Список праздничных дней, попавших в отпуск.
         */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        //TODO:before logic

        Integer inputDays = scanner.nextInt();
        LocalDate endDate =startDate.plusDays(inputDays);

        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(inputDays);
    }
}
