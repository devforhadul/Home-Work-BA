package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Profit_calculate204 extends AppCompatActivity {

    EditText buyPrice, sellprice;
    Button calculate;
    LinearLayout resultTv;
    TextView tvProfit, tvPerProfit, hisab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profit_calculate204);

        buyPrice = findViewById(R.id.buyPrice);
        sellprice = findViewById(R.id.sellPrice);
        calculate = findViewById(R.id.calculate);
        resultTv = findViewById(R.id.resultTv);
        tvProfit = findViewById(R.id.tvProfit);
        tvPerProfit = findViewById(R.id.tvPerProfit);
        hisab = findViewById(R.id.hisab);//for next activity





        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultTv.setVisibility(View.VISIBLE);
                int buyp = Integer.parseInt(buyPrice.getText().toString());
                int sellp = Integer.parseInt(sellprice.getText().toString());

                int profit = sellp - buyp;
                float persentage = profit/buyp*100;

                String persent = String.format("%.02f", persentage);

                tvProfit.setText(profit+" টাকা");
                tvPerProfit.setText(persent+" %");



                //for auto hide  soft keyboard when finish text

                sellprice.onEditorAction(EditorInfo.IME_ACTION_DONE);


            }
        });


        hisab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myint = new Intent(Profit_calculate204.this, profit_cal_204_1.class);
                startActivity(myint);

            }
        });




    }
}