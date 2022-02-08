# Tutorial-Java-OOP-PZN
## Record Class
* Kadang-kadang kita sering membuat class, hanya untuk class yang berisikan data `(getter(), equals(), hashCode(), dan toString() method)`.
* Record class digunakan untuk mempermudah pembuatan jenis class tersebut dan juga sebagai tempat penyimpanan data.
* Record class bersifat immutable (tidak bisa dirubah) parameter yang ditambahkan di dalam class Record bersifat final.
* Saat kita membuat record class, secara otomatis Java akan membuatkan `getter(), equals(), hashCode(), dan toString() method` secara otomatis, dan juga `constructor` secara otomatis.
* Saat membuat record class, secara otomatis kita akan meng-extends class `java.lang.Record`, yang artinya kita tidak bisa extends class lain.
* Namun kita tetap bisa `implements` interface.
* Di Java Record `toString()` otomatis di `generate` oleh si Java nya (formatnya juga bagus), sehingga tidak perlu lagi membuat method `toString()` lagi secara manual.

---

## Record Class Constructor
* Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan defenisi record class parameter.
* Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat `compact constructor`, yaitu constructor tanpa tanda `()`.
* Ketika parameter nya dipanggil (parameter dari construtor / class Record) maka compact constructor yang berada dibawahnya (block nya) akan dieksekusi. 
* Selain itu, kita juga bisa melakukan **constructor overloading**, namun ada syaratnya, yaitu constructor overloading nya harus tetap memanggil constructor utama, yang secara otomatis dobuatkan di class Record.

---

##Catatan
### Java 14 - Experimental
* Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya.
* Tapi perlu diingat, bahwa karena fitur ini masuk experimental, artinya tidak ada jaminan di versi Java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan.