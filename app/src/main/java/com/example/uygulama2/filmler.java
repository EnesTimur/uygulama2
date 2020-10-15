package com.example.uygulama2;

import java.io.Serializable;

public class filmler  implements Serializable {
    private  int film_id;
    private  String film_isim;
    private String film_yıl;
    private String film_resim;
    private kategoriler kategori;
    private yönetmenler yönetmen;

    public filmler() {
    }

    public filmler(int film_id,String film_isim,String film_yıl,String film_resim,kategoriler kategori,yönetmenler yönetmen){
        this.film_id=film_id;
        this.film_isim=film_isim;
        this.film_yıl=film_yıl;
        this.film_resim=film_resim;
        this.kategori=kategori;
        this.yönetmen=yönetmen;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_isim() {
        return film_isim;
    }

    public void setFilm_isim(String film_isim) {
        this.film_isim = film_isim;
    }

    public String getFilm_resim() {
        return film_resim;
    }

    public void setFilm_resim(String film_resim) {
        this.film_resim = film_resim;
    }

    public String getFilm_yıl() {
        return film_yıl;
    }

    public void setFilm_yıl(String film_yıl) {
        this.film_yıl = film_yıl;
    }

    public kategoriler getKategori() {
        return kategori;
    }

    public void setKategori(kategoriler kategori) {
        this.kategori = kategori;
    }

    public yönetmenler getYönetmen() {
        return yönetmen;
    }

    public void setYönetmen(yönetmenler yönetmen) {
        this.yönetmen = yönetmen;
    }
}
