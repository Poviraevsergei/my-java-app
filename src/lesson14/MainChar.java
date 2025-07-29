package lesson14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainChar {
    public static void main(String[] args) {
        //Выгрузка текста из файла в Java(символьный поток FileReader)
        StringBuilder stringBuilder = new StringBuilder();
        boolean success = false;
        try (FileReader fr = new FileReader("D:\\char36.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                stringBuilder.append((char) i);
            }
            success = true;
        } catch (IOException e) {
            System.out.println("Не нашел нужный файл!");
        }

        if (success) {
            System.out.println("Я готов!!");
            System.out.println(stringBuilder);
        }

        //Загрузка текста в файл из Java(символьный поток FileWriter)
        try(FileWriter fw = new FileWriter("D:\\fromJava.txt", true)) {
            fw.write("Hello");
            fw.write("world");
            fw.write("Group");
            fw.write("c36");
            fw.write(":)");
            fw.flush(); //Commit(сохранение, подтверждение операции) комитит изменения
            System.out.println("Я сохранил сообщение!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
