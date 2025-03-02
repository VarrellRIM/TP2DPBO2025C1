<?php
// Baju.php
// File ini mendefinisikan kelas Baju yang merupakan turunan dari Aksesoris.
// Kelas Baju menambahkan atribut khusus untuk produk baju.

require_once 'Aksesoris.php'; // Sertakan definisi kelas Aksesoris

class Baju extends Aksesoris {
    // Deklarasi atribut khusus untuk Baju dengan visibility private
    private $untuk; // Untuk siapa baju dibuat
    private $size;  // Ukuran baju (integer)
    private $merk;  // Merk baju

    // Konstruktor default dengan parameter default
    public function __construct($id = 0, $nama_produk = "", $kategori = "", $harga = 0.0, $gambar = "", 
                                $jenis = "", $bahan = "", $warna = "", $untuk = "", $size = 0, $merk = "") {
        // Panggil konstruktor Aksesoris untuk inisialisasi atribut dasar dan atribut aksesoris
        parent::__construct($id, $nama_produk, $kategori, $harga, $gambar, $jenis, $bahan, $warna);
        $this->untuk = $untuk;   // Set atribut untuk
        $this->size = $size;     // Set atribut size
        $this->merk = $merk;     // Set atribut merk
    }

    // Getter untuk atribut untuk
    public function getUntuk() {
        return $this->untuk; // Kembalikan nilai atribut untuk
    }

    // Setter untuk atribut untuk
    public function setUntuk($untuk) {
        $this->untuk = $untuk; // Atur nilai atribut untuk
    }

    // Getter untuk size
    public function getSize() {
        return $this->size; // Kembalikan nilai atribut size
    }

    // Setter untuk size
    public function setSize($size) {
        $this->size = $size; // Atur nilai atribut size
    }

    // Getter untuk merk
    public function getMerk() {
        return $this->merk; // Kembalikan nilai atribut merk
    }

    // Setter untuk merk
    public function setMerk($merk) {
        $this->merk = $merk; // Atur nilai atribut merk
    }

    // Method untuk mendapatkan informasi produk sebagai array of Strings (digunakan untuk pencetakan tabel)
    public function getInfo() {
        // Format harga dengan 2 desimal menggunakan sprintf
        $hargaFormatted = sprintf("%.2f", $this->harga);
        return array(
            strval($this->id),        // ID produk
            $this->nama_produk,        // Nama produk
            $this->kategori,           // Kategori produk
            $hargaFormatted,           // Harga produk (format desimal)
            $this->jenis,              // Jenis (dari Aksesoris)
            $this->bahan,              // Bahan (dari Aksesoris)
            $this->warna,              // Warna (dari Aksesoris)
            $this->untuk,              // Untuk (dari Baju)
            strval($this->size),       // Ukuran baju (dikonversi ke string)
            $this->merk                // Merk baju
        );
    }

    // Method untuk menampilkan informasi produk secara interaktif
    public function displayInfo() {
        echo "<div style='border:1px solid #000; padding:10px; margin:10px;'>";
        echo "<p><strong>ID:</strong> {$this->id}</p>";
        echo "<p><strong>Nama Produk:</strong> {$this->nama_produk}</p>";
        echo "<p><strong>Kategori:</strong> {$this->kategori}</p>";
        echo "<p><strong>Harga:</strong> Rp " . number_format($this->harga, 2, ',', '.') . "</p>";
        echo "<p><strong>Jenis:</strong> {$this->jenis}</p>";
        echo "<p><strong>Bahan:</strong> {$this->bahan}</p>";
        echo "<p><strong>Warna:</strong> {$this->warna}</p>";
        echo "<p><strong>Untuk:</strong> {$this->untuk}</p>";
        echo "<p><strong>Size:</strong> {$this->size}</p>";
        echo "<p><strong>Merk:</strong> {$this->merk}</p>";
        // Jika gambar tersedia, tampilkan gambar
        if ($this->gambar != "") {
            echo "<p><strong>Gambar Produk:</strong><br><img src='data:image/*;base64,{$this->gambar}' alt='{$this->nama_produk}' style='max-width:200px;'></p>";
        }
        echo "</div>";
    }
}
?>
