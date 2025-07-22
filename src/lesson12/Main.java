package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String names = "Dima Alina";

        //Хранит шаблон(регулярное выражение)
        Pattern pattern = Pattern.compile("[A-z]{3}");

        //Создание поисковика(он еще не запущен)
        Matcher matcher = pattern.matcher(names);
        //matcher.region(2,8);

/*        //Ищет С НАЧАЛА есть ли сопоставление шаблону
        System.out.println(matcher.lookingAt());*/

        StringBuilder sb = new StringBuilder();

        //Запускаем поиск
        while (matcher.find()) {
            //1 variant
/*            System.out.println("From " + matcher.start());
            System.out.println("To " + matcher.end());
            System.out.println(matcher.group());*/

            //2 variant
           // matcher.appendReplacement(sb,"!?");
        }

        //2 variant
       // matcher.appendTail(sb);

        //Экранирование $ \\
        System.out.println(Matcher.quoteReplacement("Test \\n and $"));

        System.out.println(sb);
    }
}
