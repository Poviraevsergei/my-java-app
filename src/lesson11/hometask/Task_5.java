package lesson11.hometask;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        String line = scanner.nextLine();
        StringBuilder doubledString = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            doubledString.append(String.valueOf(line.charAt(i)).repeat(2));
        }
        System.out.println(doubledString);
    }
}