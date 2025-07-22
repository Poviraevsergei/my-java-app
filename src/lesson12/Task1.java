package lesson12;

public class Task1 {
    public static void main(String[] args) {
        /*
        Удаление повторяющихся пробелов
        Задача: заменить все последовательности пробелов на один
        Пример: "Это   пример       текста  " → "Это пример текста"
         */

        String input = "Это     пример       текста  ";

        input = input.replaceAll("\\s+"," ");

        System.out.println(input);
    }
}
