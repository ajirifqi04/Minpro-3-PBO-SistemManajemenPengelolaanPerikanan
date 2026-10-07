# Minpro 2 PBO - Sistem Manajemen Pengelolaan Perikanan

Nama : Aji Rifqi Suryana

NIM : 2509116054

## 1. Deskripsi Singkat Program

Program ini merupakan pengembangan dari Mini Project 2 berupa aplikasi berbasis console menggunakan Java untuk mengelola data perikanan. Data yang dikelola meliputi data ikan, lokasi penangkapan, dan hasil penangkapan.

Data lokasi penangkapan dan hasil penangkapan terhubung dengan data ikan melalui idIkan, sehingga setiap lokasi dan hasil penangkapan dapat diketahui terkait dengan ikan yang mana.

Program memiliki fitur tambah, tampil, ubah, dan hapus data perikanan. Pada program ini diterapkan konsep Pemrograman Berorientasi Objek seperti encapsulation, inheritance, polymorphism, dan abstraction. Program juga menggunakan interface sebagai penerapan nilai tambah serta menggunakan struktur MVC untuk memisahkan bagian Model, View, dan Controller.

---

## 2. Penjelasan Struktur Package

Program menggunakan struktur *Model-View-Controller* (MVC) yang terdiri dari package `model`, `view`, `controller`, dan `main`.

### Package `model`

Package `model` digunakan untuk mengatur data dan objek yang terdapat dalam sistem. Package ini terdiri dari:

- `DataPerikanan` sebagai *interface*.
- `Ikan` sebagai *abstract class*.
- `IkanLaut` sebagai subclass dari `Ikan`.
- `IkanAirTawar` sebagai subclass dari `Ikan`.
- `LokasiPenangkapan` untuk menyimpan data lokasi penangkapan.
- `HasilPenangkapan` untuk menyimpan data hasil penangkapan.

### Package `view`

Package `view` berisi `IkanView` yang digunakan untuk menampilkan menu, menerima input dari pengguna, melakukan validasi input, dan menampilkan data.

### Package `controller`

Package `controller` berisi `IkanController` yang digunakan untuk mengatur jalannya program dan menghubungkan bagian `model` dengan `view`.

### Package `main`

Package `main` berisi `Main` yang digunakan sebagai titik awal program. Class `Main` memanggil method `start()` pada `IkanController`.

<img width="373" height="380" alt="image" src="https://github.com/user-attachments/assets/50b371b0-32b9-4176-b160-6d395cf93909" />

---

## 3. Penjelasan Alur Program

Program dimulai dari class `Main` yang memanggil method `start()` pada `IkanController`. Setelah program dijalankan, sistem akan menampilkan menu utama.

<img width="462" height="156" alt="image" src="https://github.com/user-attachments/assets/98b7031b-68e9-41e2-b90f-55acd564c2b7" />

### Menu 1 - Tambah Data

Pada menu tambah data, proses dimulai dengan pengguna memasukkan nama ikan. Sistem melakukan validasi agar input tidak boleh kosong. Jika pengguna tidak memasukkan data, sistem menampilkan pesan bahwa input tidak boleh kosong dan pengguna diminta memasukkan data kembali.

Selanjutnya pengguna memasukkan jenis ikan dengan pilihan `Ikan Konsumsi` atau `Ikan Budidaya`. Jika input kosong atau tidak sesuai dengan pilihan yang tersedia, sistem akan menampilkan pesan kesalahan dan meminta pengguna memasukkan data kembali.

Setelah itu pengguna memasukkan jumlah stok. Input jumlah stok divalidasi agar tidak kosong, harus berupa angka, dan tidak boleh bernilai negatif. Jika pengguna memasukkan huruf atau angka negatif, sistem menampilkan pesan kesalahan dan meminta input kembali.

Kemudian pengguna memilih jenis perairan dengan pilihan `Laut` atau `Air Tawar`. Jika input kosong atau tidak sesuai dengan pilihan yang tersedia, sistem akan meminta pengguna memasukkan pilihan yang benar.

Jika memilih `Laut`, pengguna diminta memasukkan kedalaman habitat. Input tersebut harus berupa angka dan tidak boleh bernilai negatif.

Jika memilih `Air Tawar`, pengguna diminta memasukkan nama perairan. Input tersebut tidak boleh kosong.

Setelah seluruh data berhasil dimasukkan, sistem secara otomatis membuat ID ikan, ID lokasi, dan ID hasil penangkapan. Data kemudian disimpan ke dalam `ArrayList`.

<img width="469" height="821" alt="image" src="https://github.com/user-attachments/assets/59d7f6f8-9366-4c74-9062-87517b4d3888" />

---

### Menu 2 - Tampilkan Data

Pada menu tampilkan data, sistem mengambil data yang tersimpan pada `ArrayList` dan menampilkannya kepada pengguna.

Data yang ditampilkan terdiri dari data ikan, data lokasi penangkapan, dan data hasil penangkapan. Data ikan menampilkan informasi sesuai dengan jenis ikan yang digunakan.

Jika belum terdapat data pada suatu bagian, sistem akan menampilkan pesan bahwa data belum tersedia.

<img width="389" height="830" alt="image" src="https://github.com/user-attachments/assets/f224554d-937a-4880-91e5-2ec4f12d92c0" />

---

### Menu 3 - Ubah Data

Pada menu ubah data, pengguna terlebih dahulu memasukkan ID ikan yang ingin diubah.

Sistem akan mencari ID tersebut pada data ikan yang tersimpan. Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data ikan tidak ditemukan dan proses ubah data dihentikan.

Jika ID ditemukan, pengguna diminta memasukkan nama ikan baru, jenis ikan baru, dan jumlah stok baru.

Setiap input tetap dilakukan melalui validasi. Nama ikan tidak boleh kosong, jenis ikan harus sesuai dengan pilihan yang tersedia, dan jumlah stok harus berupa angka serta tidak boleh bernilai negatif.

Setelah seluruh data berhasil dimasukkan, data ikan akan diperbarui.

<img width="463" height="338" alt="image" src="https://github.com/user-attachments/assets/c2bbcd7f-7133-43f5-9c8e-f03162748aba" />

---

### Menu 4 - Hapus Data

Pada menu hapus data, pengguna memasukkan ID ikan yang ingin dihapus.

Sistem kemudian mencari data berdasarkan ID tersebut. Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data ikan tidak ditemukan.

Jika ID ditemukan, data ikan akan dihapus. Data lokasi penangkapan dan hasil penangkapan yang memiliki hubungan dengan ikan tersebut juga ikut dihapus.

Setelah proses selesai, sistem menampilkan pesan bahwa data ikan berhasil dihapus.




---

### Menu 5 - Keluar

Pada menu keluar, pengguna memilih pilihan `5`. Sistem akan menampilkan pesan bahwa program selesai dan kemudian menghentikan perulangan menu.

**[SCREENSHOT 14 - Tampilan Saat Memilih Menu Keluar]**

---

### Error Handling pada Program

Program memiliki validasi input untuk mencegah data yang tidak sesuai. Validasi dilakukan pada input menu, input teks, input jenis ikan, input jenis perairan, jumlah stok, dan kedalaman habitat.

Pada input teks, sistem akan menolak input kosong. Pada input pilihan, sistem akan menolak pilihan yang tidak sesuai dengan pilihan yang telah ditentukan.

Pada input angka, sistem menggunakan pengecekan agar input harus berupa angka. Jika pengguna memasukkan karakter atau teks, sistem akan menampilkan pesan kesalahan dan meminta input kembali. Jumlah stok dan kedalaman habitat juga tidak boleh bernilai negatif.

Pada proses ubah dan hapus data, sistem melakukan pencarian berdasarkan ID ikan. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa data ikan tidak ditemukan.

**[SCREENSHOT 15 - Kumpulan Contoh Error Handling Program]**

---

## 4. Penerapan Encapsulation dan Inheritance

### Encapsulation

Konsep *encapsulation* diterapkan dengan menggunakan access modifier `private` pada atribut class. Atribut tersebut tidak dapat diakses secara langsung dari luar class dan diakses melalui method *getter* dan *setter*.

Contohnya pada class `Ikan`:

```java
private int idIkan;
private String namaIkan;
private String jenisIkan;
private int jumlahStok;
```

Akses terhadap atribut dilakukan menggunakan *getter* dan perubahan data dilakukan menggunakan *setter*. Setter juga memiliki validasi, seperti pada `setJumlahStok()` yang memastikan jumlah stok tidak bernilai negatif.

**[SCREENSHOT 16 - Atribut Private, Getter, dan Setter pada Ikan.java]**

### Inheritance

Konsep *inheritance* diterapkan dengan menjadikan `Ikan` sebagai superclass dan `IkanLaut` serta `IkanAirTawar` sebagai subclass.

```text
Ikan
├── IkanLaut
└── IkanAirTawar
```

Class `IkanLaut` dan `IkanAirTawar` mewarisi atribut dan method dari class `Ikan`. Selain itu, masing-masing subclass memiliki atribut tambahan sesuai dengan jenisnya. `IkanLaut` memiliki `kedalamanHabitat`, sedangkan `IkanAirTawar` memiliki informasi perairan.

**[SCREENSHOT 17 - Ikan.java, IkanLaut.java, dan IkanAirTawar.java]**

---

## 5. Penerapan Polymorphism dan Abstraction

### Polymorphism

Konsep *polymorphism* diterapkan melalui *overriding* dan *overloading*.

*Overriding* diterapkan pada method `tampilkanDetail()` yang terdapat pada class `Ikan` dan diimplementasikan kembali pada class `IkanLaut` dan `IkanAirTawar` menggunakan `@Override`.

```java
@Override
public void tampilkanDetail() {
    // menampilkan detail data
}
```

**[SCREENSHOT 18 - Method Overriding pada IkanLaut atau IkanAirTawar]**

*Overloading* diterapkan pada class `Ikan` melalui method `tampilkanDetail()` yang memiliki parameter berbeda.

```java
public abstract void tampilkanDetail();

public void tampilkanDetail(String judul) {
    System.out.println("\n=== " + judul + " ===");
    tampilkanDetail();
}
```

**[SCREENSHOT 19 - Method Overloading pada Ikan.java]**

Polymorphism juga diterapkan pada `ArrayList<Ikan>` yang dapat menyimpan objek dari subclass seperti `IkanLaut`.

```java
private final ArrayList<Ikan> daftarIkan = new ArrayList<>();
```

**[SCREENSHOT 20 - ArrayList<Ikan> dan Objek IkanLaut]**

### Abstraction

Konsep *abstraction* diterapkan dengan menjadikan class `Ikan` sebagai *abstract class*.

```java
public abstract class Ikan implements DataPerikanan
```

Class `Ikan` memiliki *abstract method* `tampilkanDetail()`:

```java
public abstract void tampilkanDetail();
```

Method tersebut kemudian diimplementasikan oleh subclass `IkanLaut` dan `IkanAirTawar`. Dengan demikian, class `Ikan` menjadi dasar bagi subclass tanpa membuat objek `Ikan` secara langsung.

**[SCREENSHOT 21 - Abstract Class dan Abstract Method pada Ikan.java]**

---

## 6. Letak Penerapan Nilai Tambah

Nilai tambah yang diterapkan pada program adalah penggunaan *interface*.

Interface `DataPerikanan` terdapat pada package `model`:

```java
public interface DataPerikanan {
    void tampilkanData();
}
```

Interface tersebut diimplementasikan oleh class yang membutuhkan method `tampilkanData()`, seperti `Ikan`, `LokasiPenangkapan`, dan `HasilPenangkapan`.

Contoh penerapannya pada class `Ikan`:

```java
public abstract class Ikan implements DataPerikanan
```

Penggunaan *interface* memungkinkan beberapa class memiliki aturan method yang sama, yaitu `tampilkanData()`.

**[SCREENSHOT 22 - DataPerikanan.java dan Penerapan implements DataPerikanan]**
