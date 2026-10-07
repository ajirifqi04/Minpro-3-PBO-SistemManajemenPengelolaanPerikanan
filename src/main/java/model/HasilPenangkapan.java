/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class HasilPenangkapan implements DataPerikanan {
    private String idHasil;
    private int idIkan;
    private String tanggal;
    private String kondisi;

    public HasilPenangkapan(String idHasil, int idIkan, String tanggal, String kondisi) {
        setIdHasil(idHasil);
        setIdIkan(idIkan);
        setTanggal(tanggal);
        setKondisi(kondisi);
    }

    public String getIdHasil() {
        return idHasil;
    }

    public int getIdIkan() {
        return idIkan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setIdHasil(String idHasil) {
        if (idHasil != null && !idHasil.equals("")) {
            this.idHasil = idHasil;
        }
    }

    public void setIdIkan(int idIkan) {
        if (idIkan > 0) {
            this.idIkan = idIkan;
        }
    }

    public void setTanggal(String tanggal) {
        if (tanggal != null && !tanggal.equals("")) {
            this.tanggal = tanggal;
        }
    }

    public void setKondisi(String kondisi) {
        if (kondisi != null && !kondisi.equals("")) {
            this.kondisi = kondisi;
        }
    }

    public void tampilkanDetail() {
        System.out.println("ID Hasil            : " + idHasil);
        System.out.println("ID Ikan             : I00" + idIkan);
        System.out.println("Tanggal             : " + tanggal);
        System.out.println("Kondisi             : " + kondisi);
    }

    @Override
    public void tampilkanData() {
        tampilkanDetail();
    }
}