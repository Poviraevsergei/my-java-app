package lesson10;

import java.util.Objects;

public class Banana implements Cloneable {
    private int cost;
    private String color;
    private ProducerInfo producer;

    public Banana(int cost, String color, ProducerInfo producer) {
        this.cost = cost;
        this.color = color;
        this.producer = producer;
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

    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(cost, color);
    }

    //clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //1. клонировать банан
        Banana clonedbanana = (Banana) super.clone();

        //2. достаем производителя и клонируем его!!!!
        ProducerInfo producerInfoCloned = (ProducerInfo) this.getProducer().clone();

        //3. сохраняем клон производителя в банан
        clonedbanana.setProducer(producerInfoCloned);
        return clonedbanana;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ProducerInfo getProducer() {
        return producer;
    }

    public void setProducer(ProducerInfo producer) {
        this.producer = producer;
    }

/*    //finalize - сборщик мусора GC(GarbageCollector)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Нельзя использовать начиная с 9 версии Java");
    }*/
}
