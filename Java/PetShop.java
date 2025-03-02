// PetShop.java
// Definisi kelas dasar PetShop

// Import untuk format angka (jika diperlukan)
import java.text.DecimalFormat;

public class PetShop {
    // Deklarasi atribut
    protected int id; // ID produk
    protected String namaProduk; // Nama produk
    protected String kategori; // Kategori produk
    protected double harga; // Harga produk

    // Konstruktor default
    public PetShop() { // Constructor tanpa parameter
        this.id = 0; // Inisialisasi id dengan 0
        this.namaProduk = ""; // Inisialisasi namaProduk sebagai string kosong
        this.kategori = ""; // Inisialisasi kategori sebagai string kosong
        this.harga = 0.0; // Inisialisasi harga dengan 0.0
    }

    // Konstruktor dengan parameter
    public PetShop(int id, String namaProduk, String kategori, double harga) { // Constructor dengan parameter
        this.id = id; // Set id
        this.namaProduk = namaProduk;// Set namaProduk
        this.kategori = kategori; // Set kategori
        this.harga = harga; // Set harga
    }

    // Getter untuk id
    public int getId() {
        return this.id; // Mengembalikan id produk
    }

    // Setter untuk id
    public void setId(int id) {
        this.id = id; // Mengatur id produk
    }

    // Getter untuk namaProduk
    public String getNamaProduk() {
        return this.namaProduk; // Mengembalikan nama produk
    }

    // Setter untuk namaProduk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk; // Mengatur nama produk
    }

    // Getter untuk kategori
    public String getKategori() {
        return this.kategori; // Mengembalikan kategori produk
    }

    // Setter untuk kategori
    public void setKategori(String kategori) {
        this.kategori = kategori; // Mengatur kategori produk
    }

    // Getter untuk harga
    public double getHarga() {
        return this.harga; // Mengembalikan harga produk
    }

    // Setter untuk harga
    public void setHarga(double harga) {
        this.harga = harga; // Mengatur harga produk
    }
}
