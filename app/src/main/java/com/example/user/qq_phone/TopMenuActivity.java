package com.example.user.qq_phone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
    }
    public void onClick1(View v){
        Intent i = new Intent(this,oppo.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
    public void onClick2(View v){
        Intent i = new Intent(this,a3.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
    public void onClick3(View v){
        Intent i = new Intent(this,a5.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
    public void onClick4(View v){
        Intent i = new Intent(this,note4.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
    public void onClick5(View v){
        Intent i = new Intent(this,ip5.class);
        startActivity(i); // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickPesan
    }
}
