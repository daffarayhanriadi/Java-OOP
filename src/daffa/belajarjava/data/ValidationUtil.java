package daffa.belajarjava.data;

public class ValidationUtil {

    // Checked Exception                                                   Multiple Try Catch (1) di method yang sama
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Pasword is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Pasword is blank");
        }
    }

    // Runtime Exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Pasword is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Pasword is blank");
        }
    }

}
