# Tutorial-Java-OOP-PZN
## Super Constructor

* Tidak hanya untuk mengakses method atau field yang ada di class Parent, kata kunci **super** juga bisa digunakan untuk mengakses constructor.
* Namun syaratnya untuk mengakses constructor class Parent, kita harus mengaksesnya di dalam constructor class Child.
* Jika sebuah class Parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki default constructor), maka class Child wajib megakses constructor class Parent tersebut.