package com.example.ameel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {

              // لما أضع لون للخلفية بيعطيني Error ف قمت بازالتها
            EditText Name = findViewById(R.id.Name);
            EditText Age = findViewById(R.id.Age);
            Button Send = findViewById(R.id.Send);



            Send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (Name.getText().toString().equals("")){}
                    else if (Age.getText().toString().equals("")){}
                    else {
                        Intent intent = new Intent(MainActivity.this, DAta.class);
                        String Saf = Name.getText().toString();
                        int Omar = Integer.parseInt(Age.getText().toString());
                        // لازم اعمل علامة على البضاعة
                        intent.putExtra("Noo1o", Saf);
                        intent.putExtra("Ae1ee", Omar);
                        //لتفعبل الأمر اللي فوق
                        startActivity(intent);
                    }
                     }

            });


        }
    }
}