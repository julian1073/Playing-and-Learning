package com.example.login;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.login.Modelo.NumeroIngles;

import java.util.List;

public class AdapterSBNumeros extends PagerAdapter {

    private List<NumeroIngles> numeroInglesList;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterSBNumeros(List<NumeroIngles> numeroInglesList, Context context) {

        this.numeroInglesList = numeroInglesList;
        this.context = context;
    }

    @Override
    public int getCount() {

        return numeroInglesList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_numeros, container, false);

        ImageView imageView, imageView2;
        TextView title;
        Button btnReproducirEsp, btnReproducirIng;
        Button btnStopEsp, btnStopIng;
        final MediaPlayer[] mp = new MediaPlayer[1];
        final MediaPlayer[] mp2 = new MediaPlayer[1];

        btnReproducirEsp = view.findViewById(R.id.btnReproducirEsp);
        btnReproducirIng = view.findViewById(R.id.btnReproducirIng);
        imageView = view.findViewById(R.id.image);
        imageView2 = view.findViewById(R.id.imageDos);
        title = view.findViewById(R.id.title);
        btnStopEsp = view.findViewById(R.id.btnStopEsp);
        btnStopIng = view.findViewById(R.id.btnStopIng);

        imageView.setImageResource(numeroInglesList.get(position).getImage());
        imageView2.setImageResource(numeroInglesList.get(position).getImageDos());
        title.setText(numeroInglesList.get(position).getTitle());
        mp[0] = MediaPlayer.create(context, numeroInglesList.get(position).getAudioEsp());
        mp2[0] = MediaPlayer.create(context, numeroInglesList.get(position).getAudioIng());

        btnReproducirEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mp[0] == null){

                    mp[0] = MediaPlayer.create(context, numeroInglesList.get(position).getAudioEsp());
                    mp[0].start();
                }
                else if (mp[0].isPlaying()){

                    mp[0].pause();
                }
                else{
                    mp[0].start();
                }
            }
        });

        btnStopEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp != null){
                    mp[0].stop();
                    mp[0] = null;
                }
            }
        });

        btnReproducirIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mp2[0] == null){

                    mp2[0] = MediaPlayer.create(context, numeroInglesList.get(position).getAudioIng());
                    mp2[0].start();
                }
                else if (mp2[0].isPlaying()){

                    mp2[0].pause();
                }
                else{
                    mp2[0].start();
                }
            }
        });

        btnStopIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp2 != null){
                    mp2[0].stop();
                    mp2[0] = null;
                }
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
