package lesson7.incapsulation;

public class Cat {
    public String name = "Борис"; //public
    private int age = 4; //private
    double weight = 10.5; //default
    protected double height = 1.1; //protected

    void printInfo(){
        System.out.println(age);
    }
}
