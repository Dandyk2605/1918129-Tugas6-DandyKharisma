package com.example.tugas4dandy;

public class Mahasiswa {
    private String nama,nim,angkatan;
    private int photo;

    public Mahasiswa(String nama, String nim, String angkatan, int photo){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.photo=photo;
    }

    public int getPhoto(){
        return photo;
    }
    public void setPhoto(int photo){
        this.photo=photo;
    }
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getAngkatan(){
        return angkatan;
    }

    public void setAngkatan(String angkatan){
        this.angkatan = angkatan;
    }
}

