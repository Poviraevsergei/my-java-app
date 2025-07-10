package lesson10;

import java.io.Serializable;
import java.util.Objects;

public class Banana implements Cloneable, Serializable {
    int cost;
    String color;

    public Banana(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    //toString()
    @Override
    public String toString() {
        return "Banana{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banana banana = (Banana) o;
        return cost == banana.cost && Objects.equals(color, banana.color);
    }

/*    //finalize - сборщик мусора GC(GarbageCollector)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Нельзя использовать начиная с 9 версии Java");
    }*/
}
