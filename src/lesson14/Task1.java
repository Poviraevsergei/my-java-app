package lesson14;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Задача 1:
           Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
           пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
           все пробелы на знак нижнего подчеркивания.
         */

        File file = new File("D:\\tms.txt");
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(file);
        ) {
            String textFromScanner = scanner.nextLine();
            fos.write(textFromScanner.getBytes());
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = fis.read()) != -1) {
                sb.append((char) i);
            }
            System.out.println(sb.toString().replaceAll(" ", "_"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
