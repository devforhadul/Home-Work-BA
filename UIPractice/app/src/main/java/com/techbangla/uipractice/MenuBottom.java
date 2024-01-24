package com.techbangla.uipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MenuBottom extends AppCompatActivity {

    LinearLayout btn1,btn2, inflateView;
    LayoutInflater layinflate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_bottom);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        inflateView = findViewById(R.id.inflateView);
        layinflate = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layinflate.inflate(R.layout.activity_main, inflateView );


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layinflate.inflate(R.layout.feni_home, inflateView);

            }
        });




    }
}