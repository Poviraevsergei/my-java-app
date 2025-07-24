package lesson13;

//1. extends Exception(good point!) or RuntimeException(bad way!)
//2. toString override
public class AgeException extends Exception {

    private int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age exception: you input " + age + " but need more/equals than 18";
    }
}
