# TP2 - PetShop Inventory Management

## Janji
Saya Varrell Rizky Irvanni Mahkota dengan NIM 2306245 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.

---

## Diagram Kelas
![image](https://github.com/user-attachments/assets/091ea30b-4740-41fb-a5e6-ebea3d8c37d3)


*Hubungan Inheritance: Baju ← Aksesoris ← PetShop*

---

## Penjelasan Atribut dan Methods

### Kelas `PetShop` (Parent Class)
- **Atribut**:
  - `id`: Nomor unik produk (int)
  - `nama_produk`: Nama barang (string)
  - `kategori`: Kategori produk (string)
  - `harga`: Harga (double/float)
  - `gambar` (PHP only): Foto produk dalam base64 (string)

- **Methods**:
  - Konstruktor (default & parameterized)
  - Getter & Setter untuk semua atribut

### Kelas `Aksesoris` (Child dari PetShop)
- **Atribut**:
  - `jenis`: Jenis aksesoris (string)
  - `bahan`: Material pembuat (string)
  - `warna`: Warna produk (string)

- **Methods**:
  - Konstruktor (mewarisi PetShop)
  - Getter & Setter tambahan untuk atribut baru

### Kelas `Baju` (Child dari Aksesoris)
- **Atribut**:
  - `untuk`: Target hewan (string)
  - `size`: Ukuran (int)
  - `merk`: Brand produk (string)

- **Methods**:
  - `display_info()`: Menampilkan data dalam format tabel (Python/Java/PHP) atau string (CPP)
  - Getter & Setter untuk atribut baru

---

## Alur Program
1. **Inisialisasi Data**:
   - 5 objek Baju pre-defined ditambahkan ke inventory.
   - Contoh: Baju untuk anjing kecil dengan harga 150k.

2. **Menu Interaktif**:
- **Tambah Produk**: Input data via console/web form (PHP).
- **Tampilkan Produk**: Data ditampilkan dalam tabel dinamis dengan kolom menyesuaikan panjang konten.

3. **Dynamic Table**:
- Setiap kolom diatur lebarnya berdasarkan konten terpanjang (termasuk header).
- Format angka: Harga ditampilkan dengan 2 desimal (Rp 150000.00).

4. **Exit**: Program/web session dihentikan.

---

## Perbedaan Implementasi per Bahasa

### C++
- **Input/Output**: Menggunakan `cin` dan `cout` dengan `iomanip` untuk format tabel.
- **Struktur Data**: `list<Baju>` untuk menyimpan objek.
- **Dynamic Table**: Hitung panjang maksimum tiap kolom secara manual dengan iterasi.

### Python
- **Dynamic Typing**: Tidak perlu deklarasi tipe data.
- **Table Format**: Pakai `str.format()` dan string formatting untuk alignment.
- **Input Handling**: `input()` dengan error handling `try-except`.

### Java
- **Collections**: Pakai `ArrayList<Baju>` untuk inventory.
- **Decimal Format**: `DecimalFormat` untuk format harga.
- **String Manipulation**: `StringBuilder` untuk konstruksi border tabel.

### PHP
- **Session Management**: Data disimpan di `$_SESSION`.
- **Image Handling**: Gambar di-encode ke base64 dan disimpan sebagai string.
- **Web Interface**: Form HTML dengan enctype `multipart/form-data` untuk upload gambar.
- **Output**: Generate HTML dengan inline CSS untuk tabel.

