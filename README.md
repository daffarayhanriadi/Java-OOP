# Tutorial-Java-OOP-PZN
## Anonymous Class
* **Class Anonymous** atau class tanpa nama.
* Adalah kemampuan mendeklarasikan class, sekaligus meng-instransiasi object-nya secara langsung.
* `Class Anonymous` sebenarnya termasuk `inner class`, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut.
* Hanya saja Class Anonymous tidak memiliki nama dan hanya memiliki body.
* Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi class nya.
* Dengan menggunakan Class Anonymous kita bisa langsung membikin interface ataupun abstract class secara langsung tanpa harus bikin class konkritnya.
* Dengan menggunakan Class Anonymous, kita tidak perlu menggunakan kata kunci `implements` untuk menginplementasikan interface pada kelas yang diwariskannya, kita hanya perlu membuat Instance dari class tersebut pada class yang ingin diwariskan.
* Kekurangan dari Class Anonymous adalah tidak bisa dirius, sehingga jika ingin membuat object yang baru dan object tersebut dapat mengakses method yang sama, maka method itu harus di buat ulang.
* Sehingga Class Anonymous ini digunakan pada kasus yang sederhana.  