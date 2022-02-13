# Tutorial-Java-OOP-PZN
## Jenis Exception
Secara garis besar, di Java, exception dibagi menjadi 3 jenis :
* Checked Exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahas sebelumnya.
* Runtime Exception, dan
* Error (yang akan kita bahas di materi selanjutnya)

---

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

---

## Try Catch
* Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita **wajib menggunakan** `try-catch` expression di Java.
* Ini `gunanya agar kita bisa menangkap exception` yang terjadi, karena `jika tidak ditangkap`, `lalu terjadi exception`, maka secara `otomatis` `program` kita `akan berhenti`.
* Cara menggunakan `try-catch` expression di Java sangat mudah, di `block try`, kita tinggal panggil method yang bisa menyebabkan exception, dan di block catch, kita bisa melakukan sesuatu jiga terjadi exception.

---

## Finally Keyword
* Dalam try-catch, kita bisa menambahkan block `finally`.
* Blcok `finally` ini adalah block dimana akan selalu diksekusi baik terjadi exception ataupun tidak.
* Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory.
