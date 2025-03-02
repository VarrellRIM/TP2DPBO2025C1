<?php
// index.php
// File utama untuk aplikasi PetShop Inventory Management berbasis PHP
// Menggunakan session untuk menyimpan inventory produk


// Sertakan file kelas yang diperlukan
require_once 'PetShop.php';      // File definisi kelas PetShop
require_once 'Aksesoris.php';     // File definisi kelas Aksesoris
require_once 'Baju.php';          // File definisi kelas Baju

session_start(); // Mulai session

// Inisialisasi inventory dalam session jika belum ada
if (!isset($_SESSION['inventory'])) {
    $_SESSION['inventory'] = array();

    // Fungsi untuk mengonversi gambar ke base64
    function gambarKeBase64($path) {
        if (file_exists($path)) {
            $gambarData = file_get_contents($path);
            return base64_encode($gambarData);
        }
        return ""; // Jika file tidak ditemukan, kembalikan string kosong
    }

    // Tambahkan 5 objek default dengan gambar dalam format base64
    $_SESSION['inventory'][] = new Baju(
        1,
        "Baju Anjing Kecil",
        "Pakaian",
        150000,
        gambarKeBase64("images/baju_anjing_kecil.jpg"), // Konversi gambar ke base64
        "Baju",
        "Katun",
        "Merah",
        "Anjing Kecil",
        10,
        "PetLovers"
    );

    $_SESSION['inventory'][] = new Baju(
        2,
        "Baju Kucing Medium",
        "Pakaian",
        200000,
        gambarKeBase64("images/baju_kucing_medium.jpg"),
        "Baju",
        "Wol",
        "Biru",
        "Kucing Medium",
        15,
        "CatStyle"
    );

    $_SESSION['inventory'][] = new Baju(
        3,
        "Sweater Anjing Besar",
        "Pakaian",
        250000,
        gambarKeBase64("images/sweater_anjing_besar.jpg"),
        "Sweater",
        "Rajut",
        "Coklat",
        "Anjing Besar",
        25,
        "DogFashion"
    );

    $_SESSION['inventory'][] = new Baju(
        4,
        "Jaket Kucing Lucu",
        "Pakaian",
        180000,
        gambarKeBase64("images/jaket_kucing_lucu.jpg"),
        "Jaket",
        "Poliester",
        "Pink",
        "Kucing Kecil",
        12,
        "MeowStyle"
    );

    $_SESSION['inventory'][] = new Baju(
        5,
        "Hoodie Anjing Medium",
        "Pakaian",
        230000,
        gambarKeBase64("images/hoodie_anjing_medium.jpg"),
        "Hoodie",
        "Fleece",
        "Hitam",
        "Anjing Medium",
        18,
        "PawTrendy"
    );
}

// Fungsi untuk menambahkan produk baru
function tambahProduk() {
    echo "<h2>Tambah Produk</h2>";
    echo '<form method="post" enctype="multipart/form-data">
            <label for="id">ID Produk:</label><br>
            <input type="number" name="id" required><br>
            <label for="nama">Nama Produk:</label><br>
            <input type="text" name="nama" required><br>
            <label for="kategori">Kategori:</label><br>
            <input type="text" name="kategori" required><br>
            <label for="harga">Harga:</label><br>
            <input type="number" step="0.01" name="harga" required><br>
            <label for="jenis">Jenis:</label><br>
            <input type="text" name="jenis" required><br>
            <label for="bahan">Bahan:</label><br>
            <input type="text" name="bahan" required><br>
            <label for="warna">Warna:</label><br>
            <input type="text" name="warna" required><br>
            <label for="untuk">Untuk:</label><br>
            <input type="text" name="untuk" required><br>
            <label for="size">Size:</label><br>
            <input type="number" name="size" required><br>
            <label for="merk">Merk:</label><br>
            <input type="text" name="merk" required><br>
            <label for="gambar">Gambar Produk:</label><br>
            <input type="file" name="gambar" accept="image/*"><br><br>
            <input type="submit" name="submit_tambah" value="Tambah Produk">
          </form>';

    if (isset($_POST['submit_tambah'])) {
        $id = $_POST['id'];
        $nama = $_POST['nama'];
        $kategori = $_POST['kategori'];
        $harga = $_POST['harga'];
        $jenis = $_POST['jenis'];
        $bahan = $_POST['bahan'];
        $warna = $_POST['warna'];
        $untuk = $_POST['untuk'];
        $size = $_POST['size'];
        $merk = $_POST['merk'];

        // Proses gambar jika ada
        $gambarBase64 = "";
        if (isset($_FILES['gambar']) && $_FILES['gambar']['error'] === UPLOAD_ERR_OK) {
            $fileTmpPath = $_FILES['gambar']['tmp_name'];
            $gambarData = file_get_contents($fileTmpPath);
            $gambarBase64 = base64_encode($gambarData);
        }

        // Buat objek Baju baru dan tambahkan ke inventory
        $produk = new Baju($id, $nama, $kategori, $harga, $gambarBase64, $jenis, $bahan, $warna, $untuk, $size, $merk);
        $_SESSION['inventory'][] = $produk;

        echo "<p>Produk berhasil ditambahkan!</p>";
    }
}

// Fungsi untuk menampilkan semua produk
function tampilkanSemuaProduk() {
    echo "<h2>Daftar Semua Produk</h2>";
    if (empty($_SESSION['inventory'])) {
        echo "<p>Tidak ada produk dalam inventory.</p>";
    } else {
        foreach ($_SESSION['inventory'] as $produk) {
            echo $produk->displayInfo();
        }
    }
}

// Fungsi untuk menampilkan menu utama
function tampilkanMenu() {
    echo "<h2>Menu PetShop</h2>";
    echo "<ul>
            <li><a href='?menu=tambah'>Tambah Produk</a></li>
            <li><a href='?menu=tampilkan'>Tampilkan Semua Produk</a></li>
            <li><a href='?menu=keluar'>Keluar</a></li>
          </ul>";

    if (isset($_GET['menu'])) {
        $menu = $_GET['menu'];
        if ($menu == "tambah") {
            tambahProduk();
        } elseif ($menu == "tampilkan") {
            tampilkanSemuaProduk();
        } elseif ($menu == "keluar") {
            echo "<p>Terima kasih telah menggunakan aplikasi ini!</p>";
        } else {
            echo "<p>Menu tidak valid!</p>";
        }
    }
}

// Jalankan menu utama
tampilkanMenu();
?>
