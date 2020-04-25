package com.sleepycoder.picassoimageloadingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this,3));

        RVAdapter adapter = new RVAdapter(this);

        rv.setAdapter(adapter);


    }
}
