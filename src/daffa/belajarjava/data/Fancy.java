package daffa.belajarjava.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    // Jika ingin menggunaka default value
    // saat menggunakan default value dan ada orang yang menggunakan Annotation Fancy ini, maka tidak wajib memasukkan atribut name nya.
//    String name() default "";

    String name();

    String[] tags() default {};

}
