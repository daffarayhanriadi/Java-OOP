package programmer.zaman.now.data;

public abstract class Animal {
    public String name;

    // karena di class abstract membuat method abstract juga, maka semua turunan dari class abstract harus meng-override
    // method yang ada di dalam class Abstract
    public abstract void run();
}
