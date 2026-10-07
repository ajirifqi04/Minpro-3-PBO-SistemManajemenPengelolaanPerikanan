/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class LokasiPenangkapan implements DataPerikanan {
    private String idLokasi;
    private int idIkan;
    private String namaLokasi;
    private String wilayah;

    public LokasiPenangkapan(String idLokasi, int idIkan, String namaLokasi, String wilayah) {
        setIdLokasi(idLokasi);
        setIdIkan(idIkan);
        setNamaLokasi(namaLokasi);
        setWilayah(wilayah);
    }

    public String getIdLokasi() {
        return idLokasi;
    }

    public int getIdIkan() {
        return idIkan;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setIdLokasi(String idLokasi) {
        if (idLokasi != null && !idLokasi.equals("")) {
            this.idLokasi = idLokasi;
        }
    }

    public void setIdIkan(int idIkan) {
        if (idIkan > 0) {
            this.idIkan = idIkan;
        }
    }

    public void setNamaLokasi(String namaLokasi) {
        if (namaLokasi != null && !namaLokasi.equals("")) {
            this.namaLokasi = namaLokasi;
        }
    }

    public void setWilayah(String wilayah) {
        if (wilayah != null && !wilayah.equals("")) {
            this.wilayah = wilayah;
        }
    }

    public void tampilkanDetail() {
        System.out.println("ID Lokasi           : " + idLokasi);
        System.out.println("ID Ikan             : I00" + idIkan);
        System.out.println("Nama Lokasi         : " + namaLokasi);
        System.out.println("Wilayah             : " + wilayah);
    }

    @Override
    public void tampilkanData() {
        tampilkanDetail();
    }
}
