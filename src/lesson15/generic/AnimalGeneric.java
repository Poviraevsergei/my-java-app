package lesson15.generic;

import java.util.ArrayList;

public class AnimalGeneric<T> {
    public ArrayList<T> listAnimal = new ArrayList<>();

    public <G> void printArray(G[] array) {
        for (G element : array) {
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        return "FirstGeneric{" +
                "animal=" + listAnimal +
                '}';
    }
}
