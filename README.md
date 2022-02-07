# Tutorial-Java-OOP-PZN
## Inner Class
* Di Java, kita bisa membuat class di dalam class, atau disebut dengan `Inner Class`.
* Salah satu kasus kita membuat inner class biasanya ketika kita **butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain**.
* Misal kita perlu membuat class Employee, dimana membuatuhkan class Company, maka kita bisa membuat class Employee sebagai inner class Company.
* Cara membuat inner class, cukup membuatnya di dalam block class outer class nya.

---

## Mengakses Outer Class
* Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya.
* Inner class bisa membaca semua `private` member yang ada di outer class nya.
* Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci `this`, misal Employee ke Company `Company.this`.
* Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outernya diikuti dengan kata kunci `super`, misal `Company.super`.