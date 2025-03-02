<?php
// Aksesoris.php
// File ini mendefinisikan kelas Aksesoris yang merupakan turunan dari PetShop.
// Kelas ini menambahkan atribut-atribut khusus untuk produk aksesoris.

require_once 'PetShop.php'; // Sertakan definisi kelas PetShop

class Aksesoris extends PetShop {
    // Deklarasi atribut tambahan dengan visibility protected
    protected $jenis;  // Jenis produk aksesoris
    protected $bahan;  // Bahan produk aksesoris
    protected $warna;  // Warna produk aksesoris

    // Konstruktor default dengan parameter default
    public function __construct($id = 0, $nama_produk = "", $kategori = "", $harga = 0.0, $gambar = "", $jenis = "", $bahan = "", $warna = "") {
        // Panggil konstruktor PetShop untuk inisialisasi atribut dasar
        parent::__construct($id, $nama_produk, $kategori, $harga, $gambar);
        $this->jenis = $jenis;   // Set jenis aksesoris
        $this->bahan = $bahan;   // Set bahan aksesoris
        $this->warna = $warna;   // Set warna aksesoris
    }

    // Getter untuk jenis
    public function getJenis() {
        return $this->jenis; // Kembalikan jenis aksesoris
    }

    // Setter untuk jenis
    public function setJenis($jenis) {
        $this->jenis = $jenis; // Atur jenis aksesoris
    }

    // Getter untuk bahan
    public function getBahan() {
        return $this->bahan; // Kembalikan bahan aksesoris
    }

    // Setter untuk bahan
    public function setBahan($bahan) {
        $this->bahan = $bahan; // Atur bahan aksesoris
    }

    // Getter untuk warna
    public function getWarna() {
        return $this->warna; // Kembalikan warna aksesoris
    }

    // Setter untuk warna
    public function setWarna($warna) {
        $this->warna = $warna; // Atur warna aksesoris
    }
}
?>
