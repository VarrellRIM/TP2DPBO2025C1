
// Main.java
// File utama untuk menjalankan program PetShop Inventory Management

import java.util.*; // Import untuk ArrayList, Scanner, dll.

public class Main {
    // Fungsi untuk menghitung panjang maksimum tiap kolom dari inventory
    public static int[] cariPanjangMaksimum(List<Baju> inventory) {
        // Inisialisasi lebar minimal berdasarkan header tabel
        int idWidth = "ID".length(); // Lebar minimal untuk kolom ID
        int namaWidth = "Nama Produk".length(); // Lebar minimal untuk kolom Nama Produk
        int kategoriWidth = "Kategori".length(); // Lebar minimal untuk kolom Kategori
        int hargaWidth = "Harga (Rp)".length(); // Lebar minimal untuk kolom Harga (Rp)
        int jenisWidth = "Jenis".length(); // Lebar minimal untuk kolom Jenis
        int bahanWidth = "Bahan".length(); // Lebar minimal untuk kolom Bahan
        int warnaWidth = "Warna".length(); // Lebar minimal untuk kolom Warna
        int untukWidth = "Untuk".length(); // Lebar minimal untuk kolom Untuk
        int sizeWidth = "Size".length(); // Lebar minimal untuk kolom Size
        int merkWidth = "Merk".length(); // Lebar minimal untuk kolom Merk

        // Iterasi setiap produk untuk mencari lebar maksimum tiap atribut
        for (Baju produk : inventory) {
            String[] info = produk.getInfo(); // Ambil informasi produk sebagai array of Strings
            idWidth = Math.max(idWidth, info[0].length());
            namaWidth = Math.max(namaWidth, info[1].length());
            kategoriWidth = Math.max(kategoriWidth, info[2].length());
            hargaWidth = Math.max(hargaWidth, info[3].length());
            jenisWidth = Math.max(jenisWidth, info[4].length());
            bahanWidth = Math.max(bahanWidth, info[5].length());
            warnaWidth = Math.max(warnaWidth, info[6].length());
            untukWidth = Math.max(untukWidth, info[7].length());
            sizeWidth = Math.max(sizeWidth, info[8].length());
            merkWidth = Math.max(merkWidth, info[9].length());
        }

        // Tambahkan padding 2 spasi untuk tiap kolom agar tabel rapi
        return new int[] { idWidth + 2, namaWidth + 2, kategoriWidth + 2, hargaWidth + 2,
                jenisWidth + 2, bahanWidth + 2, warnaWidth + 2, untukWidth + 2,
                sizeWidth + 2, merkWidth + 2 };
    }

    // Fungsi untuk membuat garis border tabel
    public static String borderLine(int[] widths) {
        StringBuilder sb = new StringBuilder(); // Buat StringBuilder
        sb.append("+"); // Awal border
        for (int width : widths) { // Untuk setiap lebar kolom
            sb.append("-".repeat(width)); // Tambahkan '-' sesuai lebar kolom
            sb.append("+"); // Akhiri tiap kolom dengan '+'
        }
        return sb.toString(); // Kembalikan garis border
    }

    // Fungsi pembantu untuk menengahkan teks dalam lebar tertentu
    public static String center(String s, int width) {
        int padding = width - s.length(); // Hitung selisih lebar
        int padLeft = padding / 2; // Padding kiri
        int padRight = padding - padLeft; // Padding kanan
        return " ".repeat(padLeft) + s + " ".repeat(padRight);
    }

    // Fungsi untuk menampilkan tabel produk
    public static void tampilkanTabel(List<Baju> inventory) {
        if (inventory.isEmpty()) { // Jika inventory kosong
            System.out.println("Tidak ada produk dalam petshop."); // Tampilkan pesan
            return;
        }
        int[] widths = cariPanjangMaksimum(inventory); // Hitung lebar kolom maksimal
        String border = borderLine(widths); // Buat garis border tabel
        System.out.println("\n===== DAFTAR PRODUK ====="); // Judul tabel
        System.out.println(border); // Cetak border atas

        // Cetak header tabel dengan format center
        System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|\n",
                center("ID", widths[0]),
                center("Nama Produk", widths[1]),
                center("Kategori", widths[2]),
                center("Harga (Rp)", widths[3]),
                center("Jenis", widths[4]),
                center("Bahan", widths[5]),
                center("Warna", widths[6]),
                center("Untuk", widths[7]),
                center("Size", widths[8]),
                center("Merk", widths[9]));
        System.out.println(border); // Cetak garis header

        // Iterasi tiap produk dan cetak baris tabel
        for (Baju produk : inventory) {
            String[] info = produk.getInfo(); // Ambil data produk sebagai array of Strings
            System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|\n",
                    center(info[0], widths[0]),
                    center(info[1], widths[1]),
                    center(info[2], widths[2]),
                    center(info[3], widths[3]),
                    center(info[4], widths[4]),
                    center(info[5], widths[5]),
                    center(info[6], widths[6]),
                    center(info[7], widths[7]),
                    center(info[8], widths[8]),
                    center(info[9], widths[9]));
        }
        System.out.println(border); // Cetak border bawah tabel
    }

    // Fungsi utama (main method)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat Scanner untuk input
        List<Baju> inventory = new ArrayList<>(); // Membuat list inventory untuk produk

        // Tambahkan 5 produk awal ke inventory
        inventory.add(new Baju(1, "Baju Anjing Kecil", "Pakaian", 150000, "Baju", "Katun", "Merah", "Anjing Kecil", 10,
                "PetLovers"));
        inventory.add(new Baju(2, "Baju Kucing Medium", "Pakaian", 200000, "Baju", "Wol", "Biru", "Kucing Medium", 15,
                "CatStyle"));
        inventory.add(new Baju(3, "Baju Anjing Besar", "Pakaian", 250000, "Baju", "Polyester", "Hitam", "Anjing Besar",
                20, "DogFashion"));
        inventory.add(new Baju(4, "Baju Kucing Kecil", "Pakaian", 120000, "Baju", "Katun", "Putih", "Kucing Kecil", 8,
                "KittyWear"));
        inventory.add(new Baju(5, "Baju Anjing Medium", "Pakaian", 180000, "Baju", "Wol", "Hijau", "Anjing Medium", 12,
                "PawFashion"));

        // Menu interaktif
        while (true) {
            System.out.println("\n===== PETSHOP MENU ====="); // Judul menu
            System.out.println("1. Tambah Produk"); // Opsi tambah produk
            System.out.println("2. Tampilkan Semua Produk"); // Opsi tampilkan produk
            System.out.println("3. Keluar"); // Opsi keluar
            System.out.print("Pilihan: "); // Prompt pilihan
            String choice = sc.nextLine(); // Baca input pilihan

            if (choice.equals("1")) { // Jika pilihan tambah produk
                try {
                    // Minta input untuk setiap atribut
                    System.out.print("ID Produk: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nama Produk: ");
                    String nama = sc.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = Double.parseDouble(sc.nextLine());
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Bahan: ");
                    String bahan = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Untuk: ");
                    String untuk = sc.nextLine();
                    System.out.print("Size: ");
                    int size = Integer.parseInt(sc.nextLine());
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();

                    // Tambahkan produk baru ke inventory
                    inventory.add(new Baju(id, nama, kategori, harga, jenis, bahan, warna, untuk, size, merk));
                    System.out.println("Produk berhasil ditambahkan!");
                } catch (Exception e) {
                    System.out.println("Input tidak valid!");
                }
            } else if (choice.equals("2")) {
                tampilkanTabel(inventory);
            } else if (choice.equals("3")) {
                System.out.println("Keluar dari program...");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close(); // Tutup scanner
    }
}
