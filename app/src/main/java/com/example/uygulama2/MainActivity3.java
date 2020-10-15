package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private Toolbar toolbar2;
    private RecyclerView filmlerrv;
    private ArrayList<filmler>filmlerArrayList;
    private filmleradapter adapter;
    private kategoriler kategori;
private veritabani vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        toolbar2=findViewById(R.id.toolbar2);
        filmlerrv=findViewById(R.id.filmerRV);
        vt=new veritabani(this);
        kategori=(kategoriler) getIntent().getSerializableExtra("kategori_nesne");

        filmlerArrayList =new filmlerdao().tumfilmlerbykategorid(vt,kategori.getKategori_id());
        toolbar2.setTitle(kategori.getKategori_isim());
        setSupportActionBar(toolbar2);

        filmlerrv.setHasFixedSize(true);
        filmlerrv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));





        adapter=new filmleradapter(this,filmlerArrayList);
        filmlerrv.setAdapter(adapter);




    }
}