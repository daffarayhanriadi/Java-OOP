package daffa.belajarjava.application;

import daffa.belajarjava.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // Object 1
        HelloWorld english = new HelloWorld() {

            // Anonymous class
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        // Object 2
        HelloWorld indonesia = new HelloWorld() {

            // Anonymous class
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };


        // Call
        english.sayHello();
        english.sayHello("Daffa");

        indonesia.sayHello();
        indonesia.sayHello("Daffa");
    }
}
