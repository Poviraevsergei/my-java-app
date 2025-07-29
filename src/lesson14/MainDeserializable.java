package lesson14;

import java.io.*;

public class MainDeserializable {
    public static void main(String[] args) {
        Cat catFromFile = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\cat-boris.txt"))) {
            catFromFile = (Cat)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("что-то пошло не так :(");
        }

        System.out.println(catFromFile.getAge());
        System.out.println(catFromFile.getName());
    }
}
