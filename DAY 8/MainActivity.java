package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lvName;
      int[] image={R.drawable.bjplogo,R.drawable.app,R.drawable.bsp,R.drawable.congresslogo,R.drawable.rjd,R.drawable.tmc};
      String[] name={"Bharatiya Janata Party","Aam Admi Party","Bahujan Samaj Party","Indian National Congress","Rashtriya Janata Dal","All India Trinamool Congress"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvName=findViewById(R.id.lvName);

        Myadpter myadpter=new Myadpter(image,name,MainActivity.this);
        lvName.setAdapter(myadpter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,ListDataActivity.class);
                intent.putExtra("I1",image[position]);
                intent.putExtra("T1",name[position]);
                startActivity(intent);

            }
        });

    }
}
