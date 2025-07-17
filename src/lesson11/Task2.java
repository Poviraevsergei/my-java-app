package lesson11;

public class Task2 {
    public static void main(String[] args) {
        // Пользователь вводит строку, вернуть кол-во слов в строке.
        String inputLine = "Hello   world!!This is test line!"; //6
        int count = 0;
        String[] stringArray = inputLine.replace("!", " ").split(" ");
        for (String element : stringArray) {
            if (!element.isBlank()) {
                count++;
                System.out.println(element);
            }
        }

        System.out.printf("В предложении %d слов", count);
    }
}


