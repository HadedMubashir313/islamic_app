package com.example.thefirstpillar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class azkar_sharif extends AppCompatActivity {

    Button btn1,btn2, btn3,
    btn4, btn5, btn6,btn7,
    btn8,btn9,btn10,btn11
    ,btn12,btn13,btn14,btn15
    ,btn16, btn17, btn18;

   // ImageButton btn4, btn6, btn7;
    //ImageView imglocked, imgunlocked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_azkar_sharif);

        btn1 = findViewById(R.id.btnTasmyaJat);
        btn18 = findViewById(R.id.btnBarnamaMowaqat);
        btn2 = findViewById(R.id.btnSonatMa);
        btn3 = findViewById(R.id.btnChelaAwal);
        btn4 = findViewById(R.id.btnChelaDowm);
        btn5 = findViewById(R.id.btnChelaSwm);
        btn6 = findViewById(R.id.btnChela4);
        btn7 = findViewById(R.id.btnChela5);
        btn8 = findViewById(R.id.btnChela6);
        btn9 = findViewById(R.id.btnChela7);
        btn10 = findViewById(R.id.btnChela8);
        btn11 = findViewById(R.id.btnChela9);
        btn12 = findViewById(R.id.btnChela10);
        btn13 = findViewById(R.id.btnChela11);
        btn14 = findViewById(R.id.btnChela12_1);
        btn15 = findViewById(R.id.btnChela12_2);
        btn16 = findViewById(R.id.btnChela12_3);
        btn17 = findViewById(R.id.btnChela13);





        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intentSonatMa = new Intent(azkar_sharif.this, sonat_ma.class);
                 startActivity(intentSonatMa);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChelaAwal = new Intent(azkar_sharif.this, chela_awal.class);
                startActivity(intentChelaAwal);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChelaDowm = new Intent (azkar_sharif.this, chela_dowm.class);
                startActivity(intentChelaDowm);
            }
        });




    }
}