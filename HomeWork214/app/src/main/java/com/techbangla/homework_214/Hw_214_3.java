package com.techbangla.homework_214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hw_214_3 extends AppCompatActivity {

    EditText week;
    Button btn2;
    TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw_214_3);

        week =  findViewById(R.id.week);
        btn2 = findViewById(R.id.btn2);
        Display = findViewById(R.id.Display);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wkNo = Integer.parseInt(week.getText().toString());
                String wkName = "";

                if( wkNo == 1){
                    wkName = "Saturday";
                } else if ( wkNo == 2) {
                    wkName = "Sunday";
                } else if ( wkNo == 3) {
                    wkName = "Monday";
                } else if ( wkNo == 4) {
                    wkName = "Tusday";
                } else if ( wkNo == 5) {
                    wkName = "Wednesday";
                } else if ( wkNo == 6) {
                    wkName = "Thursday";
                } else if ( wkNo == 7) {
                    wkName = "Friday";
                }

                Display.setText(wkName);

            }
        });


    }
}