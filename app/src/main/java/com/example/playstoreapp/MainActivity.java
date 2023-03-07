package com.example.playstoreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
// 1- Data
    ArrayList<ModelClass>gamesList;
// 2 -  AdapterView
    RecyclerView recyclerView;
//    3 adapter
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        gamesList=new ArrayList<>();
        gamesList.add(new ModelClass("Horizon Chase",R.drawable.card1));
        gamesList.add(new ModelClass("PUBG",R.drawable.card2));
        gamesList.add(new ModelClass("Head Ball",R.drawable.card3));
        gamesList.add(new ModelClass("Hooked on you",R.drawable.card4));
        gamesList.add(new ModelClass("Fifa 2022",R.drawable.card5));
        gamesList.add(new ModelClass("Fortnite",R.drawable.card6));

    adapter=new MyAdapter(this,gamesList);
    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(adapter);



    }
}