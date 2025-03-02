# PetShop.py
# Modul ini mendefinisikan kelas PetShop, kelas dasar untuk produk.

# Definisi kelas PetShop
class PetShop:
    # Konstruktor dengan parameter default
    def __init__(self, id=0, nama_produk="", kategori="", harga=0.0):
        self.id = id                   # Inisialisasi ID produk
        self.nama_produk = nama_produk # Inisialisasi nama produk
        self.kategori = kategori       # Inisialisasi kategori produk
        self.harga = harga             # Inisialisasi harga produk

    # Getter untuk id
    def get_id(self):
        return self.id  # Mengembalikan ID produk

    # Getter untuk nama produk
    def get_nama_produk(self):
        return self.nama_produk  # Mengembalikan nama produk

    # Getter untuk kategori produk
    def get_kategori(self):
        return self.kategori  # Mengembalikan kategori produk

    # Getter untuk harga produk
    def get_harga(self):
        return self.harga  # Mengembalikan harga produk
