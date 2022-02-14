package daffa.belajarjava.application;

import daffa.belajarjava.data.Animal;
import daffa.belajarjava.data.Cat;

public class FancyApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
