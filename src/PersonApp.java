public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person(); // cara 1 membuat object
        Person person2 = new Person(); // cara 2 membuat object
        Person person3; // cara 3 membuat object
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
