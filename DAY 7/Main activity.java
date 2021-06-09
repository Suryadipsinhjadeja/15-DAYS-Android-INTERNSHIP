package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
GridView lv1;

String name[]={"Bharatiya Janata Party","Indian National Congress","Aam Aadmi Party","Shiv Sena","All India Trinamool Congress","Janata Dal","Rashtriya Janata Dal","National Democratic Alliance","United Progressive Alliance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv1);


        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,name);


        lv1.setAdapter(arrayAdapter);
    }
}
