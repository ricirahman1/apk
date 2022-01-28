package com.example.apphealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DagingActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SearchView searchView;

    String s1[], s2[];
    int images[] = {R.drawable.dagayam,R.drawable.dagsapi,R.drawable.dagkambing,R.drawable.dagdomba};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daging);

        searchView = findViewById(R.id.search_view);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Daging);
        s2 = getResources().getStringArray(R.array.deskripsi);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

        MyAdapter myAdapter = new MyAdapter( this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void filter(String newText) {

    }
}