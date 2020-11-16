package com.example.login;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.login.Modelo.Numero;

import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Numero> numeroList;
    private LayoutInflater layoutInflater;
    private Context context;


    public Adapter(List<Numero> numeroList, Context context) {
        this.numeroList = numeroList;
        this.context = context;
    }

    @Override
    public int getCount() {

        return numeroList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);

        ImageView imageView, imageView2;
        TextView title, desc;
        Button btnReproducir;
        Button btnStop;
        final MediaPlayer[] mp = new MediaPlayer[1];

        btnReproducir = view.findViewById(R.id.btnReproducir);
        imageView = view.findViewById(R.id.image);
        imageView2 = view.findViewById(R.id.imageDos);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);
        btnStop = view.findViewById(R.id.btnStop);

        imageView.setImageResource(numeroList.get(position).getImage());
        imageView2.setImageResource(numeroList.get(position).getImageDos());
        title.setText(numeroList.get(position).getTitle());
        desc.setText(numeroList.get(position).getDesc());
        mp[0] = MediaPlayer.create(context, numeroList.get(position).getAudio());

        btnReproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mp[0] == null){

                    mp[0] = MediaPlayer.create(context, numeroList.get(position).getAudio());
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

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp != null){
                    mp[0].stop();
                    mp[0] = null;
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
