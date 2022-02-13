# Tutorial-Java-OOP-PZN
## Jenis Exception
Secara garis besar, di Java, exception dibagi menjadi 3 jenis : 
* Checked Exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahas sebelumnya.
* Runtime Exception, dan
* Error (yang akan kita bahas di materi selanjutnya)

---

## Runtime Exception
* `Runtime Exception` adalah jenis exception yang tidak wajib di tangkap menggunakan try catch.
* Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception.
* Untuk membuat class runtime exception, juta wajib meng-`extends` class `RuntimeException`.
* Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dan lain-lain. 