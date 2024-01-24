package com.techbangla.homework_214;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Hw_214_1 extends AppCompatActivity {
    EditText ipNum;
    TextView opNum;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw_214_1);

        ipNum = findViewById(R.id.ipNum);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numba = Integer.parseInt(ipNum.getText().toString());

                if(numba%5 == 0 && numba%11 == 0){
                    Toast.makeText(Hw_214_1.this,"This number divided by 5 or 11: "+numba,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Hw_214_1.this,"This number not  divided by 5 or 11: "+numba,Toast.LENGTH_SHORT).show();
                }


            }
        });





    }
}