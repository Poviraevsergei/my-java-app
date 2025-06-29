package lesson6.task1;

class Weapon {
    String name;
    int damage;

    Weapon(String name) {
        this.name = name;
        switch (name) {
            case "топор" -> this.damage = 40;
            case "нож" -> this.damage = 30;
            case "посох" -> this.damage = 20;
            case null, default -> this.damage = 5;
        }
    }
}
