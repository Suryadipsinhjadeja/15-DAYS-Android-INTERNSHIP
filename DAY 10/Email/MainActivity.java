package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText etTO,etSubject,etMessage;
 Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTO = (EditText) findViewById(R.id.editText1_Email1);
        etSubject = (EditText) findViewById(R.id.editText2_subject);
        etMessage = (EditText) findViewById(R.id.editText3_message);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = etTO.getText().toString();
                String subject = etSubject.getText().toString();
                String mesaage = etMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,mesaage);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Send email :"));
            }
        });

    }
}
