package com.example.project11_1;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


public class DynamicActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        setTitle("커스텀 리스트 뷰");
    }


}