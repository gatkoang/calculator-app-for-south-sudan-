package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class intentActivity2 extends AppCompatActivity {
    Button btn_sms, btn_share, btn_email, btn_camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        btn_sms= findViewById(R.id.btn_sms);
        btn_share= findViewById(R.id.btn_share);
        btn_email= findViewById(R.id.btn_email);
        btn_camera = findViewById(R.id.btn_camera);


        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:+211929430143");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "please send my money before i call police");
                startActivity(intent);
            }
        });

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey, come here!");
                startActivity(shareIntent);

            }
        });

        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","gatkoang_ruot@yahoo.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "please send my money or i will call police");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "in regard to our agreement, please respect our deal");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

            }
        });

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(takePictureIntent, 1);
            }
        });
    }
}