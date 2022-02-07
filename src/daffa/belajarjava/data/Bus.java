package daffa.belajarjava.data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "HINO";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    // method default, tidak harus di deklarasikan ulang di dalam class Child
    @Override
    public boolean isBig() {
        return true;
    }
}
