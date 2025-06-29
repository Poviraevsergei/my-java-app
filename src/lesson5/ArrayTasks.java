package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
/*        // Сдвингуть элементыв массива на 1 ячейку вправо. [1,2,3,4,5]   ->    [5,1,2,3,4]
        int[] array = {41, 51, 22, 4, 14};      //5 1 2 3 4
        int lastNumber = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastNumber;

        System.out.println(Arrays.toString(array));*/

        // Удалить эд-т по значению в массиве и вернуть новый массив Без этого значения
        int[] array = {100, 27, 31, 14, 31, 61, 77};
        int countTarget = 0;

        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        for (int number : array) {
            if (target == number) {
                countTarget++;
            }
        }

        int[] resultArray = new int[array.length - countTarget];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != target) {
                resultArray[j++] = array[i];
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }
}
