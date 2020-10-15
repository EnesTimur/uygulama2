package com.example.uygulama2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class veritabani  extends SQLiteOpenHelper {

    public veritabani(Context context) {
        super(context, "filmler.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS \"kategoriler\" (\n" +
                "\t\"kategori_id\"\tINTEGER,\n" +
                "\t\"kategori_ad\"\tTEXT,\n" +
                "\tPRIMARY KEY(\"kategori_id\" AUTOINCREMENT)\n" +
                ");");
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS \"yonetmenler\" (\n" +
                "\t\"yonetmen_id\"\tINTEGER,\n" +
                "\t\"yonetmen_ad\"\tTEXT,\n" +
                "\tPRIMARY KEY(\"yonetmen_id\" AUTOINCREMENT)\n" +
                ");");
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS \"filmler\" (\n" +
                "\t\"film_id\"\tINTEGER,\n" +
                "\t\"film_ad\"\tTEXT,\n" +
                "\t\"film_yil\"\tTEXT,\n" +
                "\t\"film_resim\"\tTEXT,\n" +
                "\t\"kategori_id\"\tINTEGER,\n" +
                "\t\"yonetmen_id\"\tINTEGER,\n" +
                "\tFOREIGN KEY(\"kategori_id\") REFERENCES \"kategoriler\"(\"kategori_id\"),\n" +
                "\tFOREIGN KEY(\"yonetmen_id\") REFERENCES \"yonetmenler\"(\"yonetmen_id\"),\n" +
                "\tPRIMARY KEY(\"film_id\" AUTOINCREMENT)\n" +
                ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS kategoriler");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS yönetmenler");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS filmler");
        onCreate(sqLiteDatabase) ;


    }
}
