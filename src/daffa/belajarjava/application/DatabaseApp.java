package daffa.belajarjava.application;

import daffa.belajarjava.data.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        // Bisa saja menggunakan try-catch
        // Bisa saja ketangkap error nya, tapi jenis Database error ini karena dia extends nya error, ini sangat
        // tidak direkomendasikan untuk di tangkap.
//        try {
//            connectDatabase("daffa", null);
//            System.out.println("Sukses");
//        } catch (DatabaseError error) {
//            System.out.println("Error " + error.getMessage());
//        }

        // jika ingin membuat jenis error seperti ini ya memang kalau bisa error-error yang sangat fatal sekali.
        // Jangan karena error nya validasi, sehingga menggunakan Error (jangan), ya kalau memang validasi bisa menggunakan Runtime Exception.
        // Tetapi jika jenis nya seperti tidak bisa connect ke database atau salah setting dan sebagainya, yang menyebabkan apk nya tidak berjalan dengan baik
        // bisa menggunakan Exception jenis Error.
        connectDatabase("daffa", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}
