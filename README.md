# Tutorial-Java-OOP-PZN
## Error
* `Error` adalah jenis exception yang terakhir.
* `Error` adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch.
* Biasanya `error` terjadi ketika ada masalah serius, dan `sangat tidak direkomendasikan` untuk `di try-catch` (sama seperti Runtime Exception / tidak wajib menggunakan try-catch).
* Artinya, direkomendasikan untuk mematikan aplikasi.
* Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi.