package com.example.uygulama2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class kategotiadapter extends RecyclerView.Adapter<kategotiadapter.Cardtasarımtutucu>{
    private Context mcontext;
    private ArrayList<kategoriler>kategorilerArrayListe;


    public kategotiadapter(Context mcontext,ArrayList kategorilerArrayListe){
        this.mcontext=mcontext;
        this.kategorilerArrayListe=kategorilerArrayListe;

    }

    @NonNull
    @Override
    public Cardtasarımtutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.kategoricardtasarim,parent,false);
        return new Cardtasarımtutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cardtasarımtutucu holder, int position) {
        final kategoriler kategori=kategorilerArrayListe.get(position);
        holder.textViewcard.setText(kategori.getKategori_isim());
        holder.kategoricard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mcontext,MainActivity3.class);

                intent.putExtra("kategori_nesne",kategori);
                mcontext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return kategorilerArrayListe.size();
    }

    public class Cardtasarımtutucu extends RecyclerView.ViewHolder{
        private TextView textViewcard;
        private CardView kategoricard;

        public Cardtasarımtutucu(@NonNull View itemView) {
            super(itemView);
                kategoricard=itemView.findViewById(R.id.kategoricard);
                textViewcard=itemView.findViewById(R.id.textViewcard);

        }
    }




}
