package lesson12;

public class Task5 {
    public static void main(String[] args) {
        String input = "<div>Hello</div> <i>world</i> and one < tree and > two";
        String regex = "</?\\w+>";

        input = input.replaceAll(regex,"");

        System.out.println(input);
    }
}
/*
5. Удаление HTML-тегов из текста
Дано: строка с HTML
Задача: удалить все теги, оставив только текст
Пример: "<b>Hello</b> <i>world</i>" → "Hello world"
 */

