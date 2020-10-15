package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView kategoriRv;
    private ArrayList<kategoriler>kategorilerArrayList;
    private kategotiadapter adapter;
    private veritabani vt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar=findViewById(R.id.toolbar);
        kategoriRv=findViewById(R.id.kategoriRv);
        vt=new veritabani(this);
        veritabanikopytala();;

        toolbar.setTitle("Kategoriler");
        setSupportActionBar(toolbar);
        kategoriRv.setHasFixedSize(true);
        kategoriRv.setLayoutManager(new LinearLayoutManager(this));
      kategorilerArrayList=new kategoridao().tumkategoriler(vt);


        adapter=new kategotiadapter(this,kategorilerArrayList);
        kategoriRv.setAdapter(adapter);


    }
    public  void veritabanikopytala(){
        DatabaseCopyHelper helper=new DatabaseCopyHelper(this);
        try {
            helper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        helper.openDataBase();


    }
}