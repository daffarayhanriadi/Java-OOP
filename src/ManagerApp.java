public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Daffa");
//        manager.name = "Daffa";
        manager.sayHello("Budi");

        var vp  = new VicePresident("Joko");
//        vp.name = "Joko";
        vp.sayHello("Budi");

    }
}
