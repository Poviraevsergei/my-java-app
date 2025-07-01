package lesson6;

import java.util.Scanner;

public class SnakeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 0;

        //Заполнение
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }

        //Вывод
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] >= 0 && ints[j] < 10) {   //0-9 -> "  4"
                    System.out.print("  " + ints[j]);
                } else if (ints[j] > 9 && ints[j] < 100) { //10-99 -> " 44"
                    System.out.print(" " + ints[j]);
                } else if (ints[j] >= 100 && ints[j] < 1000) { //100-999 -> "444"
                    System.out.println(ints[j]);
                }
            }
            System.out.printf("Text %s", "15");

        }
    }
}
