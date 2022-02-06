# Tutorial-Java-OOP-PZN
## Encapsulation
* **Encapsulation** artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
* Hal ini bertujuan agar kita bisa menjaga data sebuah object tetap baik dan valid (agar tidak dapat diubah oleh orang lain/siapapun).
* Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier `private`, sehingga tidak bisa diakses atau diubah dari luar.
* Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut.

---

## Getter dan Setter
* Di Java, prose encapsulation sudah dibuat strandarisasinya, dimana kita bisa menggunakan **Getter dan Setter method**.
* **Getter** adalah function yang dibuat untuk mengambil data field.
* **Setter** adalah function untuk mengubah data field.

---

## Getter dan Setter Method
| **Tipe Data** | **Getter Method** | **Setter Method** |
| :--- | :--- | :--- |
|boolean|isXxx()|SetXxx(boolean value)|
|primitf|getXxx()|SetXxx(primitif value)|
|Object|getXxx()|SetXxx(Object value)|