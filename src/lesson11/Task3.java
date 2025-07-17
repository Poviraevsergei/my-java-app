package lesson11;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
       Пользователь вводит строку из чисел через запятую(например 3,8,9,23,27) и число.
       Нужно вернуть массив с числами из строки которые меньше чем число которое ввел пользователь.
        */
        String inputLine = "3,8,9,23,2,27,4,6";
        int number = 7;
        int arraySize = 0;

        String[] array = inputLine.split(",");
        for (String numberString : array) {
            if (Integer.parseInt(numberString) < number) {
                arraySize++;
            }
        }

        String[] resultArray = new String[arraySize];
        for (int i = 0, j = 0; i <= array.length - 1; i++) {
            if (Integer.parseInt(array[i]) < number) {
                resultArray[j++] = array[i];
            }
        }
        Arrays.sort(resultArray);
        System.out.println(Arrays.toString(resultArray));
    }
}


