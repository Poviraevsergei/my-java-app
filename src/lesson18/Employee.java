package lesson18;

public class Employee {
    private Integer salary;
    private String department;
    private String name;

    public Employee(Integer salary, String department, String name) {
        this.salary = salary;
        this.department = department;
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "name=" + name +
                ", department='" + department + '\'' +
                '}';
    }
}
