package com.example.project11_1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        setTitle("커스텀 리스트 뷰");

        ListView customListView = findViewById(R.id.customListView);
        ListViewAdapter adapter = new ListViewAdapter();
        customListView.setAdapter(adapter);

        //원래 여기에 DB가 들어와야 한다.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cat), "고양이", "고양이입니다.");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.rabbit), "토끼", "토끼다.");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dog), "강아지", "강아지입니다.");

        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //각 항목을 선택할 시 취할 내용 기입
            }
        });

    }

}