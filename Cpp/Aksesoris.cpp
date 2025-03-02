#include <bits/stdc++.h>
#include "PetShop.cpp"
using namespace std;

class Aksesoris : public PetShop {
private:
    string jenis;
    string bahan;
    string warna;

public:
    // Konstruktor Default
    Aksesoris() : PetShop() {
        this->jenis = "";
        this->bahan = "";
        this->warna = "";
    }

    // Konstruktor dengan Parameter
    Aksesoris(int id, string nama, string kategori, double harga, string jenis, string bahan, string warna) 
        : PetShop(id, nama, kategori, harga) {
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    // Getter dan Setter (dengan const pada getter)
    string get_jenis() const { return this->jenis; }
    void set_jenis(string jenis) { this->jenis = jenis; }
    string get_bahan() const { return this->bahan; }
    void set_bahan(string bahan) { this->bahan = bahan; }
    string get_warna() const { return this->warna; }
    void set_warna(string warna) { this->warna = warna; }

    // Destructor
    ~Aksesoris() {}
};
