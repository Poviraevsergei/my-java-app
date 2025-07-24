package lesson14;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileInput = new File("D:\\images.png");
        File fileOutput = new File("D:\\test\\fromJava.png");

        if (fileInput.exists()) {
            System.out.println("Файл существует!");
        }

        //Потоки ввода вывода: байтовые(фото, видео etc.) и символьные(текстовые)

        //Byte input FileInputStream [01010101]
        byte[] photo = new byte[(int) fileInput.length()];
        int index = 0;

        try (FileInputStream fis = new FileInputStream(fileInput)) {
            int i;
            while ((i = fis.read()) != -1) {
                photo[index++] = (byte) i;
            }
            //or just fis.read(photo);
        } catch (IOException ex) {
            System.out.println("Файл не существует :(");
            System.out.println(ex.getMessage());
        }

        //Byte output FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(fileOutput)) {
            fos.write(photo, 0, photo.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
