package lesson11.hometask;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        int sumLength = 0;
        System.out.println("Enter " + array.length + " strings: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
            sumLength += (array[i].length());
        }
        for (String word: array) {
            if (word.length() < Math.round((double) sumLength / array.length)) {
                System.out.println("String with length lower than average: " + word + "; length: " + word.length());
            }
        }
    }
}