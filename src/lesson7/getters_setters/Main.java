package lesson7.getters_setters;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(15);
        System.out.println(person.getAge());

        /*
        Создайте класс BankAccount с полями accountNumber и balance (оба private).
        Реализуйте методы deposit(double amount), withdraw(double amount) и getBalance().
         */

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(556);
        System.out.println(bankAccount.getBalance());
    }
}
