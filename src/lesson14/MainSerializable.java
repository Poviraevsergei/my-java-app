package lesson14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializable {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris", 4);

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("D:\\cat-boris.txt"))) {
            ous.writeObject(cat);
        } catch (IOException e) {
            System.out.println("что-то пошло не так :(");
        }
    }
}
