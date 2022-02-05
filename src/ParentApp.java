public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Daffa";
        child.doIt();
        System.out.println(child.name); // Mengakses name yang berada di dalam class Child

        // Casts (Parent) -> sebenarnya tidak perlu di buat secara eksplisit
        Parent parent = (Parent) child; // Parent parent = (Parent) child <- Object nya;
        parent.doIt(); // -> doIt disini diambil dari class Child, karena sebelumnya Object dari parent adalah class Child
        System.out.println(parent.name); // Mengakses name yang berada di dalam class Parent
    }
}
