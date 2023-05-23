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

        // To display the Recycler view linearly

        recy.setLayoutManager(

                new LinearLayoutManager(this));

        FirebaseRecyclerOptions<CodeModel> options

                = new FirebaseRecyclerOptions.Builder<CodeModel>()

                .setQuery(connect,CodeModel.class).build();

        // Connecting object of required Adapter class to

        // the Adapter class itself

        cadtr = new CodeAdapter(options);

        // Connecting Adapter class with the Recycler view*/

        recy.setAdapter(cadtr);
    }

    @Override protected void onStart()

    {

        super.onStart();

        cadtr.startListening();

    }



    // Function to tell the app to stop getting

    // data from database on stopping of the activity

    @Override protected void onStop()

    {

        super.onStop();

        cadtr.stopListening();

    }
}