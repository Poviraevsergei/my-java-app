package lesson8;

public class AreaCalculator {
    long calculateArea(int side) {
        return (long) side * side;
    }

    long calculateArea(int length, int width) {
        return (long) length * width;
    }

    double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    double calculateArea(double base, double height) {
        return base * height / 2;
    }
}
