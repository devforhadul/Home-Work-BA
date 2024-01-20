package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView hw203, hw204;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hw203 = findViewById(R.id.hw203);
        hw204 = findViewById(R.id.hw204);

        /*=======================================*/





        intent(); // for go new activity



    }

    private void intent(){

        hw203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myint =  new Intent(MainActivity.this, User_Input.class);
                startActivity(myint);

            }
        });

        hw204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myint =  new Intent(MainActivity.this, Profit_calculate204.class);
                startActivity(myint);

            }
        });


    }


}