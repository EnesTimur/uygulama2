package com.example.uygulama2;

import java.io.Serializable;

public class yönetmenler implements Serializable {
    private int yönetmen_id;
    private String yönetmen_isim;

    public yönetmenler() {
    }

    public yönetmenler(int yönetmen_id,String yönetmen_isim){

        this.yönetmen_id=yönetmen_id;
        this.yönetmen_isim=yönetmen_isim;
    }

    public int getYönetmen_id() {
        return yönetmen_id;
    }

    public void setYönetmen_id(int yönetmen_id) {
        this.yönetmen_id = yönetmen_id;
    }

    public String getYönetmen_isim() {
        return yönetmen_isim;
    }

    public void setYönetmen_isim(String yönetmen_isim) {
        this.yönetmen_isim = yönetmen_isim;
    }
}
