package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String email = "anna@tms.com";
        String regex = "@[A-z]?+\\.[A-z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*
2. Извлечение доменов из email-адресов
Дано: список email-адресов
Задача: извлечь доменную часть (после @)
Пример: "ivan.petrov@gmail.com" → "gmail.com"
"ivan.petrov@gmail.com" "anna@ya.ru"
*/