public class Main {
    public static void main(String[] args) {

        var manager = new Manager();
        System.out.println(manager);
//      otomatis sudah menggunakan .toString() karena Manager adalah turunan class Object
//      System.out.println(manager.toString());
//      Manager@65ab7765 -> value nya
    }
}
