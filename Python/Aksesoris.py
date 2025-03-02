# Aksesoris.py
# Modul ini mendefinisikan kelas Aksesoris, turunan dari PetShop

# Impor kelas PetShop dari file PetShop.py
from PetShop import PetShop

# Definisi kelas Aksesoris yang mewarisi dari PetShop
class Aksesoris(PetShop):
    # Konstruktor dengan parameter default
    def __init__(self, id=0, nama_produk="", kategori="", harga=0.0, jenis="", bahan="", warna=""):
        # Panggil konstruktor kelas PetShop untuk menginisialisasi atribut dasar
        super().__init__(id, nama_produk, kategori, harga)
        self.jenis = jenis   # Inisialisasi jenis aksesoris
        self.bahan = bahan   # Inisialisasi bahan aksesoris
        self.warna = warna   # Inisialisasi warna aksesoris

    # Getter untuk jenis
    def get_jenis(self):
        return self.jenis  # Mengembalikan jenis aksesoris

    # Getter untuk bahan
    def get_bahan(self):
        return self.bahan  # Mengembalikan bahan aksesoris

    # Getter untuk warna
    def get_warna(self):
        return self.warna  # Mengembalikan warna aksesoris
