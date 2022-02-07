package daffa.belajarjava.data;

class SocialMedia {
    String name;
}

// jika ingin bahwa class ini tidak bisa diturunkan lagi, maka dapat menambahkan kata kunci final
final class Facebook extends SocialMedia {

}
// ERROR
//class FakeFacebook extends Facebook {
//}

