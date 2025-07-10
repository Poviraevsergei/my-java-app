package lesson9.task2;

public class CommissionEmployee extends Employee {
    private final double SALARY = 1000;
    private final int TOTAL_DONE = 15;
    private final double MONEY_FOR_ONE_DONE_WORK = 35.5;

    public CommissionEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculateSalary() {
        return SALARY + (TOTAL_DONE * MONEY_FOR_ONE_DONE_WORK);
    }
}
