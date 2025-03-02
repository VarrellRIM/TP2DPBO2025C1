#include <bits/stdc++.h>
#include "Baju.cpp"
using namespace std;

// Fungsi untuk mencari panjang maksimum dari atribut dalam list
void cari_panjang_maksimum(const list<Baju>& petshop, int& id_max, int& nama_max, 
                           int& kategori_max, int& harga_max, int& jenis_max, 
                           int& bahan_max, int& warna_max, int& untuk_max, 
                           int& size_max, int& merk_max) {
    
    // Inisialisasi dengan panjang minimal untuk header
    id_max = 2;       // "ID"
    nama_max = 11;    // "Nama Produk"
    kategori_max = 8; // "Kategori"
    harga_max = 5;    // "Harga"
    jenis_max = 5;    // "Jenis"
    bahan_max = 5;    // "Bahan"
    warna_max = 5;    // "Warna"
    untuk_max = 5;    // "Untuk"
    size_max = 4;     // "Size"
    merk_max = 4;     // "Merk"
    
    // Iterasi setiap produk untuk mencari panjang maksimum
    for (const auto& produk : petshop) {
        // Konversi ID ke string untuk mengukur panjangnya
        string id_str = to_string(produk.get_id());
        id_max = max(id_max, (int)id_str.length());
        
        nama_max = max(nama_max, (int)produk.get_nama_produk().length());
        kategori_max = max(kategori_max, (int)produk.get_kategori().length());
        
        // Konversi harga ke string dengan format yang sesuai
        ostringstream harga_stream;
        harga_stream << fixed << setprecision(2) << produk.get_harga();
        string harga_str = harga_stream.str();
        harga_max = max(harga_max, (int)harga_str.length());
        
        jenis_max = max(jenis_max, (int)produk.get_jenis().length());
        bahan_max = max(bahan_max, (int)produk.get_bahan().length());
        warna_max = max(warna_max, (int)produk.get_warna().length());
        untuk_max = max(untuk_max, (int)produk.get_untuk().length());
        
        // Konversi size ke string
        string size_str = to_string(produk.get_size());
        size_max = max(size_max, (int)size_str.length());
        
        merk_max = max(merk_max, (int)produk.get_merk().length());
    }
    
    // Tambahkan padding (misalnya 2 spasi) agar tabel lebih rapi
    id_max += 2;
    nama_max += 2;
    kategori_max += 2;
    harga_max += 2;
    jenis_max += 2;
    bahan_max += 2;
    warna_max += 2;
    untuk_max += 2;
    size_max += 2;
    merk_max += 2;
}

// Fungsi untuk menampilkan tabel
void tampilkan_tabel(const list<Baju>& petshop) {
    if (petshop.empty()) {
        cout << "Tidak ada produk dalam petshop.\n";
        return;
    }
    
    int id_width, nama_width, kategori_width, harga_width;
    int jenis_width, bahan_width, warna_width, untuk_width;
    int size_width, merk_width;
    
    // Cari panjang maksimum dari setiap atribut
    cari_panjang_maksimum(petshop, id_width, nama_width, kategori_width, 
                          harga_width, jenis_width, bahan_width, warna_width, 
                          untuk_width, size_width, merk_width);
    
    // Header tabel
    cout << "\n===== DAFTAR PRODUK =====\n";
    cout << "+" << string(id_width, '-') << "+"
         << string(nama_width, '-') << "+"
         << string(kategori_width, '-') << "+"
         << string(harga_width, '-') << "+"
         << string(jenis_width, '-') << "+"
         << string(bahan_width, '-') << "+"
         << string(warna_width, '-') << "+"
         << string(untuk_width, '-') << "+"
         << string(size_width, '-') << "+"
         << string(merk_width, '-') << "+" << endl;
    
    cout << "|" << setw(id_width) << "ID" << "|"
         << setw(nama_width) << "Nama Produk" << "|"
         << setw(kategori_width) << "Kategori" << "|"
         << setw(harga_width) << "Harga (Rp)" << "|"
         << setw(jenis_width) << "Jenis" << "|"
         << setw(bahan_width) << "Bahan" << "|"
         << setw(warna_width) << "Warna" << "|"
         << setw(untuk_width) << "Untuk" << "|"
         << setw(size_width) << "Size" << "|"
         << setw(merk_width) << "Merk" << "|" << endl;
    
    cout << "+" << string(id_width, '-') << "+"
         << string(nama_width, '-') << "+"
         << string(kategori_width, '-') << "+"
         << string(harga_width, '-') << "+"
         << string(jenis_width, '-') << "+"
         << string(bahan_width, '-') << "+"
         << string(warna_width, '-') << "+"
         << string(untuk_width, '-') << "+"
         << string(size_width, '-') << "+"
         << string(merk_width, '-') << "+" << endl;
    
    // Isi tabel
    for (const auto& produk : petshop) {
        cout << "|" << setw(id_width) << produk.get_id() << "|"
             << setw(nama_width) << produk.get_nama_produk() << "|"
             << setw(kategori_width) << produk.get_kategori() << "|"
             << setw(harga_width) << fixed << setprecision(2) << produk.get_harga() << "|"
             << setw(jenis_width) << produk.get_jenis() << "|"
             << setw(bahan_width) << produk.get_bahan() << "|"
             << setw(warna_width) << produk.get_warna() << "|"
             << setw(untuk_width) << produk.get_untuk() << "|"
             << setw(size_width) << produk.get_size() << "|"
             << setw(merk_width) << produk.get_merk() << "|" << endl;
    }
    
    cout << "+" << string(id_width, '-') << "+"
         << string(nama_width, '-') << "+"
         << string(kategori_width, '-') << "+"
         << string(harga_width, '-') << "+"
         << string(jenis_width, '-') << "+"
         << string(bahan_width, '-') << "+"
         << string(warna_width, '-') << "+"
         << string(untuk_width, '-') << "+"
         << string(size_width, '-') << "+"
         << string(merk_width, '-') << "+" << endl;
}

int main() {
    list<Baju> petshop;

    // Menambahkan 5 objek awal ke dalam list petshop
    petshop.push_back(Baju(1, "Baju Anjing Kecil", "Pakaian", 150000, "Baju", "Katun", "Merah", "Anjing Kecil", 10, "PetLovers"));
    petshop.push_back(Baju(2, "Baju Kucing Medium", "Pakaian", 200000, "Baju", "Wol", "Biru", "Kucing Medium", 15, "CatStyle"));
    petshop.push_back(Baju(3, "Baju Anjing Besar", "Pakaian", 250000, "Baju", "Polyester", "Hitam", "Anjing Besar", 20, "DogFashion"));
    petshop.push_back(Baju(4, "Baju Kucing Kecil", "Pakaian", 120000, "Baju", "Katun", "Putih", "Kucing Kecil", 8, "KittyWear"));
    petshop.push_back(Baju(5, "Baju Anjing Medium", "Pakaian", 180000, "Baju", "Wol", "Hijau", "Anjing Medium", 12, "PawFashion"));

    int choice;

    do {
        cout << "\n===== PETSHOP MENU =====\n";
        cout << "1. Tambah Produk\n";
        cout << "2. Tampilkan Semua Produk\n";
        cout << "3. Keluar\n";
        cout << "Pilihan: ";
        cin >> choice;
        cin.ignore();

        if (choice == 1) {
            // Tambah Produk
            int id, size;
            string nama, kategori, jenis, bahan, warna, untuk, merk;
            double harga;

            cout << "ID Produk: ";
            cin >> id;
            cin.ignore();
            cout << "Nama Produk: ";
            getline(cin, nama);
            cout << "Kategori: ";
            getline(cin, kategori);
            cout << "Harga: ";
            cin >> harga;
            cin.ignore();
            cout << "Jenis: ";
            getline(cin, jenis);
            cout << "Bahan: ";
            getline(cin, bahan);
            cout << "Warna: ";
            getline(cin, warna);
            cout << "Untuk: ";
            getline(cin, untuk);
            cout << "Size: ";
            cin >> size;
            cin.ignore();
            cout << "Merk: ";
            getline(cin, merk);

            petshop.push_back(Baju(id, nama, kategori, harga, jenis, bahan, warna, untuk, size, merk));
            cout << "Produk berhasil ditambahkan!\n";

        } else if (choice == 2) {
            // Tampilkan Semua Produk menggunakan tabel dinamis
            tampilkan_tabel(petshop);

        } else if (choice == 3) {
            cout << "Keluar dari program...\n";

        } else {
            cout << "Pilihan tidak valid!\n";
        }
    } while (choice != 3);

    return 0;
}
