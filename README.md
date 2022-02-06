# Tutorial-Java-OOP-PZN
## Interface
* Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class Child nya.
* Namun sebenarnya **yang lebih tepat untuk kontrak adalah Interface**.
* Jangan salah sangaka bahwa **Interface disini bukanlah User Interface**.
* Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block.
* Di Interface kita **tidak boleh memiliki field**, kita **hanya boleh memiliki** `constant` (field yang tidak bisa diubah).
* Untuk mewariskan Interface, kita tidak menggunakan kata kunci **extends**, melainkan `implements`.