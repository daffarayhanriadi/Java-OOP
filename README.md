# Tutorial-Java-OOP-PZN
## Default Method
* Sebelumnya kita tahu bahwa interface, kita tidak bisa membuat method konkrit yang memiliki block method.
* Namun sejak versi Java 8, ada fitur default method di interface.
* Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut.
* Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus meng-override method tersebut.
* Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.