/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public abstract class Ikan implements DataPerikanan {
    private int idIkan;
    private String namaIkan;
    private String jenisIkan;
    private int jumlahStok;

    public Ikan(int idIkan, String namaIkan, String jenisIkan, int jumlahStok) {
        setIdIkan(idIkan);
        setNamaIkan(namaIkan);
        setJenisIkan(jenisIkan);
        setJumlahStok(jumlahStok);
    }

    public int getNomorIkan() {
        return idIkan;
    }

    public String getIdIkan() {
        if (idIkan < 10) {
            return "I00" + idIkan;
        } else if (idIkan < 100) {
            return "I0" + idIkan;
        } else {
            return "I" + idIkan;
        }
    }

    public String getNamaIkan() {
        return namaIkan;
    }

    public String getJenisIkan() {
        return jenisIkan;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public final void setIdIkan(int idIkan) {
        if (idIkan > 0) {
            this.idIkan = idIkan;
        }
    }

    public void setNamaIkan(String namaIkan) {
        if (namaIkan != null && !namaIkan.equals("")) {
            this.namaIkan = namaIkan;
        }
    }

    public void setJenisIkan(String jenisIkan) {
        if (jenisIkan != null && !jenisIkan.equals("")) {
            this.jenisIkan = jenisIkan;
        }
    }

    public void setJumlahStok(int jumlahStok) {
        if (jumlahStok >= 0) {
            this.jumlahStok = jumlahStok;
        }
    }

    public abstract void tampilkanDetail();

    public void tampilkanDetail(String judul) {
        System.out.println("\n=== " + judul + " ===");
        tampilkanDetail();
    }

    @Override
    public final void tampilkanData() {
        tampilkanDetail();
    }
}