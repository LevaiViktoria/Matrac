package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev = findViewById(R.id.nev);
        EditText irsz = findViewById(R.id.irsz);
        EditText telepules = findViewById(R.id.telepules);
        EditText szam = findViewById(R.id.szam);
        Button megrendeles = findViewById(R.id.megrendeles);

        megrendeles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FeldolgozoActivity.class);
                i.putExtra("nev",nev.getText().toString());
                i.putExtra("irsz",irsz.getText().toString());
                i.putExtra("telepules",telepules.getText().toString());
                i.putExtra("szam",szam.getText().toString());

                startActivity(i);
            }

        });
    }
}