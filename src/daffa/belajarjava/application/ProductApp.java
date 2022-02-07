package daffa.belajarjava.application;

import daffa.belajarjava.data.Product;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Pro", 30_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        // tampilan object product akan lebih mudah dimengerti ketika kita mengoverride method toString() dan mengedit isi nya.
        System.out.println(product);

    }
}
