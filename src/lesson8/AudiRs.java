package lesson8;

public class AudiRs extends Audi {
    public AudiRs(int speed) {
        super(speed);
    }

    //Переопределить логику в методах!!

    @Override //Аннотация
    void startAndGo() {
        System.out.println("Это машина пушка пуля!");
        System.out.println("Она разгоняется до " + getSpeed() + " km/h !!!");
    }

    public void hello(){

    }
}
