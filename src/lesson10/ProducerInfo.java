package lesson10;

public class ProducerInfo implements Cloneable {
    private String country = "Brazil";

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
