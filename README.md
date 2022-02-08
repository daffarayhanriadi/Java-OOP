# Tutorial-Java-OOP-PZN
## Record Class
* Kadang-kadang kita sering membuat class, hanya untuk class yang berisikan data `(getter(), equals(), hashCode(), dan toString() method)`.
* Record class digunakan untuk mempermudah pembuatan jenis class tersebut.
* Record class bersifat immutable (tidak bisa dirubah)
* Saat kita membuat record class, secara otomatis Java akan membuatkan `getter(), equals(), hashCode(), dan toString() method` secara otomatis, dan juga `constructor` secara otomatis.
* Saat membuat record class, secara otomatis kita akan meng-extends class `java.lang.Record`, yang artinya kita tidak bisa extends class lain.
* Namun kita tetap bisa meng-implement interface.
---

##Catatan
### Java 14 - Experimental
* Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya.
* Tapi perlu diingat, bahwa karena fitur ini masuk experimental, artinya tidak ada jaminan di versi Java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan.