package daffa.belajarjava.application;

//Static Import -> sehingga jika mengakses tidak perlu memanggil nama class nya lagi
import static daffa.belajarjava.data.Application.PROCESSORS;
import static daffa.belajarjava.data.Constant.*;
import daffa.belajarjava.data.Country;
import daffa.belajarjava.data.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // Cara mengakses static Field
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // Cara mengakses static Method
        System.out.println(MathUtil.sum(1,1,1,1,1));

        // Cara mengakses static inner Class
        Country.City city = new Country.City();
        city.setName("Medan");
        System.out.println(city.getName());

        // Static Block
        System.out.println(PROCESSORS);

    }
}
