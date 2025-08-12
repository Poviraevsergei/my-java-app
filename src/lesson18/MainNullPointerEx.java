package lesson18;

import lesson16.User;

import java.util.Optional;
import java.util.Scanner;

public class MainNullPointerEx {
    public static void main(String[] args) {
        /*//Создание объекта Optional;
        Optional<String> optional = Optional.empty();
        Optional<String> optionalOf = Optional.of("Hello Of"); //Мы используем когда уверены что объект существует
        Optional<String> optionalOfNullable = Optional.ofNullable(null); //Мы используем когда НЕ уверены что объект существует*/

        Optional<Employee> employeeOpt = Optional.ofNullable(new Employee(1,"a","b"));
        /*if (employeeOpt.isPresent()) {
            System.out.println(employeeOpt.get().getId());
        }

        //ifPresent - если объект в обертке есть, то выполнится Consumer
        employeeOpt.ifPresent(v -> {
            System.out.println(v + " from Optional");
        });

        //Развернуть обертку
        //Employee employeeFromOpt = employeeOpt.get(); // всегда проверять что value внутри обертки не null!!!
        Employee employeeFromOpt2 = employeeOpt.orElse(new Employee(2));
        employeeOpt.orElseGet(() -> new Employee(3));
        //employeeOpt.orElseThrow();
        employeeOpt.orElseThrow(() -> new ArrayIndexOutOfBoundsException());
        employeeOpt.orElseThrow(ArrayIndexOutOfBoundsException::new);

        System.out.println(employeeFromOpt2.getId());

        //Метод filter
        Optional<Employee> e = employeeOpt.filter(emp -> emp.getId() == 1);

        Integer id = employeeOpt.map(emp -> emp.getId()).orElse(0);
        System.out.println(id);*/

        /**
         * Создать класс Employee с полем id. В Main создать поле employee типа Employee. Заранее мы не
         * знаем лежит там объект или отсутствует. Написать логику, которая будет выводить ID
         * пользователя если объект присутствует в employee, либо 'MAX_VALUE’ в противном случае.
         * Использовать класс Optional.
         */
        Employee employee = null;
        Optional<Employee> employeeOptional = Optional.ofNullable(employee);
        System.out.println(employeeOptional.map(emp -> emp.getSalary()).orElse(Integer.MAX_VALUE));
    }
}
