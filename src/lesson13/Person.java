package lesson13;

public class Person {
    private int age;

    public Person(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException(age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
