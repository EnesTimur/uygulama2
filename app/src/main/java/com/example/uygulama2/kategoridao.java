package com.example.uygulama2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class kategoridao {

    public ArrayList<kategoriler>tumkategoriler(veritabani vt){
        ArrayList<kategoriler>kategorilerArrayList =new ArrayList<>();

        SQLiteDatabase db=vt.getWritableDatabase();

        Cursor c=db.rawQuery("SELECT *FROM kategoriler",null);
         while (c.moveToNext()){
             kategoriler k=new kategoriler(c.getInt(c.getColumnIndex("kategori_id"))
                     ,c.getString(c.getColumnIndex("kategori_ad")));

             kategorilerArrayList.add(k);

         }
         return  kategorilerArrayList;


    }
}
