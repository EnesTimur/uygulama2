package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private ImageView imageViewresim;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private filmler film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageViewresim=findViewById(R.id.imageView2resim);
        textView2=findViewById(R.id.textView2filmad);
        textView3=findViewById(R.id.textView3yıl);
        textView4=findViewById(R.id.textView4acıklama);
     film=(filmler) getIntent().getSerializableExtra("nesne");
     textView2.setText(film.getFilm_isim());
     textView3.setText(String.valueOf(film.getFilm_yıl()));
     textView4.setText(film.getYönetmen().getYönetmen_isim());

      imageViewresim.setImageResource(getResources().getIdentifier(film.getFilm_resim(),"drawable",getPackageName()));

    }
}