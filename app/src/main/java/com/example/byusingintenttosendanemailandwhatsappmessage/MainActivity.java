package com.example.byusingintenttosendanemailandwhatsappmessage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_email;
    Button btn_whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_email = findViewById(R.id.btn_email);
        btn_whatsapp = findViewById(R.id.btn_whatsapp);

        btn_email.setOnClickListener(v -> startActivity(new Intent(this, EmailActivity.class)));

        btn_whatsapp.setOnClickListener(v -> startActivity(new Intent(this, WhatsAppActivity.class)));
    }
}