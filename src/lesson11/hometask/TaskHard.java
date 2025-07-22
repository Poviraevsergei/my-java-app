package lesson11.hometask;

import java.util.Scanner;

public class TaskHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber <= words.length && (inputNumber > 0)) {
                StringBuilder stringBuilder = new StringBuilder(words[inputNumber - 1]);
                System.out.println(stringBuilder);
                if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }
            } else {
                System.out.println("There is no such word in string");
            }
        } else {
            System.out.println("Incorrect input, must be Integer");
        }
    }
}