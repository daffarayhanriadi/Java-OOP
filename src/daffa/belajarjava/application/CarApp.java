package daffa.belajarjava.application;

import daffa.belajarjava.data.Avanza;
import daffa.belajarjava.data.Car;

public class CarApp {
    public static void main(String[] args) {

//        Car cars = new Car(); // ERROR -> karena class Abstract

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

    }
}
