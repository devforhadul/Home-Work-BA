package com.techbangla.homework_214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Zakat_Calculator extends AppCompatActivity {

    EditText property, money;
    Button calBtn;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zakat_calculator);

        property = findViewById(R.id.property);
        money = findViewById(R.id.money);
        calBtn = findViewById(R.id.calBtn);
        display = findViewById(R.id.display);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float propty = Float.parseFloat(property.getText().toString());
                float mony = Float.parseFloat(money.getText().toString());

                if( mony >= 100000 && propty >= 100000){
                    float zakat1 = (float) (mony*0.025);
                    float zakat = (float) (mony*0.025);
                    int tzakat = (int) (zakat1+zakat);
                    display.setText("আপনার জাকাত এর পরিমাণ: "+tzakat+" টাকা");
                }else {
                    display.setText("১ লক্ষ টাকার নিচে জাকাত লাগে না!!!");
                }




            }
        });

    }
}