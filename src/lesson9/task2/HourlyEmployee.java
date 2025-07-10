package lesson9.task2;

public class HourlyEmployee extends Employee {
    private final int HOURS = 60;
    private final double COST_IN_HOUR = 50.0;

    public HourlyEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculateSalary() {
        return HOURS * COST_IN_HOUR;
    }
}
