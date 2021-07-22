package com.example.homework6androidstudio;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvList;
    PicAdapter picAdapter;
    List<PicModel> list;
    Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        List<PicModel> list = new ArrayList<>();
        list.add((new PicModel("hello","friends")));
        picAdapter = new PicAdapter(list);
        rvList.setAdapter(picAdapter);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 100);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && requestCode == RESULT_OK){
            if (data != null) {
                PicModel picModel = new PicModel(data.getStringExtra("title"), data.getStringExtra("description"));
                Toast.makeText(this, " " + data.getStringExtra("title") +
                        data.getStringExtra("description"), Toast.LENGTH_SHORT).show();
                picAdapter.addTask(picModel);
            }
        }
    }
}