public class Person {
    String name;
    String address;
    final String country = "Indonesian";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) {
        this.name = name;
    }

    Person() {
    }

    void sayHello(String name) {
        System.out.println("Hello" + name + ", My Name Is " + this.name);
    }
}
