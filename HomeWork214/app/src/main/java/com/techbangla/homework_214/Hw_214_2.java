package com.techbangla.homework_214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hw_214_2 extends AppCompatActivity {

    EditText ipYear;

    Button btn2;
    TextView lipDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw_214_2);


        ipYear = findViewById(R.id.ipYear);
        btn2 = findViewById(R.id.btn2);
        lipDisplay = findViewById(R.id.lipDisplay);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Result = "";

                int Year = Integer.parseInt(ipYear.getText().toString());

                if( Year%400 == 0){
                    Result = "This Year Leap Year";
                } else if ( Year%4 == 0 && Year%100 != 0) {
                    Result = "This Year Leap Year";
                }else{
                    Result = "This Year not Leap Year";
                }

                lipDisplay.setText(Result);
            }
        });
    }
}