package lesson7;

public class Person {
    private String name;
    int age;

    public Person() {
        System.out.println("This is Person constructor!");
    }

    public Person(int age) {
        this.age = age;
    }
}
