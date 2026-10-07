/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Ikan;
import model.IkanLaut;
import model.LokasiPenangkapan;
import model.HasilPenangkapan;
import view.IkanView;

/**
 *
 * @author AjiHowhow
 */
public class IkanController {
    private final IkanView view = new IkanView();

    private final ArrayList<Ikan> daftarIkan = new ArrayList<>();
    private final ArrayList<LokasiPenangkapan> daftarLokasi = new ArrayList<>();
    private final ArrayList<HasilPenangkapan> daftarHasil = new ArrayList<>();

    private int nomorIkan = 2;
    private int nomorLokasi = 2;
    private int nomorHasil = 2;

    public IkanController() {
        isiDataAwal();
    }

    public void start() {
        int pilihan;

        do {
            pilihan = view.menu();

            if (pilihan == 1) {
                tambahData();
            } else if (pilihan == 2) {
                tampilkanData();
            } else if (pilihan == 3) {
                ubahData();
            } else if (pilihan == 4) {
                hapusData();
            } else if (pilihan == 5) {
                view.pesan("Program selesai.");
            }
        } while (pilihan != 5);
    }

    private void tambahData() {
        String idIkan;

        if (nomorIkan < 10) {
            idIkan = "I00" + nomorIkan;
        } else if (nomorIkan < 100) {
            idIkan = "I0" + nomorIkan;
        } else {
            idIkan = "I" + nomorIkan;
        }

        Ikan ikan = view.inputIkan(nomorIkan);
        daftarIkan.add(ikan);

        String idLokasi;

        if (nomorLokasi < 10) {
            idLokasi = "LK00" + nomorLokasi;
        } else if (nomorLokasi < 100) {
            idLokasi = "LK0" + nomorLokasi;
        } else {
            idLokasi = "LK" + nomorLokasi;
        }

        LokasiPenangkapan lokasi = view.inputLokasi(nomorIkan, idLokasi);
        daftarLokasi.add(lokasi);

        String idHasil;

        if (nomorHasil < 10) {
            idHasil = "HP00" + nomorHasil;
        } else if (nomorHasil < 100) {
            idHasil = "HP0" + nomorHasil;
        } else {
            idHasil = "HP" + nomorHasil;
        }

        HasilPenangkapan hasil = view.inputHasil(nomorIkan, idHasil);
        daftarHasil.add(hasil);

        view.pesan("\nData berhasil ditambahkan.");
        view.pesan("ID Ikan: " + idIkan);
        view.pesan("ID Lokasi: " + idLokasi);
        view.pesan("ID Hasil: " + idHasil);

        nomorIkan++;
        nomorLokasi++;
        nomorHasil++;
    }

    private void tampilkanData() {
        view.tampilkanSemua(daftarIkan, daftarLokasi, daftarHasil);
    }

    private void ubahData() {
        String id = view.inputId();
        Ikan ikan = cariIkan(id);

        if (ikan == null) {
            view.pesan("Data ikan tidak ditemukan.");
            return;
        }

        String nama = view.inputNama();
        String jenis = view.inputJenis();
        int stok = view.inputStok();

        ikan.setNamaIkan(nama);
        ikan.setJenisIkan(jenis);
        ikan.setJumlahStok(stok);

        view.pesan("Data ikan berhasil diubah.");
    }

    private void hapusData() {
        String id = view.inputId();
        Ikan ikan = cariIkan(id);

        if (ikan == null) {
            view.pesan("Data ikan tidak ditemukan.");
            return;
        }

        int nomorIkan = ikan.getNomorIkan();

        daftarIkan.remove(ikan);

        for (int i = daftarLokasi.size() - 1; i >= 0; i--) {
            if (daftarLokasi.get(i).getIdIkan() == nomorIkan) {
                daftarLokasi.remove(i);
            }
        }

        for (int i = daftarHasil.size() - 1; i >= 0; i--) {
            if (daftarHasil.get(i).getIdIkan() == nomorIkan) {
                daftarHasil.remove(i);
            }
        }

        view.pesan("Data ikan berhasil dihapus.");
    }

    private Ikan cariIkan(String idIkan) {
        for (int i = 0; i < daftarIkan.size(); i++) {
            Ikan ikan = daftarIkan.get(i);

            if (ikan.getIdIkan().equals(idIkan)) {
                return ikan;
            }
        }

        return null;
    }

    private void isiDataAwal() {
        Ikan ikan = new IkanLaut(
                1,
                "Ikan Tuna",
                "Konsumsi",
                50,
                100
        );

        daftarIkan.add(ikan);

        LokasiPenangkapan lokasi = new LokasiPenangkapan(
                "LK001",
                1,
                "Laut Samarinda",
                "Kalimantan Timur"
        );

        daftarLokasi.add(lokasi);

        HasilPenangkapan hasil = new HasilPenangkapan(
                "HP001",
                1,
                "20-09-2026",
                "Baik"
        );

        daftarHasil.add(hasil);
    }
}
