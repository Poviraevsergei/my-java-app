package lesson11.hometask;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        for (String word : array) {
            for (int i = 0; i < word.length(); i++) {
                for (int k = i + 1; k < word.length(); k++) {
                    if (word.charAt(i) != word.charAt(k)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("Unique word " + word);
                break;
            }
        }
    }
}