package com.example.uygulama2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class filmlerdao {

    public ArrayList<filmler> tumfilmlerbykategorid(veritabani vt,int kategori_id){
        ArrayList<filmler>filmlerArrayList =new ArrayList<>();

        SQLiteDatabase db=vt.getWritableDatabase();

        Cursor c=db.rawQuery("SELECT *FROM kategoriler,filmler,yonetmenler WHERE filmler.kategori_id=kategoriler.kategori_id and filmler.yonetmen_id=yonetmenler.yonetmen_id and filmler.kategori_id="+kategori_id,null);
        while (c.moveToNext()){
            kategoriler k=new kategoriler(c.getInt(c.getColumnIndex("kategori_id"))
                    ,c.getString(c.getColumnIndex("kategori_ad")));
            yönetmenler  y=new yönetmenler(c.getInt(c.getColumnIndex("yonetmen_id"))
                    ,c.getString(c.getColumnIndex("yonetmen_ad")));
            filmler f=new filmler(c.getInt(c.getColumnIndex("film_id")),c.getString(c.getColumnIndex("film_ad")),c.getString(c.getColumnIndex("film_yil")),c.getString( c.getColumnIndex("film_resim")),k,y);


            filmlerArrayList.add(f);

        }
        return  filmlerArrayList;


    }
}
