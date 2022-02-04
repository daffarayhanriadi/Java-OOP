public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        name = name; // field nama tidak berubah karena tertutupi oleh variable parameter
        address = address; // field address tidak berubah karena tertutupi oleh variable parameter
    }

    Person(String name) {
        this(name,null);
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name Is " + name);
    }
}
