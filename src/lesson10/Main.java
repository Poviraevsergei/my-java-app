package lesson10;

public class Main {
    public static void main(String[] args) {
        Banana bananaYellow = new Banana(2, "Yellow");
        Banana bananaGreen = new Banana(2, "Yellow");

        //1. toString - преобразовывает объект в строковое представление
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


        //finalize()



        //TODO: Lombok
    }
}
