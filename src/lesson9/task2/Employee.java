package lesson9.task2;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(calculateSalary());
    }

    public abstract double calculateSalary();
}
