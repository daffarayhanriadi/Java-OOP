package daffa.belajarjava.application;

import daffa.belajarjava.data.LoginRequest;
import daffa.belajarjava.data.ValidationException;
import daffa.belajarjava.data.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // Tidak valid jika null,null
        // Valid jika ada isi
        LoginRequest loginRequest = new LoginRequest(null, "rahasia");

        // Multiple Try Catch (1)
        try {
            // jika tidak menggunakan try-catch maka method validate() akan error karena sebelumnya sudah ditandai throws
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
            // Jika Multiple Try Catch (1)
        } catch (NullPointerException exception) {
            System.out.println("Data null : " + exception.getMessage());
        }


        // Multiple Try Catch (2)
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        }

        // Finally
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

    }
}
