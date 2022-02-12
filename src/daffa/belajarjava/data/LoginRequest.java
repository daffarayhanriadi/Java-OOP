package daffa.belajarjava.data;

// Bisa dikatakan ini adalah constructor dan juga otomatis menjadi Field
public record LoginRequest(String username, String password) {

    // compact constractor tidak membuat parameter lagi, karena sudah dideklarasikan pada class diatas
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    // constractor overloading
    public LoginRequest(String username) {
        this(username, ""); // harus memanggil constructor utamanya
    }

    public LoginRequest() {
        this("", ""); // harus memanggil constructor utamanya
    }

    public void sayHello() {

    }
}
