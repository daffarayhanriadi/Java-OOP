public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person(); // cara 1 membuat object

        person1.name = "Daffa";
        person1.address = "Medan";
//        person1.country = "Amerika" ERROR karena sudah final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person(); // cara 2 membuat object
        Person person3; // cara 3 membuat object
        person3 = new Person();
        person3.name = "Joko"; // Sehingga bisa di handle dengan ini (kondisi di bawah)
        person3.sayHello("Budi"); // Null karena tipe data yang ada di dalam object belum dideklarasikan
    }
}
