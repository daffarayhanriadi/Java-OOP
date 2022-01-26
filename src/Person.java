public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String name) {
        System.out.println("Hello  " + name + ", My Name Is " + this.name);
    }
}
