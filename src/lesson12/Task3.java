package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String input = "Температура -3.5°C, рост 180";
        String regex = "-?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

        /*
        3. Поиск всех чисел в тексте
Дано: произвольный текст
Задача: найти все целые и дробные числа (включая отрицательные)
Пример: "Температура -3.5°C, рост 180" → ["-3.5", "180"]
         */