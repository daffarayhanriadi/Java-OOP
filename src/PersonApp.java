public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person(); // cara 1 buat object

        person1.name = "Daffa";
        person1.address = "Medan";
//        person1.country = "Amerika" ERROR karena sudah final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person(); // cara 2 buat object
        Person person3; // cara 3 buat object
        person3 = new Person();
    }
}
