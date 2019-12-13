package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button buttonProfile, buttonGalery, buttonJustJava, buttonAbout, buttonMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonProfile = (Button) findViewById(R.id.button_1);
        buttonGalery = (Button) findViewById(R.id.button_2);
        buttonJustJava = (Button) findViewById(R.id.button_3);
        buttonAbout = (Button) findViewById(R.id.button_4);
        buttonMap = (Button) findViewById(R.id.mapsBtn);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iProfile = new Intent("com.example.uts.Profile");
                startActivity(iProfile);
            }
        });

        buttonGalery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGalery = new Intent("com.example.uts.Galery");
                startActivity(iGalery);
            }
        });

        buttonJustJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iJustJava = new Intent("com.example.uts.JustJava");
                startActivity(iJustJava);
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent iTentang2 = new Intent("com.example.uts.About");
                startActivity(iTentang2);
            }
        });

        buttonMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent imap = new Intent("com.example.uts.Map");
                startActivity(imap);
            }
        });

    }
}
