class VicePresident extends Manager {

    // karena ada constructor di dalam class Parent maka class Child wajib memanggil constructor dari class Parent (jika memiliki parameter)
    // jika constructor nya ada 2 maka harus memanggil minimal satu constructor saja
    // jika class Parent hanya mmeiliki default constructor maka class Child tidak wajib untuk memanggil ulang

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi "+ name + ". My Name Is VP " + this.name);
    }
}