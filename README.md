# Tutorial-Java-OOP-PZN
## Enum Class
* Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas.
* Misal, gender, ada male dan female, atau tipe costumer, ada standard, premium atau VIP, dan lainnya.
* Dalam kasus seperti ini, kita bisa menggunakan `class Enum`, yaitu class yang berisikan nilai terbatas yang sudah ditentukan.
* Saat membuat **class Enum**, secara otomatis dia akan `extends` class `java.lang.Enum`, oleh karena itu class Enum tidak bisa `extends` class lain, namun masih tetap bisa `implements` interface.
* Konversi String &#8594; Enum & Enum &#8594; String
* Jika ingin mengambil nama Enum, bisa menggunakan function `nama()` &#8594; `namaClassEnum.namaEnum/Field.name()`
* Jika ingin konversi String &#8594; Enum, bisa menggunakan function yang namanya `valueOf()`&#8594;`namaClassEnum.valueOf(namaEnum/Field)`
* Jika ingin mendapatkan available semua Enum Optionnya, bisa menggunakan function `values()`&#8594;`namaClassEnym.values()`.
---

## Enum Members
* Sama seperti class biasanya, di class Enum pun kita bisa **menambahkan members** (field, method dan constructor).
* `Khusus constructor`, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas.