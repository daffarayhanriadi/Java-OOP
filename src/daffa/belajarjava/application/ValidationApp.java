package daffa.belajarjava.application;

import daffa.belajarjava.data.LoginRequest;
import daffa.belajarjava.data.ValidationException;
import daffa.belajarjava.data.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("daffa", "rahasia");

        // Checked Exception
        // digunakan
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        // Runtime Exception tidak wajib menggunakan try-catch lagi
        // Biasanya digunakan agar code nya kelihatan lebih rapi
        // Jika ketika membuat web (web mvc/model) dan menggunakan try-catch, maka tampilan code akan terlihat jelek
        // Jika menggunakan Runtime Exception bisa membuat nama error nya di satu tempat dan juga error nya cukup di satu tempat juga, sehingga tidak memperbanyak try-catch
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
