package lesson5;

import java.util.Random;

public class SumElements {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[500][500];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //1. найти сумму эл-тов главной диагонали
        int sumMain = 0;
        for (int i = 0; i < array.length; i++) {
            sumMain += array[i][i]; //[0][0]    [1][1]     [2][2] ...
        }
        System.out.println("\n" + sumMain);

        //2. найти сумму эл-тов побочной диагонали
        int sum = 0;
/*        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == 4) {
                    sum += array[i][j];
                }
            }
        }*/
        for (int i = 0, j = array[0].length - 1; i < array.length; i++, j--) {
            sum += array[i][j];
        }
        System.out.println("\n" + sum);
    }
}
