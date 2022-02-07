# Tutorial-Java-OOP-PZN
## HashCode Method
* Method `hashCode()` adalah method representasi integer object kita, mirip `toString()` yang merupakan representasi String, `hashCode()` adalah representasi integer.
* HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain-lain, karena cukup menggunakan `hashCode()` method untuk mendapatkan identitas unique object kita.
* Secara default `hashCode()` akan mengembalikan nilai integer sesuai data di memory, namun kita bisa meng-override nya jita kita ingin.

---

## Kontrak HashCode Method
Tidak mudah meng-override method `hashCode()`, karena ada kontraknya :
* Sebanyak apapun `hashCode()` dipanggil (dipanggil berkali-kali), untuk object yang sama, harus menghasilkan data integer yang sama.
* Jika ada 2 object yang sama, jika dibandingkan menggunakan method `equals()`, maka nilai `hashCode()` (integernya) nya juga harus sama.
* Tidak wajib `hashCode()` berbeda jika method `equals()` menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar.