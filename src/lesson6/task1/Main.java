package lesson6.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Создание оружия
        String weaponName = scanner.next();
        Weapon weaponObject = new Weapon(weaponName);

        //Создание героя
        String playerName = scanner.next();
        Player player = new Player(playerName, weaponObject);

        //Запуск метода атаки
        player.attack();
    }
}
