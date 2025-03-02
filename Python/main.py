# main.py
# Program utama untuk mengelola inventory produk di PetShop
# Program ini menggunakan kelas Baju yang diimpor dari Baju.py

from Baju import Baju  # Impor kelas Baju dari file Baju.py

# Fungsi untuk menghitung panjang maksimum tiap kolom dari inventory
def cari_panjang_maksimum(inventory):
    # Inisialisasi lebar kolom berdasarkan header
    id_w = len("ID")             # Lebar minimal untuk kolom ID
    nama_w = len("Nama Produk")   # Lebar minimal untuk kolom Nama Produk
    kategori_w = len("Kategori")  # Lebar minimal untuk kolom Kategori
    harga_w = len("Harga (Rp)")   # Lebar minimal untuk kolom Harga (Rp)
    jenis_w = len("Jenis")        # Lebar minimal untuk kolom Jenis
    bahan_w = len("Bahan")        # Lebar minimal untuk kolom Bahan
    warna_w = len("Warna")        # Lebar minimal untuk kolom Warna
    untuk_w = len("Untuk")        # Lebar minimal untuk kolom Untuk
    size_w = len("Size")          # Lebar minimal untuk kolom Size
    merk_w = len("Merk")          # Lebar minimal untuk kolom Merk

    # Iterasi setiap produk dalam inventory
    for produk in inventory:
        info = produk.display_info()  # Ambil informasi produk sebagai tuple
        id_w = max(id_w, len(info[0]))
        nama_w = max(nama_w, len(info[1]))
        kategori_w = max(kategori_w, len(info[2]))
        harga_w = max(harga_w, len(info[3]))
        jenis_w = max(jenis_w, len(info[4]))
        bahan_w = max(bahan_w, len(info[5]))
        warna_w = max(warna_w, len(info[6]))
        untuk_w = max(untuk_w, len(info[7]))
        size_w = max(size_w, len(info[8]))
        merk_w = max(merk_w, len(info[9]))

    # Tambahkan padding 2 spasi untuk membuat tabel lebih rapi
    return (id_w + 2, nama_w + 2, kategori_w + 2, harga_w + 2,
            jenis_w + 2, bahan_w + 2, warna_w + 2, untuk_w + 2,
            size_w + 2, merk_w + 2)

# Fungsi untuk membuat garis border tabel
def border_line(widths):
    return "+" + "+".join(["-" * w for w in widths]) + "+"

# Fungsi untuk menengahkan teks dengan lebar tertentu
def center_text(s, width):
    padding = width - len(s)
    pad_left = padding // 2
    pad_right = padding - pad_left
    return " " * pad_left + s + " " * pad_right

# Fungsi untuk menampilkan tabel inventory
def tampilkan_tabel(inventory):
    if not inventory:
        print("Tidak ada produk dalam petshop.")
        return
    # Hitung lebar tiap kolom dari data
    widths = cari_panjang_maksimum(inventory)
    border = border_line(widths)
    
    # Cetak header tabel
    print(border)
    headers = ["ID", "Nama Produk", "Kategori", "Harga (Rp)", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk"]
    print("|" + "|".join([center_text(h, w) for h, w in zip(headers, widths)]) + "|")
    print(border)
    
    # Cetak setiap baris data produk
    for produk in inventory:
        info = produk.display_info()
        print("|" + "|".join([center_text(info[i], widths[i]) for i in range(len(info))]) + "|")
    print(border)

# Fungsi utama (Main function) program
def main():
    # Inisialisasi inventory dengan 5 produk awal
    inventory = [
        Baju(1, "Baju Anjing Kecil", "Pakaian", 150000, "Baju", "Katun", "Merah", "Anjing Kecil", 10, "PetLovers"),
        Baju(2, "Baju Kucing Medium", "Pakaian", 200000, "Baju", "Wol", "Biru", "Kucing Medium", 15, "CatStyle"),
        Baju(3, "Baju Anjing Besar", "Pakaian", 250000, "Baju", "Polyester", "Hitam", "Anjing Besar", 20, "DogFashion"),
        Baju(4, "Baju Kucing Kecil", "Pakaian", 120000, "Baju", "Katun", "Putih", "Kucing Kecil", 8, "KittyWear"),
        Baju(5, "Baju Anjing Medium", "Pakaian", 180000, "Baju", "Wol", "Hijau", "Anjing Medium", 12, "PawFashion"),
    ]

    # Menu interaktif untuk pengguna
    while True:
        print("\n===== PETSHOP MENU =====")
        print("1. Tambah Produk")
        print("2. Tampilkan Semua Produk")
        print("3. Keluar")
        choice = input("Pilihan: ")

        # Jika pengguna memilih untuk menambahkan produk
        if choice == "1":
            try:
                # Input data produk dari user
                id = int(input("ID Produk: "))
                nama = input("Nama Produk: ")
                kategori = input("Kategori: ")
                harga = float(input("Harga: "))
                jenis = input("Jenis: ")
                bahan = input("Bahan: ")
                warna = input("Warna: ")
                untuk = input("Untuk: ")
                size = int(input("Size: "))
                merk = input("Merk: ")

                # Buat objek Baju dan tambahkan ke inventory
                inventory.append(Baju(id, nama, kategori, harga, jenis, bahan, warna, untuk, size, merk))
                print("Produk berhasil ditambahkan!")
            except ValueError as e:
                print("Input tidak valid:", e)
        # Jika pengguna memilih untuk menampilkan produk
        elif choice == "2":
            tampilkan_tabel(inventory)
        # Jika pengguna memilih untuk keluar
        elif choice == "3":
            print("Keluar dari program...")
            break
        else:
            print("Pilihan tidak valid!")

# Pastikan fungsi main hanya dipanggil jika file ini dijalankan langsung
if __name__ == "__main__":
    main()
