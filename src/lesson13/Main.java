package lesson13;


import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeException {
/*    // Непроверяемые исключения - Java не проверяет перед запуском
        int[] array = new int[1];
        System.out.println(array[100]); //ArrayIndexOutOfBoundsException

    // Проверяемые исключения - Java обязывает обработать(tryCatch || throws) проверяемые исключения
        FileInputStream fis = new FileInputStream("path"); //FileNotFoundException

        System.out.println("Текст который мы не увидим!");
        //Обработка с помощью Try catch
        try {
            FileInputStream f = new FileInputStream("");
        } catch (ArithmeticException | IOException e) {
            System.out.println(e); // save to logs
        }

        //try-with-resources - сам закрывает соединения! Интерфейс AutoClosable закрывает соединения!
        try (Scanner scanner = new Scanner(System.in)) {
            //опасный код
        } catch (ArithmeticException e) {
            //ловит исключение
        }

        //throw - выбрасывает исключение!
        throw new MyCustomException();*/


        exampleMethod();
    }

    public static void exampleMethod() throws AgeException {
        Person person = new Person(7);
    }
}
