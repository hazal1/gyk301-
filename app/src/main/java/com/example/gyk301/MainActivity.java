package com.example.gyk301;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FotografVideoCek(View view) {
        Intent i=new Intent(MainActivity.this,FotografVideoActivity.class);
        startActivity(i);
    }

    public void smsGonder(View view) {

        Intent i= new Intent(MainActivity.this,SmsActivity.class);
        startActivity(i);
    }

    public void AramaYap(View view) {
        Intent i= new Intent(MainActivity.this,AramaActivity.class);
        startActivity(i);
    }

    public void Webegit(View view) {
        Intent i= new Intent(MainActivity.this,WebeGitActivity.class);
        startActivity(i);
    }

    public void HaritayaGit(View view) {
        Intent i= new Intent(MainActivity.this,HaritaActivity.class);
        startActivity(i);
    }

    public void sesKayit(View view) {
        Intent i= new Intent(MainActivity.this,SesKayitActivity.class);
        startActivity(i);
    }
}
