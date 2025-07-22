package com.tms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        Arrays.sort(array, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(array));
    }
}


	/*String temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

// Первый проход: сравниваем и упорядочиваем string1 и string2
if (string1.length() > string2.length()) {
    temp = string1;
    string1 = string2;
    string2 = temp;
}

// Второй проход: сравниваем и упорядочиваем string2 и string3
if (string2.length() > string3.length()) {
    temp = string2;
    string2 = string3;
    string3 = temp;
}

// Третий проход: снова сравниваем string1 и string2
if (string1.length() > string2.length()) {
    temp = string1;
    string1 = string2;
    string2 = temp;
}*/