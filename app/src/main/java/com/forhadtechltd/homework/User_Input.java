package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class User_Input extends AppCompatActivity {

    EditText ipname, ipphone, ipemail, ippassword, ipconfirmpassword;
    Button signup;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_input_activity);

        ipname = findViewById(R.id.ipname);
        ipphone = findViewById(R.id.ipphone);
        ipemail = findViewById(R.id.ipemail);
        ippassword = findViewById(R.id.ippassword);
        ipconfirmpassword = findViewById(R.id.ipconfirmpassword);
        signup = findViewById(R.id.signup);
        login = findViewById(R.id.login);

        /*==============================================*/






        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }
}