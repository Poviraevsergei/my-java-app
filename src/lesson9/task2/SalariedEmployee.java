package lesson9.task2;

public class SalariedEmployee extends Employee {
    private final double SALARY = 2000.0;

    public SalariedEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculateSalary() {
        return SALARY;
    }
}
