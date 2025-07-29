package lesson14;

import java.io.Serializable;

//Обязательно добавить интерфейс-маркер Serializable!!!
public class Cat implements Serializable {
    private String name;
    private transient int age; // не записывай это значение

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
