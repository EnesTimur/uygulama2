package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation updown;
    private ImageView imageView;
    private Button buttonana;
    private TextView textViewana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);imageView=findViewById(R.id.imageView);
        buttonana=findViewById(R.id.buttonana);
        textViewana=findViewById(R.id.textViewbaslık);

        updown= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.yukar);
        imageView.setAnimation(updown);
buttonana.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
});

    }
}