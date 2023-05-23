package com.frbandro.codestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    DatabaseReference connect;
    RecyclerView recy;
    CodeAdapter cadtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect=FirebaseDatabase.getInstance().getReference();

        recy = findViewById(R.id.code_holder);
        recy.setLayoutManager(new LinearLayoutManager(this));



        FirebaseRecyclerOptions<CodeModel> products =
                new FirebaseRecyclerOptions.Builder<CodeModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("codestore"), CodeModel.class)
                        .build();


        cadtr = new CodeAdapter(products);
        recy.setAdapter(cadtr);
        cadtr.startListening();


    }
}