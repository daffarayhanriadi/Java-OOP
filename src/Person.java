public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name Is " + this.name);
    }
}
