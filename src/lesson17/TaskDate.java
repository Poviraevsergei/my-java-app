package lesson17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TaskDate {

    private static final Set<LocalDate> HOLIDAYS = Set.of(
            LocalDate.of(2026, 1, 1),
            LocalDate.of(2026, 1, 7),
            LocalDate.of(2026, 5, 9)
    );

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
        ArrayList<LocalDate> holidayVocation = new ArrayList<>();
        int workDays = 0;
        LocalDate startDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Integer inputDays = scanner.nextInt();
        LocalDate endDate = startDate.plusDays(inputDays - 1);

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            boolean isHoliday = HOLIDAYS.contains(date);
            if (isHoliday) {
                holidayVocation.add(date);
            }

            DayOfWeek day = date.getDayOfWeek();
            boolean isWeekend = day.equals(DayOfWeek.SUNDAY) || day.equals(DayOfWeek.SATURDAY);

            if (!isHoliday && !isWeekend) {
                workDays++;
            }
        }

        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println("Рабочие дни: " + workDays);
        System.out.println("Праздничные дни: " + holidayVocation);
    }
}
