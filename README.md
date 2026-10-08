# Minpro 3 PBO - Sistem Manajemen Pengelolaan Perikanan

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

<img width="491" height="243" alt="image" src="https://github.com/user-attachments/assets/ebe75312-0c00-412a-a174-40725dc9262e" />

---

### Menu 5 - Keluar

Pada menu keluar, pengguna memilih pilihan `5`. Sistem akan menampilkan pesan bahwa program selesai dan kemudian menghentikan perulangan menu.

<img width="791" height="354" alt="image" src="https://github.com/user-attachments/assets/b5082e15-ac36-4c41-ac4a-6e6cfdaac1b2" />

---

## 4. Penerapan Encapsulation dan Inheritance

### Encapsulation

Konsep *encapsulation* diterapkan dengan menggunakan access modifier `private` pada atribut class. Atribut tersebut tidak dapat diakses secara langsung dari luar class dan diakses melalui method *getter* dan *setter*.

Contohnya pada class `Ikan`:

<img width="317" height="112" alt="image" src="https://github.com/user-attachments/assets/83ec0d85-ee20-4f38-b2ac-42dcec1600c7" />

Akses terhadap atribut dilakukan menggunakan *getter* dan perubahan data dilakukan menggunakan *setter*. Setter juga memiliki validasi, seperti pada `setJumlahStok()` yang memastikan jumlah stok tidak bernilai negatif.

<img width="389" height="245" alt="image" src="https://github.com/user-attachments/assets/0ffdce64-42ad-4ecb-9df7-41317ef9e26a" />

### Inheritance

Konsep *inheritance* diterapkan dengan menjadikan `Ikan` sebagai superclass dan `IkanLaut` serta `IkanAirTawar` sebagai subclass.

<img width="203" height="85" alt="image" src="https://github.com/user-attachments/assets/14acb217-c031-4906-b25d-50f287442ab6" />

Class `IkanLaut` dan `IkanAirTawar` mewarisi atribut dan method dari class `Ikan`. Selain itu, masing-masing subclass memiliki atribut tambahan sesuai dengan jenisnya. `IkanLaut` memiliki `kedalamanHabitat`, sedangkan `IkanAirTawar` memiliki informasi perairan.

---

## 5. Penerapan Polymorphism dan Abstraction

### Polymorphism

Konsep *polymorphism* diterapkan melalui *overriding* dan *overloading*.

*Overriding* diterapkan pada method `tampilkanDetail()` yang terdapat pada class `Ikan` dan diimplementasikan kembali pada class `IkanLaut` dan `IkanAirTawar` menggunakan `@Override`.

<img width="851" height="236" alt="image" src="https://github.com/user-attachments/assets/500cc693-b113-4b4e-ba5e-c9fe8fde52d9" />

<img width="988" height="220" alt="image" src="https://github.com/user-attachments/assets/d280f2b2-f9aa-40a9-b424-fd6bd97bbbe1" />

*Overloading* diterapkan pada class `Ikan` melalui method `tampilkanDetail()` yang memiliki parameter berbeda.

<img width="613" height="111" alt="image" src="https://github.com/user-attachments/assets/64decc36-50a8-4328-878a-323f971c8150" />

Polymorphism juga diterapkan pada `ArrayList<Ikan>` yang dapat menyimpan objek dari subclass seperti `IkanLaut`.

### Abstraction

Konsep *abstraction* diterapkan dengan menjadikan class `Ikan` sebagai *abstract class*.

<img width="623" height="29" alt="image" src="https://github.com/user-attachments/assets/bcec221e-b5dd-4904-ab68-c651bdbd881c" />

Class `Ikan` memiliki *abstract method* `tampilkanDetail()`:

<img width="481" height="36" alt="image" src="https://github.com/user-attachments/assets/4c14a795-9deb-4639-9213-15266bb1d62d" />

Method tersebut kemudian diimplementasikan oleh subclass `IkanLaut` dan `IkanAirTawar`. Dengan demikian, class `Ikan` menjadi dasar bagi subclass tanpa membuat objek `Ikan` secara langsung.

---

## 6. Penerapan Nilai Tambah Interface

Nilai tambah yang diterapkan pada program adalah penggunaan *interface*.

Interface `DataPerikanan` terdapat pada package `model`:

<img width="404" height="82" alt="image" src="https://github.com/user-attachments/assets/c6f8c84f-e428-488e-aa26-1b0754963d29" />

Interface tersebut diimplementasikan oleh class yang membutuhkan method `tampilkanData()`, seperti `Ikan`, `LokasiPenangkapan`, dan `HasilPenangkapan`.

Contoh penerapannya pada class `Ikan`:

<img width="621" height="41" alt="image" src="https://github.com/user-attachments/assets/399dd017-8aa1-4b3d-8f6c-87488d40817c" />

Penggunaan *interface* memungkinkan beberapa class memiliki aturan method yang sama, yaitu `tampilkanData()`.
