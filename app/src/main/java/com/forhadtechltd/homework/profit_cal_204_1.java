package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class profit_cal_204_1 extends AppCompatActivity {

    EditText buyPrice, estipersent;
    Button calculate;
    LinearLayout resultTv;
    TextView profitResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profit_cal204_1);

        buyPrice = findViewById(R.id.buyPrice);
        estipersent = findViewById(R.id.estipersent);
        calculate = findViewById(R.id.calculate);
        resultTv = findViewById(R.id.resultTv);
        profitResult = findViewById(R.id.profitResult);
     /*   tvPerProfit = findViewById(R.id.tvPerProfit);*/

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultTv.setVisibility(View.VISIBLE);
                int buyp = Integer.parseInt(buyPrice.getText().toString());
                int espersent = Integer.parseInt(estipersent.getText().toString());


                int perProfit = (buyp*espersent)/100;

                int total = buyp + perProfit;

                profitResult.setText(total+" টাকা");


                estipersent.onEditorAction(EditorInfo.IME_ACTION_DONE);


            }
        });




    }
}