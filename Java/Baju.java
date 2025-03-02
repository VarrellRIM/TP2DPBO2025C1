
// Baju.java
// Kelas Baju merupakan turunan dari Aksesoris dan menambahkan atribut khusus untuk baju

// Pastikan Aksesoris.java berada dalam paket yang sama (default package)
import java.text.DecimalFormat; // Import untuk format angka

public class Baju extends Aksesoris {
    // Deklarasi atribut khusus Baju
    private String untuk; // Untuk siapa baju dibuat
    private int size; // Ukuran baju
    private String merk; // Merk baju

    // Konstruktor default
    public Baju() { // Constructor tanpa parameter
        super(); // Panggil konstruktor default Aksesoris
        this.untuk = ""; // Inisialisasi untuk dengan string kosong
        this.size = 0; // Inisialisasi size dengan 0
        this.merk = ""; // Inisialisasi merk dengan string kosong
    }

    // Konstruktor dengan parameter lengkap
    public Baju(int id, String namaProduk, String kategori, double harga, String jenis, String bahan, String warna,
            String untuk, int size, String merk) {
        super(id, namaProduk, kategori, harga, jenis, bahan, warna); // Panggil konstruktor Aksesoris dengan parameter
        this.untuk = untuk; // Set atribut untuk
        this.size = size; // Set atribut size
        this.merk = merk; // Set atribut merk
    }

    // Getter untuk atribut untuk
    public String getUntuk() {
        return this.untuk; // Mengembalikan nilai untuk
    }

    // Setter untuk atribut untuk
    public void setUntuk(String untuk) {
        this.untuk = untuk; // Mengatur nilai untuk
    }

    // Getter untuk size
    public int getSize() {
        return this.size; // Mengembalikan ukuran baju
    }

    // Setter untuk size
    public void setSize(int size) {
        this.size = size; // Mengatur ukuran baju
    }

    // Getter untuk merk
    public String getMerk() {
        return this.merk; // Mengembalikan merk baju
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk; // Mengatur merk baju
    }

    // Method untuk mendapatkan informasi produk sebagai array of Strings (digunakan
    // dalam tabel)
    public String[] getInfo() {
        DecimalFormat df = new DecimalFormat("0.00"); // Format harga dengan 2 desimal
        return new String[] {
                String.valueOf(this.id), // ID dari PetShop
                this.namaProduk, // Nama Produk
                this.kategori, // Kategori Produk
                df.format(this.harga), // Harga produk (format desimal)
                this.jenis, // Jenis (Aksesoris)
                this.bahan, // Bahan (Aksesoris)
                this.warna, // Warna (Aksesoris)
                this.untuk, // Untuk (Baju)
                String.valueOf(this.size), // Ukuran (Baju)
                this.merk // Merk (Baju)
        };
    }

    // Method untuk menampilkan informasi produk Baju secara detail (digunakan untuk
    // debugging)
    public void displayInfo() {
        // Tampilkan data dari kelas PetShop
        System.out.println("ID: " + this.id);
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Kategori: " + this.kategori);
        System.out.println("Harga: Rp " + this.harga);
        // Tampilkan data dari kelas Aksesoris
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Bahan: " + this.bahan);
        System.out.println("Warna: " + this.warna);
        // Tampilkan data khusus Baju
        System.out.println("Untuk: " + this.untuk);
        System.out.println("Size: " + this.size);
        System.out.println("Merk: " + this.merk);
        System.out.println("--------------------------");
    }
}
