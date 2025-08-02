package lesson15.generic;

import java.util.ArrayList;

public class AnimalGeneric<T> {
    public ArrayList<T> listAnimal = new ArrayList<>();


    @Override
    public String toString() {
        return "FirstGeneric{" +
                "animal=" + listAnimal +
                '}';
    }
}
