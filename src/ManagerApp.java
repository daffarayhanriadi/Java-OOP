public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Daffa";
        manager.sayHello("Budi");

        var vp = new VisePresident();
        vp.name = "Joko";
        vp.sayHello("Budi"); // method sayHello otomatis bisa digunakan.
    }
}
