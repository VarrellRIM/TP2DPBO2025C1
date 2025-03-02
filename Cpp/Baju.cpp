#include <bits/stdc++.h>
#include "Aksesoris.cpp"
using namespace std;

class Baju : public Aksesoris {
private:
    string untuk;
    int size;
    string merk;

public:
    // Konstruktor Default
    Baju() : Aksesoris() {
        this->untuk = "";
        this->size = 0;
        this->merk = "";
    }

    // Konstruktor dengan Parameter
    Baju(int id, string nama, string kategori, double harga, string jenis, string bahan, string warna, string untuk, int size, string merk) 
        : Aksesoris(id, nama, kategori, harga, jenis, bahan, warna) {
        this->untuk = untuk;
        this->size = size;
        this->merk = merk;
    }

    // Getter dan Setter (dengan const pada getter)
    string get_untuk() const { return this->untuk; }
    void set_untuk(string untuk) { this->untuk = untuk; }
    int get_size() const { return this->size; }
    void set_size(int size) { this->size = size; }
    string get_merk() const { return this->merk; }
    void set_merk(string merk) { this->merk = merk; }

    // Override display_info untuk menampilkan semua properti Baju
    void display_info() const {
        PetShop::display_info();
        cout << "Jenis: " << get_jenis() << "\n";
        cout << "Bahan: " << get_bahan() << "\n";
        cout << "Warna: " << get_warna() << "\n";
        cout << "Untuk: " << untuk << "\n";
        cout << "Size: " << size << "\n";
        cout << "Merk: " << merk << "\n";
        cout << "--------------------------\n";
    }

    // Destructor
    ~Baju() {}
};
