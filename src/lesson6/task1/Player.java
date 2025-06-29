package lesson6.task1;

import java.util.Random;

class Player {
    String type; //Воин(+ 10-40%) Маг(- 10-40%)
    Weapon weapon;

    Player(String type, Weapon weapon) {
        this.type = type;
        this.weapon = weapon;
    }

    void attack() {
        Random random = new Random();
        float resultDamage;
        if (type.equals("воин")) {
            resultDamage = weapon.damage * random.nextFloat(1.1f, 1.4f);
        } else if (type.equals("маг")) {
            resultDamage = weapon.damage * random.nextFloat(0.6f, 0.9f);
        } else {
            System.out.println("Это не воин и не маг.");
            return;
        }
        //ТОТ-ТО атакует ТАКИМ-ТО ОРУЖИЕМ на СТОЛЬКО-то урона
        System.out.println(type + " атакует и " + weapon.name + " наносит " + resultDamage + " урона.");
    }
}
