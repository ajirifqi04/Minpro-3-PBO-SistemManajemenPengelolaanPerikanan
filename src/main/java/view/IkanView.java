/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Ikan;
import model.IkanLaut;
import model.IkanAirTawar;
import model.LokasiPenangkapan;
import model.HasilPenangkapan;

/**
 *
 * @author AjiHowhow
 */
public class IkanView {
    private final Scanner input = new Scanner(System.in);

    public int menu() {
        String teks;
        int pilihan = 0;
        boolean valid = false;

        do {
            System.out.println("\n=== SISTEM INFORMASI PENGELOLAAN PERIKANAN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            teks = input.nextLine();

            if (teks.equals("")) {
                System.out.println("Input tidak boleh kosong.");
            } else {
                try {
                    pilihan = Integer.parseInt(teks);

                    if (pilihan < 1 || pilihan > 5) {
                        System.out.println("Pilihan hanya 1 sampai 5.");
                    } else {
                        valid = true;
                    }
                } catch (Exception e) {
                    System.out.println("Input harus berupa angka.");
                }
            }
        } while (!valid);

        return pilihan;
    }

    public Ikan inputIkan(int idIkan) {
        System.out.println("\n=== INPUT DATA IKAN ===");

        String namaIkan = inputNama();
        String jenisIkan = inputJenis();
        int jumlahStok = inputStok();

        String jenisPerairan;

        do {
            System.out.print("Jenis Perairan (Laut/Air Tawar): ");
            jenisPerairan = input.nextLine();

            if (jenisPerairan.equals("")) {
                System.out.println("Jenis Perairan tidak boleh kosong.");
            } else if (!jenisPerairan.equals("Laut")
                    && !jenisPerairan.equals("Air Tawar")) {
                System.out.println("Masukkan Laut atau Air Tawar.");
            }
        } while (jenisPerairan.equals("")
                || (!jenisPerairan.equals("Laut")
                && !jenisPerairan.equals("Air Tawar")));

        if (jenisPerairan.equals("Laut")) {
            int kedalaman = inputKedalaman();

            return new IkanLaut(
                    idIkan,
                    namaIkan,
                    jenisIkan,
                    jumlahStok,
                    kedalaman
            );
        } else {
            String namaPerairan = inputTeks("Nama Perairan");

            return new IkanAirTawar(
                    idIkan,
                    namaIkan,
                    jenisIkan,
                    jumlahStok,
                    namaPerairan
            );
        }
    }

    public String inputNama() {
        return inputTeks("Nama Ikan");
    }

    public String inputJenis() {
        String jenis;

        do {
            System.out.print("Jenis Ikan (Ikan Konsumsi/Ikan Budidaya): ");
            jenis = input.nextLine();

            if (jenis.equals("")) {
                System.out.println("Jenis Ikan tidak boleh kosong.");
            } else if (!jenis.equals("Ikan Konsumsi")
                    && !jenis.equals("Ikan Budidaya")) {
                System.out.println("Masukkan Ikan Konsumsi atau Ikan Budidaya.");
            }
        } while (jenis.equals("")
                || (!jenis.equals("Ikan Konsumsi")
                && !jenis.equals("Ikan Budidaya")));

        if (jenis.equals("Ikan Konsumsi")) {
            return "Konsumsi";
        } else {
            return "Budidaya";
        }
    }

    public int inputStok() {
        String teks;
        int stok = 0;
        boolean valid = false;

        do {
            System.out.print("Jumlah Stok: ");
            teks = input.nextLine();

            if (teks.equals("")) {
                System.out.println("Jumlah Stok tidak boleh kosong.");
            } else {
                try {
                    stok = Integer.parseInt(teks);

                    if (stok < 0) {
                        System.out.println("Jumlah Stok tidak boleh negatif.");
                    } else {
                        valid = true;
                    }
                } catch (Exception e) {
                    System.out.println("Jumlah Stok harus berupa angka.");
                }
            }
        } while (!valid);

        return stok;
    }

    public int inputKedalaman() {
        String teks;
        int kedalaman = 0;
        boolean valid = false;

        do {
            System.out.print("Kedalaman Habitat (meter): ");
            teks = input.nextLine();

            if (teks.equals("")) {
                System.out.println("Kedalaman Habitat tidak boleh kosong.");
            } else {
                try {
                    kedalaman = Integer.parseInt(teks);

                    if (kedalaman < 0) {
                        System.out.println("Kedalaman Habitat tidak boleh negatif.");
                    } else {
                        valid = true;
                    }
                } catch (Exception e) {
                    System.out.println("Kedalaman Habitat harus berupa angka.");
                }
            }
        } while (!valid);

        return kedalaman;
    }

    public String inputTeks(String label) {
        String teks;

        do {
            System.out.print(label + ": ");
            teks = input.nextLine();

            if (teks.equals("")) {
                System.out.println(label + " tidak boleh kosong.");
            }
        } while (teks.equals(""));

        return teks;
    }

    public String inputId() {
        String id;

        do {
            System.out.print("Masukkan ID Ikan: ");
            id = input.nextLine();

            if (id.equals("")) {
                System.out.println("ID tidak boleh kosong.");
            }
        } while (id.equals(""));

        return id;
    }

    public LokasiPenangkapan inputLokasi(int idIkan, String idLokasi) {
        System.out.println("\n=== INPUT LOKASI PENANGKAPAN ===");

        String namaLokasi = inputTeks("Nama Lokasi");
        String wilayah = inputTeks("Wilayah");

        return new LokasiPenangkapan(
                idLokasi,
                idIkan,
                namaLokasi,
                wilayah
        );
    }

    public HasilPenangkapan inputHasil(int idIkan, String idHasil) {
        System.out.println("\n=== INPUT HASIL PENANGKAPAN ===");

        String tanggal = inputTeks("Tanggal");
        String kondisi = inputTeks("Kondisi");

        return new HasilPenangkapan(
                idHasil,
                idIkan,
                tanggal,
                kondisi
        );
    }

    public void tampilkanSemua(
            ArrayList<Ikan> daftarIkan,
            ArrayList<LokasiPenangkapan> daftarLokasi,
            ArrayList<HasilPenangkapan> daftarHasil) {

        System.out.println("\n=== DATA IKAN ===");

        if (daftarIkan.size() == 0) {
            System.out.println("Belum ada data ikan.");
        } else {
            for (int i = 0; i < daftarIkan.size(); i++) {
                daftarIkan.get(i).tampilkanData();
                System.out.println("-----------------------------------");
            }
        }

        System.out.println("\n=== DATA LOKASI PENANGKAPAN ===");

        if (daftarLokasi.size() == 0) {
            System.out.println("Belum ada data lokasi.");
        } else {
            for (int i = 0; i < daftarLokasi.size(); i++) {
                daftarLokasi.get(i).tampilkanData();
                System.out.println("-----------------------------------");
            }
        }

        System.out.println("\n=== DATA HASIL PENANGKAPAN ===");

        if (daftarHasil.size() == 0) {
            System.out.println("Belum ada data hasil penangkapan.");
        } else {
            for (int i = 0; i < daftarHasil.size(); i++) {
                daftarHasil.get(i).tampilkanData();
                System.out.println("-----------------------------------");
            }
        }
    }

    public void pesan(String pesan) {
        System.out.println(pesan);
    }
}
