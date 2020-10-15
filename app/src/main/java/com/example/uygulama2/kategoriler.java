package com.example.uygulama2;

import java.io.Serializable;

public class kategoriler implements Serializable {
    private int kategori_id;
    private String kategori_isim;

    public kategoriler() {
    }
    public kategoriler(int kategori_id,String kategori_isim){
        this.kategori_id=kategori_id;
        this.kategori_isim=kategori_isim;


    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKategori_isim() {
        return kategori_isim;
    }

    public void setKategori_isim(String kategori_isim) {
        this.kategori_isim = kategori_isim;
    }
}
