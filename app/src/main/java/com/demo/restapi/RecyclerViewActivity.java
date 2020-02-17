package com.demo.restapi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //set layoutmanager to recyclerview
        recyclerView.setLayoutManager(layoutManager);
        //set animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //set item decoration
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        ArrayList userDataLists = (ArrayList) getIntent().getSerializableExtra("users");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, userDataLists);
        //set adapter
        recyclerView.setAdapter(adapter);

    }
}