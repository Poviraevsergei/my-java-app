package lesson9.task1;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.print("Чирик");
    }

    @Override
    public void move() {
        System.out.print("Летит");
    }

    @Override
    public void eat() {
        System.out.print("Ест семки");
    }

    @Override
    public void sleep() {
        System.out.print("Стоит и спит");
    }
}
