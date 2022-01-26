public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person(); // cara 1
        Person person2 = new Person(); // cara 1
        Person person3; // cara 1
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
