package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.login.Modelo.Numero;
import com.example.login.Modelo.NumeroIngles;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class ModuloSuperBoltNumeros extends AppCompatActivity {

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private ViewPager viewPager;
    private AdapterSBNumeros adapter;
    private List<NumeroIngles> numeroInglesList;
    private Integer[] colors = null;
    private ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo_superbolt_numeros);

        numeroInglesList = new ArrayList<>();

        numeroInglesList.add(
                new NumeroIngles(R.drawable.espuno, "Números en Inglés: Uno - One", R.drawable.inglesuno,
                        R.raw.espuno, R.raw.inglesuno
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdos, "Números en Inglés: Dos - Two", R.drawable.inglesdos,
                        R.raw.espdos, R.raw.inglesdos
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.esptres, "Números en Inglés: Tres - Three", R.drawable.inglestres,
                        R.raw.esptres, R.raw.inglestres
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espcuatro, "Números en Inglés: Cuatro - Four", R.drawable.inglescuatro,
                        R.raw.espcuatro, R.raw.inglescuatro
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espcinco, "Números en Inglés: Cinco - Five", R.drawable.inglescinco,
                        R.raw.espcinco, R.raw.inglescinco
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espseis, "Números en Inglés: Seis - Six", R.drawable.inglesseis,
                        R.raw.espseis, R.raw.inglesseis
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espsiete, "Números en Inglés: Siete - Seven", R.drawable.inglessiete,
                        R.raw.espsiete, R.raw.inglessiete
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espocho, "Números en Inglés: Ocho - Eight", R.drawable.inglesocho,
                        R.raw.espocho, R.raw.inglesocho
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espnueve, "Números en Inglés: Nueve - Nine", R.drawable.inglesnueve,
                        R.raw.espnueve, R.raw.inglesnueve
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdiez, "Números en Inglés: Diez - Ten", R.drawable.inglesdiez,
                        R.raw.espdiez, R.raw.inglesdiez
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.esponce, "Números en Inglés: Once - Eleven", R.drawable.inglesonce,
                        R.raw.esponce, R.raw.inglesonce
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdoce, "Números en Inglés: Doce - Twelve", R.drawable.inglesdoce,
                        R.raw.espdoce, R.raw.inglesdoce
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.esptrece, "Números en Inglés: Trece - Thirteen", R.drawable.inglestrece,
                        R.raw.esptrece, R.raw.inglestrece
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espcatorce, "Números en Inglés: Catorce - Fourteen", R.drawable.inglescatorce,
                        R.raw.espcatorce, R.raw.inglescatorce
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espquince, "Números en Inglés: Quince - Fifteen", R.drawable.inglesquince,
                        R.raw.espquince, R.raw.inglesquince
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdieciseis, "Números en Inglés: Dieciséis - Sixteen", R.drawable.inglesdieciseis,
                        R.raw.espdieciseis, R.raw.inglesdieciseis
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdiecisiete, "Números en Inglés: Diecisiete - Seventeen", R.drawable.inglesdiecisiete,
                        R.raw.espdiecisiete, R.raw.inglesdiecisiete
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdieciocho, "Números en Inglés: Dieciocho - Eighteen", R.drawable.inglesdieciocho,
                        R.raw.espdieciocho, R.raw.inglesdieciocho
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espdiecinueve, "Números en Inglés: Diecinueve - Nineteen", R.drawable.inglesdiecinueve,
                        R.raw.espdiecinueve, R.raw.inglesdiecinueve
                ));
        numeroInglesList.add(
                new NumeroIngles(R.drawable.espveinte, "Números en Inglés: Veinte - Twenty", R.drawable.inglesveinte,
                        R.raw.espveinte, R.raw.inglesveinte
                ));


        adapter = new AdapterSBNumeros(numeroInglesList, this);
        viewPager = findViewById(R.id.viewPagerSuperNumeros);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),
                getResources().getColor(R.color.color9),
                getResources().getColor(R.color.color10),
                getResources().getColor(R.color.color11),
                getResources().getColor(R.color.color12),
                getResources().getColor(R.color.color13),
                getResources().getColor(R.color.color14),
                getResources().getColor(R.color.color15),
                getResources().getColor(R.color.color16),
                getResources().getColor(R.color.color17),
                getResources().getColor(R.color.color18),
                getResources().getColor(R.color.color19),
                getResources().getColor(R.color.color20)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() -1) && position < (colors.length -1)){

                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position+1]
                            )
                    );
                }
                else{
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itModuloMaya) {

            startActivity(new Intent(ModuloSuperBoltNumeros.this, ModuloMaya.class));

            return true;
        } else if (id == R.id.itModuloBolt) {

            startActivity(new Intent(ModuloSuperBoltNumeros.this, ModuloBolt.class));

            return true;
        } else if (id == R.id.itModuloSuperBolt) {

            startActivity(new Intent(ModuloSuperBoltNumeros.this, ModuloSuperBolt.class));

            return true;
        } else if (id == R.id.itInicio) {

            startActivity(new Intent(ModuloSuperBoltNumeros.this, Modulos.class));

            return true;
        } else if (id == R.id.itCerrarSesion) {

            mAuth.signOut();
            startActivity(new Intent(ModuloSuperBoltNumeros.this, MainActivity.class));
            finish();

            return true;
        } else if (id == R.id.itMiCuenta) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}