package daffa.belajarjava.data;

public enum Level {

    // Kebiasaan membuat fieldnya huruf kapital semua.
    STANDARD("Standart Level"), // karena membuat constructor, maka harus di buat juga untuk fieldnya
    PREMIUM("Premium Level"),
    VIP("Vip Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
