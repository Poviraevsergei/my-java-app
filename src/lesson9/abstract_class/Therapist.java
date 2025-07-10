package lesson9.abstract_class;

public class Therapist extends Doctor {
    @Override
    void threat() {
        System.out.println("Пытаюсь понять что с вами не так ....");
    }
}
