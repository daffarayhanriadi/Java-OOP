package daffa.belajarjava.data;

public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();

    default boolean isBig() { // default method, tidak wajib di override
        return false;
    }

}
