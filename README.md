# Tutorial-Java-OOP-PZN
## Static Keyword
* Sebelumnya kita sudah sering melihat kata kunci `static`, namun bekum pernah kita bahas.
* Dengan menggunakan kata kunci `static`, kita bisa membuat field, method, atau class bisa diakses langsung tanpa melalui object nya.
* Perlu diingat, **static hanya bisa mengakses static lainya** kalau berada di dalam class yang sama.
* Biasanya static itu Huruf Kapital semua dan bersifat final, tapi ini bersifat **opsional** kepada kita ingin membuatnya bagaimana.
* Cara memanggil Static Members `(Field/Method/Inner Class)`, seperti ini `namaClass.namaField/Method`, jika inner class `namaOuterClass.namaInnerClass variable/object = new namaOuterClass.namaInnerClass()`

---

## Static Dapat Digunakan di
* `Field, atau disebuat class variable,` artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
* `Method, atau disebut class Method,` artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
* `Block,` static blockakan otomatis dieksekusi ketika sebuah class di load.
* Inner Class `(menambahkan static di dalam innner class)`, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class terlebih dahulu, Static pada inner class menyebabkan kita bisa mengakses lagi object outer class nya.