package lesson7.getters_setters;

public class Person {
    private int age;
    private String name;

    //Геттеры Сеттеры
    //Геттеры - методы которые возвращают значения полей
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
