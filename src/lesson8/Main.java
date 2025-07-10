package lesson8;

public class Main {
    public static void main(String[] args) {
        //Перегрузка
        /*
        Создайте класс AreaCalculator, который будет содержать перегруженные методы calculateArea для
        вычисления площади разных геометрических фигур(квадрат, прямоугольник, круг, трехугольник)

        calculateArea(int side)
        calculateArea(int length, int width)
        calculateArea(double radius)
        calculateArea(double base, double height)

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateArea(10.0));

        //Переопределение метода
        Audi audi = new Audi(400);
        AudiRs audiRs = new AudiRs(200);
        System.out.println(Car.count);

        //Ключевое слово final
        //Class - запрещаем наследование от него (например String)
        //Method - запрещаем переопределение
        //Field - запрещаем изменение поля
        final String DIMA_NAME = "Dima";

        //Ключевое слово static - поле/метод/класс принадлежат классам а не их объектам
        //полям
        //методам
        //класса
        //блокам!!!
        Audi audi = new Audi(100);
        Car car = new Car(100);
        Car car1 = new Car(100);*/

        System.out.println("Тестируем Config класс ..");
        System.out.println(Config.VERSION);
        System.out.println(Config.DATABASE_LOGIN);
        System.out.println(Config.DATABASE_PASSWORD);
    }
}
