package daffa.belajarjava.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Daffa";
        first = first + " " + "Rayhan";
        System.out.println(first);

        String second = "Daffa Rayhan";
        System.out.println(second);

        // false -> ini sebenarnya dia membandingkan apakah dia object yang sama atau bukan, kalau berbeda dia otomatis false
        // jadi bukan isi dari String nya
        // jika System.out.println(first == first); -> otomatis true, karena object nya sama
        System.out.println(first == second); // otomatis false, jarena object nya berbeda.
        System.out.println(first.equals(second));

        String third = "Daffa Rayhan";

        // true -> kenapa? padahal kan object second & third itu berbeda, karena walaupun Objectnya berbeda tapi si Java itu dia meng-optimize memory,
        // jadi kalau misalnya kita membuat String, isi String nya itu sama, maka dia (Java) tidak akan membuat ulang data String nya di memory,
        // jadi dia (Java) akan me-refer ke Object yang sudah ada
        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
