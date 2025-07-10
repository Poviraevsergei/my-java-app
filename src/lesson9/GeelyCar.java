package lesson9;

import java.io.Serializable;

public class GeelyCar implements Car, Cloneable, Serializable {

    @Override
    public void startEngine() {
        System.out.print(Car.WHEELS_COUNT);
    }
}