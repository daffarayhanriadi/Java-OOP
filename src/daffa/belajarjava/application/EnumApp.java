package daffa.belajarjava.application;

import daffa.belajarjava.data.Costumer;
import daffa.belajarjava.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Costumer costumer = new Costumer();
        costumer.setName("Daffa");
        costumer.setLevel(Level.PREMIUM);

        System.out.println(costumer.getName());
        System.out.println(costumer.getLevel());
        System.out.println(costumer.getLevel().getDescription());

        // Konversi Enum
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM"); // harus memasukkan Enum yang benar / tidak boleh salah
        System.out.println(level);

        // Jika teman" ingin mengambil opsi Enum yang ada
        System.out.println("Print Level");
        for (var value : Level.values()) { // bisa menggunakan ini -> Level.values() / menggunakan method values()
            System.out.println(value);
        }

        // Konversi String &#8594; Enum & Enum &#8594; String
        // Jika ingin mengambil nama Enum, cukup `namaClassEnum.namaEnum/Field.name()`
        // Jika ingin konversi String &#8594; Enum, bisa menggunakan function yang namanya `valueOf()` &#8594; `namaClassEnum.valueOf(namaEnum/Field)`
        // Jika ingin mendapatkan available semua Enum Optionnya, bisa menggunakan function `values()` &#8594; `namaClassEnym.values()`.

    }
}
