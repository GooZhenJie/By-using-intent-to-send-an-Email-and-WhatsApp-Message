package com.example.byusingintenttosendanemailandwhatsappmessage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WhatsAppActivity extends AppCompatActivity {

    String to;
    Button btn_whatsapp;
    EditText et_to;
    EditText et_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        to = "Mr. Goo";
        btn_whatsapp = findViewById(R.id.btn_whatsapp);
        et_to = findViewById(R.id.et_to);
        et_msg = findViewById(R.id.et_msg);

        et_to.setText(to);

        btn_whatsapp.setOnClickListener(v -> {
            String contact = "+6010-9438983";
            String url = "https://api.whatsapp.com/send?phone=" + contact;
            Intent reserveIntent = new Intent(Intent.ACTION_VIEW);
            String text = et_msg.getText().toString();
            reserveIntent.setData(Uri.parse(url + "&text=" + text));
            startActivity(reserveIntent);
        });
    }
}