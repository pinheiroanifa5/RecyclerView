package com.example.recyclerview;

import static com.example.recyclerview.R.layout.activity_main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        init();
    }


    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Scuty", "Inativo"));
        elements.add(new ListElement("#607d8b", "Any", "Activo"));
        elements.add(new ListElement("#03a9f4", "Catelene", "Activo"));
        elements.add(new ListElement("#f44336", "Kevin", "Activo"));
        elements.add(new ListElement("#009688", "Victor", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListElement item) {
                moveToDescription(item);


            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter); // Definir o adaptar no RecyclerView
    }

    public void moveToDescription(ListElement item) {
        Intent intent=new Intent(this,DescriptionActivity.class);
        intent.putExtra("ListElement",item);
        startActivity(intent);
    }
}

