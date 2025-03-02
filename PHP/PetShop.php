<?php
// PetShop.php
// File ini mendefinisikan kelas dasar PetShop yang menyimpan data produk dasar.
// Atribut 'gambar' menyimpan foto produk dalam bentuk string base64.

class PetShop {
    // Deklarasi atribut kelas dengan visibility protected agar dapat diakses oleh kelas turunan
    protected $id;           // ID produk
    protected $nama_produk;  // Nama produk
    protected $kategori;     // Kategori produk
    protected $harga;        // Harga produk
    protected $gambar;       // Foto produk (dalam base64)

    // Konstruktor dengan parameter default
    public function __construct($id = 0, $nama_produk = "", $kategori = "", $harga = 0.0, $gambar = "") {
        $this->id = $id;                         // Set ID produk
        $this->nama_produk = $nama_produk;       // Set nama produk
        $this->kategori = $kategori;             // Set kategori produk
        $this->harga = $harga;                   // Set harga produk
        $this->gambar = $gambar;                 // Set foto produk (default kosong)
    }

    // Getter untuk id
    public function getId() {
        return $this->id; // Kembalikan nilai id
    }

    // Setter untuk id
    public function setId($id) {
        $this->id = $id; // Atur nilai id
    }

    // Getter untuk nama_produk
    public function getNamaProduk() {
        return $this->nama_produk; // Kembalikan nama produk
    }

    // Setter untuk nama_produk
    public function setNamaProduk($nama_produk) {
        $this->nama_produk = $nama_produk; // Atur nama produk
    }

    // Getter untuk kategori
    public function getKategori() {
        return $this->kategori; // Kembalikan kategori produk
    }

    // Setter untuk kategori
    public function setKategori($kategori) {
        $this->kategori = $kategori; // Atur kategori produk
    }

    // Getter untuk harga
    public function getHarga() {
        return $this->harga; // Kembalikan harga produk
    }

    // Setter untuk harga
    public function setHarga($harga) {
        $this->harga = $harga; // Atur harga produk
    }

    // Getter untuk gambar
    public function getGambar() {
        return $this->gambar; // Kembalikan foto produk
    }

    // Setter untuk gambar
    public function setGambar($gambar) {
        $this->gambar = $gambar; // Atur foto produk
    }
}
?>
