package com.example.ameel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DAta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView YourName = findViewById(R.id.Saif);
        TextView YourEGe = findViewById(R.id.A16);


        Bundle bundle = getIntent().getExtras();

        //The NaMe
        String name = bundle.getString("Noo1o");
        YourName.setText(name);
        int Age = bundle.getInt("Ae1ee");
        YourEGe.setText(String.valueOf(Age));








    }
}