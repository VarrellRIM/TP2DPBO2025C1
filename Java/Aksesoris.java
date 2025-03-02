// Aksesoris.java
// Kelas Aksesoris merupakan turunan dari PetShop dan menambahkan atribut khusus

// Pastikan PetShop.java berada dalam paket yang sama (default package)
public class Aksesoris extends PetShop {
    // Deklarasi atribut tambahan untuk aksesoris
    protected String jenis; // Jenis aksesoris
    protected String bahan; // Bahan aksesoris
    protected String warna; // Warna aksesoris

    // Konstruktor default
    public Aksesoris() { // Constructor tanpa parameter
        super(); // Panggil konstruktor default PetShop
        this.jenis = ""; // Inisialisasi jenis dengan string kosong
        this.bahan = ""; // Inisialisasi bahan dengan string kosong
        this.warna = ""; // Inisialisasi warna dengan string kosong
    }

    // Konstruktor dengan parameter
    public Aksesoris(int id, String namaProduk, String kategori, double harga, String jenis, String bahan,
            String warna) {
        super(id, namaProduk, kategori, harga); // Panggil konstruktor PetShop dengan parameter
        this.jenis = jenis; // Set jenis aksesoris
        this.bahan = bahan; // Set bahan aksesoris
        this.warna = warna; // Set warna aksesoris
    }

    // Getter untuk jenis
    public String getJenis() {
        return this.jenis; // Mengembalikan jenis aksesoris
    }

    // Setter untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis; // Mengatur jenis aksesoris
    }

    // Getter untuk bahan
    public String getBahan() {
        return this.bahan; // Mengembalikan bahan aksesoris
    }

    // Setter untuk bahan
    public void setBahan(String bahan) {
        this.bahan = bahan; // Mengatur bahan aksesoris
    }

    // Getter untuk warna
    public String getWarna() {
        return this.warna; // Mengembalikan warna aksesoris
    }

    // Setter untuk warna
    public void setWarna(String warna) {
        this.warna = warna; // Mengatur warna aksesoris
    }
}
