# Tutorial-Java-OOP-PZN
## Variable Hiding

* **Variable hiding** merupakan masalah yang terjadi ketika kita mmebuat nama field sama di class Child dengan nama field class Parent.
* **Tidak ada yang namanya field Overriding**, ketika kita buat ulang nama field di class Child, itu berarti variable hiding.
* Untuk mengatasi variable hiding, caranya kita bisa menggunakan **super** keyword.
* **Yang membedakan variable hiding dan method overriding** adalah ketika sebuah **object di casts (Konversi Parent ke Subclass / Subclass ke Parent nya)**.
* Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di class Parent nya (jika variable hiding).