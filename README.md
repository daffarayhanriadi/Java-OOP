# Tutorial-Java-OOP-PZN
## Exception 
* Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error.
* Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class Exception.
* Kita bisa menggunakan class Exception sendiri, atau menggunakan yang udah disediakan oleh Java.
* Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunanya.

---

## Membuat Exception
* Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan kata kunci `throws` diikuti dengan class exception nya.
* kata kunci `throws` berguna untuk memberitahu kalau method tersebut bisa menyebabkan error **jadi harus hati-hati**.
* Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari satu class exception.
* Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci `throws`, diikuti dengan object exception nya.