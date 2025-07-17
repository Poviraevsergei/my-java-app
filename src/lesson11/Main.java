package lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*String name = "Angelina";
        String name2 = new String("Angelina");

        //сложение строк
        String name3 = name + name2;
        String name4 = name.concat(name2);
        String name5 = name + name2;
        String name6 = String.join(" ",name,name2);

        //кол-во символов в строке
        System.out.println("PASSWORD".length());

        //символ по позиции
        System.out.println("PASSWORD".charAt(6));

        //index первого/последнего вхождения символа
        System.out.println("PASSWORD".lastIndexOf("S"));
        System.out.println("PASSWORD".indexOf("S"));

        //вырезание подстроки из строки
        System.out.println("PASSWORD".substring(3));
        String result = "PASSWORD".substring(3,6);

        //сравнение
        System.out.println("Hello" == "Hello");
        System.out.println("HELLO".equals("hello"));
        System.out.println("HELLO".equalsIgnoreCase("hello"));
        System.out.println("Hello".compareTo("Hello"));

        //Смена регистра
        System.out.println("Hello world".toLowerCase());
        System.out.println("Hello world".toUpperCase());

        //удаление пробелов по краям строки
        System.out.println("  ser  gey    ".trim());
        System.out.println("  ser  gey    ".stripLeading());
        System.out.println("  ser  gey    ".stripTrailing());

        //замена символов
        String hw = "hello world! my name Sergey! I'm 11 year old!";
        System.out.println(hw.replace("!!","@"));
        //replaceAll принимает регулярное выражение
        System.out.println(hw.replaceAll("[0-9]{2}","@"));

        //разбитие строки на массив символов
        String hw = "hello world! my name Sergey! I'm 11 year old!";
        char[] array = hw.toCharArray();

        //Преобразование в строку
        Long number157Long = 157L; // 157
        String number157String = String.valueOf(number157Long); // "157"

        System.out.println(number157Long + 1);
        System.out.println(number157String + 1); // "1571"

        //Деление строки на массив из строк по делителю
        String numbers = "My name Dima!!!!!!";
        String[] arrayStr = numbers.split(" ");
        for (String n : arrayStr){
            System.out.println(n);
        }

        //Проверка строки на пустоту
        String example = "    ";
        //проверяет есть ли символы в строке включая пробелы, табуляцию
        System.out.println(example.isEmpty());

        //проверяет есть ли символы в строке кроме пробелов, табуляции
        System.out.println(example.isBlank());

        String bookInfo = "Hello Dima. Dima. Dimas!!!";
        System.out.println(bookInfo.startsWith("Hell"));
        System.out.println(bookInfo.endsWith("as!!"));
        System.out.println(bookInfo.contains("Dima."));
        System.out.println(bookInfo.regionMatches(6,"dddDima.",3,6));

        String x = "Hello";
        x = x + " world!";
        String y = "Hello";
        System.out.println("Hello");

        System.out.println(x);

        String name = "Angelina";
        String name2 = new String("Angelina");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        //Из переменной в строку
        String.valueOf(true); // true -> "true"

        //Из строки в переменные boolean, int ,short
        boolean flag = Boolean.parseBoolean("true");;
        int i = Integer.parseInt("58"); // "58" -> 58
        short s = Short.parseShort("58"); // "58" -> 58*/

        //Используя String
        System.out.println("a" + "b"); //"a" "b" "ab"

        StringBuilder sb = new StringBuilder("Hello String Builder!");
        //Добавляет в конец строки
        sb.append(" Append method!");

        //Добавление в середину
        sb.insert(4, "INSERT");

        //Удалить символЫ
        sb.delete(3, 16);

        //Удалить символ
        sb.deleteCharAt(1);

        //заменить символ по индексу
        sb.setCharAt(0, '!');

        sb.reverse();


        StringBuilder strBldr = new StringBuilder("Compare");
        strBldr.toString().split("m");
    }
}
