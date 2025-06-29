package lesson5;

public class MainArray {
    public static void main(String[] args) {
        //Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.

        //Создание массива
        int[][][] array = {{{1, 2}, {3, 4, 5}}, {{5, 6, 7}, {8}}, {{9}}};
        int count = 0;

        //Кол-во ячеек
        for (int[][] firstArray : array) {
            for (int[] secondArray : firstArray) {
                for (int value : secondArray) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
