package com.example.project11_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("리스트 뷰");

        //1. 데이터 생성
        String array[] = {"리스트 동적 추가", "커스텀 리스트 뷰", "이순신", "유관순", "강아지"};

        //2. 리스트 뷰 참조
        ListView listView = findViewById(R.id.listView1);

        //3. ArrayAdapter생성(액티비티명, 리스트 모양, 리스트에 붙일 데이터)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, array);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //4. 리스트에 어댑터를 붙인다
        listView.setAdapter(adapter);

        //5.
    }
}