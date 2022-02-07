package daffa.belajarjava.data;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    // Gunakan saja Generator IDE
    // Jadi Selalu direkomendasikan untuk meng-Override method equals() ketika membuat Class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }


    // disarankan untuk tidak Override secara manual
//    public boolean equals(Object o) {
//        if (0 == this) {
//            return true;
//        }
//
//        if (!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if (this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }

}
