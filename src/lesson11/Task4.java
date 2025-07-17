package lesson11;

public class Task4 {
    public static void main(String[] args) {
        //Метод isPalindrome(String input) проверяет, является ли строка палиндромом.
        //Условие: Игнорировать регистр и пробелы. Пример: "   A bcba" - true. Не использовать for.

        String inputLine = "   A bcba".replace(" ", "").toLowerCase();

        int left = 0;
        int right = inputLine.length() - 1;

        while (left < right) {
            if (inputLine.charAt(left) != inputLine.charAt(right)) {
                System.out.println("Это не палиндром :(");
                return;
            }

            left++;
            right--;
        }
        System.out.println("Это палиндром :)");
    }
}