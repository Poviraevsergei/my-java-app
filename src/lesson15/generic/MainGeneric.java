package lesson15.generic;

public class MainGeneric {
    public static void main(String[] args) throws NoSuchFieldException {
        Integer[] arr = new Integer[2];
        arr[0] = 10;
        arr[1] = 20;

        AnimalGeneric<String> catZoo = new AnimalGeneric<>();
        catZoo.printArray(arr);
    }
}
