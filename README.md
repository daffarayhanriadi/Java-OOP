# Tutorial-Java-OOP-PZN
## Annotation
* `Annotation` adalah menambahkan metadata ke kode program yang kita buat .
* Tidak semua orang membutuhkan `Annotation`, **biasanya** `Annotation` **digunakan** saat kita ingin membuat library / framework.
* `Annotation` sendiri bisa diakses menggunakan `Reflection`, yang akan kita bahas nanti.
* Untuk membuat `annotation`, kita bisa menggunakan kata kunci `@interface`.
* `Annotation` **hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value**.
* Jadi kita bisa menambahkan metadata ke dalam class-class kita, menggunakan `Annotation`.

---

## Attribute Annotation
|Attribute|Keterangan|
|---|---|
|@Target|Memberitahu annotation bisa digunakan di mana? Class, method, field, dan lainnya|
|@Retention|Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection|

---

## Predefined Annotation
Java juga sudah memiliki annotation bawaan, seperti : 
* `@Override`, untuk menandai bahwa method yang meng-override method parent class nya.
* `@Desprected`, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan.
* `@FunctionInterface`, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression.
* dan lainnya.