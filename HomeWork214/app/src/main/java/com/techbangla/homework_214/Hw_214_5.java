package com.techbangla.homework_214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hw_214_5 extends AppCompatActivity {

    EditText billUnit;
    Button btn5;
    TextView Display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw_214_5);

        billUnit = findViewById(R.id.billUnit);
        btn5 = findViewById(R.id.btn5);
        Display = findViewById(R.id.Display);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float unit = Float.parseFloat(billUnit.getText().toString());
                float bill = 0;

                if( unit <=50){
                    bill = (float) (unit*0.50);
                } else if (unit <=150) {
                    bill = (float) (25+(unit-50)*0.75);
                } else if (unit <=250) {
                    bill = (float) (25+75+(unit-150)*1.20);
                }else{
                    bill = (float) (25+75+120+(unit-250)*1.50);
                }

                bill = (float) (bill + bill*0.20);
                bill = (float) (bill + bill*0.15);

                Display.setText("Your Total Bill: "+bill+" Taka only\nDemand Charge: "+(bill*0.20)+"\nVat 15%: "+(bill*0.15));





            }
        });






    }
}