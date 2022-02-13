# Tutorial-Java-OOP-PZN
## Runtime Exception
* `Runtime Exception` adalah jenis exception yang tidak wajib di tangkap menggunakan try catch.
* Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception.
* Untuk membuat class runtime exception, juta wajib meng-`extends` class `RuntimeException`.
* Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dan lain-lain. 