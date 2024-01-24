package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tv_Show extends AppCompatActivity {

    public static TextView nameshow, phoneshow, emailshow, passshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show);

        nameshow = findViewById(R.id.nameshow);
        phoneshow = findViewById(R.id.phoneshow);
        emailshow = findViewById(R.id.emailshow);
        passshow = findViewById(R.id.passshow);


        nameshow.setText(User_Input.ipname.getText().toString());
        phoneshow.setText(User_Input.ipphone.getText().toString());
        emailshow.setText(User_Input.ipemail.getText().toString());
        passshow.setText(User_Input.ippassword.getText().toString());








    }
}