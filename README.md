# Tutorial-Java-OOP-PZN
## Access Modifier

* **Access modifier** adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja.
* Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier).
* Sekarang kita akan bahas access modifier lainnya.

---

Access Level

| Modifier  | Class | Package | Subclass | World |
| :--- | :---: | :---: | :---: | :---: |
| public  | Y  | Y | Y | Y |
| protected  | Y | Y | Y | N |
| _no modifier_ | Y | Y | N | N |
| private | Y | N | N | N |

---

## Public Class
* Saat kita membuat public clas, kita hanya bisa membuat 1 public class di 1 file Java.
* Selain itu, nama public class harus sama dengan nama file.