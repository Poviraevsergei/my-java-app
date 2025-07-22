package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String input = "Дата: 2024-07-22";
        String regex = "\\d{4}(-\\d{2}){2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*
4. Извлечение даты из строки
Дано: строка "Дата: 2024-07-22"
Задача: извлечь дату в формате YYYY-MM-DD
Пример: "2024-07-22"

 */