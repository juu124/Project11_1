package com.example.project11_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DynamicActivity extends AppCompatActivity {
    EditText editName;
    Button btnInsert, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        setTitle("동적 뷰");

        editName = findViewById(R.id.editName);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        //1. 데이터 저장
        ArrayList<String> item = new ArrayList<String> ();

        //2. 리스트 뷰 객체 생성
        ListView dynamicListView = findViewById(R.id.dynamicListView);

        //3. 어댑터 생성
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, item);

        //4.리스트에 어댑터를 붙인다.
        dynamicListView.setAdapter(arrayAdapter);
        dynamicListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.add(editName.getText().toString());
                editName.setText("");
                editName.setHint("이름을 입력");
                arrayAdapter.notifyDataSetChanged(); //리스트 뷰를 재구성하는 코드
            }
        });
    }

}