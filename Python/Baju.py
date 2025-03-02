# Baju.py
# Modul ini mendefinisikan kelas Baju, turunan dari Aksesoris

# Impor kelas Aksesoris dari file Aksesoris.py
from Aksesoris import Aksesoris

# Definisi kelas Baju yang mewarisi dari Aksesoris
class Baju(Aksesoris):
    # Konstruktor dengan parameter default
    def __init__(self, id=0, nama_produk="", kategori="", harga=0.0, jenis="", bahan="", warna="", untuk="", size=0, merk=""):
        # Panggil konstruktor kelas Aksesoris untuk menginisialisasi atribut dasar dan aksesoris
        super().__init__(id, nama_produk, kategori, harga, jenis, bahan, warna)
        self.untuk = untuk   # Inisialisasi atribut 'untuk' (misalnya: untuk hewan, anak-anak, dll)
        self.size = size     # Inisialisasi ukuran baju (sebagai integer)
        self.merk = merk     # Inisialisasi merk baju

    # Getter untuk 'untuk'
    def get_untuk(self):
        return self.untuk  # Mengembalikan nilai atribut 'untuk'

    # Getter untuk 'size'
    def get_size(self):
        return self.size  # Mengembalikan ukuran baju

    # Getter untuk 'merk'
    def get_merk(self):
        return self.merk  # Mengembalikan merk baju

    # Fungsi untuk mendapatkan informasi produk sebagai tuple (digunakan untuk pencetakan tabel)
    def display_info(self):
        # Mengembalikan data sebagai tuple of strings
        return (str(self.id), self.nama_produk, self.kategori, f"{self.harga:.2f}",
                self.jenis, self.bahan, self.warna, self.untuk, str(self.size), self.merk)
