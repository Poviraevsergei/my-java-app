package lesson9.task1;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав гав");
    }

    @Override
    public void move() {
        System.out.println("Бежит");
    }

    @Override
    public void eat() {
        System.out.println("есть мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Легла спать.. храпит");
    }
}
