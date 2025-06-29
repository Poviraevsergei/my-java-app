package lesson5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создать двумерный массив, заполнить значениями(Random), найти максимальное.
        Random random = new Random();
        int maxValue = 0;

        //Создание массива
        int[][] array = new int[3][2];

        //заполнить
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10, 20);
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Max value: " + maxValue);
    }
}