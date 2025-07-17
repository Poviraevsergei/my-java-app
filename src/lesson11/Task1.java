package lesson11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*      Пользователь вводит строку (Например Мама).Нужно вывести в консоль:

        М
        Ма
        Мам
        Мама
        */

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        for (int i = 1; i <= inputLine.length(); i++) {
            System.out.println(inputLine.substring(0, i));
        }

        scanner.close();
    }
}
