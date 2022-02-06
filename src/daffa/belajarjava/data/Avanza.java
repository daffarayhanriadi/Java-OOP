package daffa.belajarjava.data;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
