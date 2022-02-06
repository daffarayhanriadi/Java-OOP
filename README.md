# Tutorial-Java-OOP-PZN
## Import
* **Import** adalah kemampuan untuk mengguanakan class yang berada di package yang berbeda.
* Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public.

---

## Import Semua Package
* Jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda (*), misal : 
```java 
import daffa.belajar.oop.data.*
```

---
## Catatan
### Default Import
* Secara default, semua class yang ada di ``` package java.lang``` sudah auto import, jadi kita tidak perlu melakukan import secara manual.
* Contoh ``` class String, Integer, Long, Boolean, dan lain-lain``` terdapat di package ``` java.lang```.
* Oleh karena itu, kita tidak perlu meng-import nya secara manual (karena sudah .lang / otomatis dari Java nya).

Contoh lebih detail class String : 
```java
String name = "Daffa"; 
```