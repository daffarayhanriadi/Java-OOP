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
    static void sayHello(Employee employee) {
        System.out.println("Hello "+ employee.name);
    }
}
