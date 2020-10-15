package com.example.uygulama2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class filmleradapter extends RecyclerView.Adapter<filmleradapter.Cardtasarımtutucu>{
    private Context mcontext;
    private List<filmler> filmlerArrayListe;


    public filmleradapter(Context mcontext, List<filmler>filmlerArrayListe){
        this.mcontext=mcontext;
        this.filmlerArrayListe=filmlerArrayListe;

    }

    @NonNull
    @Override
    public Cardtasarımtutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.filmcartasarim,parent,false);
        return new Cardtasarımtutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cardtasarımtutucu holder, int position) {
        final filmler film=filmlerArrayListe.get(position);
        holder.textViewfilm.setText(film.getFilm_isim());
        holder.imageViewfilmresim.setImageResource(mcontext.getResources().getIdentifier(film.getFilm_resim(),"drawable",mcontext.getPackageName()));




        holder.filmcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mcontext,MainActivity4.class);
                intent.putExtra("nesne",film);
                mcontext.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return filmlerArrayListe.size();
    }

    public class Cardtasarımtutucu extends RecyclerView.ViewHolder{
        private TextView textViewfilm;
        private CardView filmcard;
        private ImageView imageViewfilmresim;

        public Cardtasarımtutucu(@NonNull View itemView) {
            super(itemView);
            filmcard=itemView.findViewById(R.id.filmcard);
            textViewfilm=itemView.findViewById(R.id.textViewfilmad);
            imageViewfilmresim=itemView.findViewById(R.id.imageViewfilmresim);

        }
    }




}
