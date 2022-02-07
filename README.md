# Tutorial-Java-OOP-PZN
## Equals Method
* Hal yang agak membingungkan di Java adalah cara membandingkan object.
* Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator `==`, di Java, operator `==` **hanya untuk mengecek data primitif**.
* Jika kita mencoba paksa menggunakan operator `==`, itu sebenarnya bukan membandingkan si Object nya, melainkan membandingkan si lokasi dari Object di memori nya `apakah sama atau tidak`.
* **Untuk non primitif** pengecekan nya menggunakan method `equals()`.
* Dan **secara default**, method `equals()` itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yang isi fields nya sama, tetapi dianggap beda oleh method equals.
* Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut.
* Intinya `==` itu membandingkan apakah objectnya beneran sama di memory atau berbeda.
* Jadi Selalu direkomendasikan untuk meng-Override method equals() ketika membuat Class