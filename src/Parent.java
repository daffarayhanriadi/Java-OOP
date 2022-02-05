// Variable Hiding
class Parent {
    String name; // Independent

    void doIt() {
        System.out.println("Do it in Parent");
    }
}

class Child extends Parent{
    String name; // Independent, dan sebenarnya tidak terlalu perlu untuk dideklarasikan ulang, karena sudah di diwariskan melalui class Parent
    void doIt() {
        System.out.println("Do it in Child");
        System.out.println("Parent name is " +super.name); // Jika ingin memanggil field yang berada di dalam class Parent (ketika ada variable hiding)
    }
}
