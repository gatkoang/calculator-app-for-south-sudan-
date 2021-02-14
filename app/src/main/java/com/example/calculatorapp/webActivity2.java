package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webActivity2 extends AppCompatActivity {
WebView btn_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        btn_search = findViewById(R.id.btn_search);
        WebSettings settings = btn_search.getSettings();
        settings.setJavaScriptEnabled(true);
        btn_search.loadUrl("https://www.google.com/doodles");

    }
}