package lesson7.incapsulation;

public class Main {
    public static void main(String[] args) {
        //1. private - приватный, виден только в пределах класса!
        //2. public - публичный, виден всем!
        //3. *default* - дефолтный, виден в пределах пакета!
        //4. protected - защищенный, видел в пределах класса, а наследники в пределах других классов!
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.weight);
    }
}
