class Manager {
    String name;
    String company;

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    Manager(String name) {
        this(name,null);
    }

    // default constructor
    Manager() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hi"+ name + ". My Name Is Manager " + this.name);
    }

}

