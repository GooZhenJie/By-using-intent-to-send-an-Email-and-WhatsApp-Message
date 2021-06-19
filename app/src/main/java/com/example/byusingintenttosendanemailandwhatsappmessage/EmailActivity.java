package com.example.byusingintenttosendanemailandwhatsappmessage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {

    String to;
    String[] recipient_email_address;
    EditText et_to;
    EditText et_sub;
    EditText et_msg;
    Button btn_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        to = "To: abc@gmail.com";
        recipient_email_address = new String[]{"abc@gmail.com"};
        et_to = findViewById(R.id.et_to);
        et_sub = findViewById(R.id.et_sub);
        et_msg = findViewById(R.id.et_msg);
        btn_email = findViewById(R.id.btn_email);

        et_to.setText(to);

        btn_email.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.putExtra(Intent.EXTRA_EMAIL, recipient_email_address);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, et_sub.getText().toString());
            emailIntent.putExtra(Intent.EXTRA_TEXT, et_msg.getText());
            emailIntent.setType("message/rfc822");
            startActivity(Intent.createChooser(emailIntent, "Choose Mail App"));
        });
    }
}