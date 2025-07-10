package lesson9.task2;

public class Main {
    public static void main(String[] args) {
        /**
         * Абстрактный класс Employee с полями name, id, методом displayInfo() и абстрактным методом calculateSalary().
         * Наследники: SalariedEmployee(Штатный сотрудник), HourlyEmployee(Почасовой сотрудник), CommissionEmployee(Комиссионный сотрудник).
         * Добавить поля по необходимости. Показать зарплату каждого сотрудника в Main.
         */
        Employee employee = new SalariedEmployee("Dima", 1);
        employee.displayInfo();

        employee = new CommissionEmployee("Anton", 3);
        employee.displayInfo();

        employee = new HourlyEmployee("Sasha", 2);
        employee.displayInfo();
    }
}
