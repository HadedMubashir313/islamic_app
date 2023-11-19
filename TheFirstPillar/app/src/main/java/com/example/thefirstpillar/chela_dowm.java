package com.example.thefirstpillar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class chela_dowm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chela_dowm);

        PDFView pdfView3 = findViewById(R.id.chela_dowmm);
        pdfView3.fromAsset("رهنمای ادای چله اول.pdf").load();
    }
}