package lesson10;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProducerInfo producerInfo = new ProducerInfo();

        Banana bananaFirst = new Banana(2, "Yellow", producerInfo);
        Banana bananaSecond = (Banana) bananaFirst.clone();

        bananaSecond.getProducer().setCountry("Belarus");

        System.out.println(bananaFirst.getProducer().getCountry());
        System.out.println(bananaSecond.getProducer().getCountry());

        /*//1. toString - преобразовывает объект в строковое представление
        System.out.println(bananaGreen);

        //2. getClass() - возвращает метаданные класса
        Class classInfo = bananaGreen.getClass();
        System.out.println(classInfo.getName());
        for (Class inter : classInfo.getInterfaces()) {
            System.out.println(inter.getName());
        }

        //3. equals
        //Сравнение с помощью '==' - это сравнение ссылок
        System.out.println(bananaGreen == bananaYellow);

        //Equals должен сравнивать поля объектов!!!
        //Но нужно переопределить логику чтобы работал корректно!!!
        //По умолчанию использует '=='
        System.out.println(bananaGreen.equals(bananaYellow));

        //hashCode (int) - Если мы не переопределяем, то получаем значение основанное на области памяти(рандом)
        System.out.println(bananaYellow.hashCode());
        System.out.println(bananaGreen.hashCode());

        //Если мы не переопределяем, то сравниваются ссылки
        System.out.println(bananaYellow.equals(bananaGreen));*/


        //TODO: Lombok
    }
}
