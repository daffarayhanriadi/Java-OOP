class PolymorphismApp {
    public static void main(String[] args) {

        // Polimorfimse => dapat berubah bentuk suatu objek ke objek lain

        Employee employee = new Employee("Daffa");
        employee.sayHello("Budi");

        employee = new Manager("Daffa");
        employee.sayHello("Budi");

        employee = new VicePresident("Daffa");
        employee.sayHello("Budi");

        sayHello(new Employee("Daffa"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    // Method Polymorphism
//    static void sayHello (Employee employee){
//    System.out.println("Hello " + employee.name);
//    }

    // Type Check & Casts
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) { // Check
            VicePresident vicePresident= (VicePresident) employee; // Casts
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof Manager) { // Check
            Manager manager = (Manager) employee; // Casts
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello "+ employee.name);
        }
    }
}
