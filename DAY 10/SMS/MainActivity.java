package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etMobile,etMsg;
Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMobile=findViewById(R.id.etMobile);
        btnSend=findViewById(R.id.btnSend);
        etMsg=findViewById(R.id.etMsg);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = etMobile.getText().toString();
                String msg = etMsg.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(getApplicationContext(),"Massage sent successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
