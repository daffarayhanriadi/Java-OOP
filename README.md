# Tutorial-Java-OOP-PZN
## Annotation
* `Annotation` adalah menambahkan metadata ke kode program yang kita buat .
* Tidak semua orang membutuhkan `Annotation`, **biasanya** `Annotation` **digunakan** saat kita ingin membuat library / framework.
* `Annotation` sendiri bisa diakses menggunakan `Reflection`, yang akan kita bahas nanti.
* Untuk membuat `annotation`, kita bisa menggunakan kata kunci `@interface`.
* `Annotation` **hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value**.

---

## Attribute Annotation
|Attribute|Keterangan|
|---|---|
|@Target|Memberitahu annotation bisa digunakan di mana? Class, method, field, dan lainnya|
|@Retention|Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection|