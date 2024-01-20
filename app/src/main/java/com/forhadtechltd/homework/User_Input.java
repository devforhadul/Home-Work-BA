package com.forhadtechltd.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class User_Input extends AppCompatActivity {

    public static EditText ipname, ipphone, ipemail, ippassword, ipconfirmpassword;
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









        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ( ipname.getText().toString().isEmpty() ){
                    ipname.setError("Invalid input");
                    if (ipphone.getText().toString().isEmpty() | ipphone.getText().toString().length() >11 | ipphone.getText().toString().length() <10 ){
                        ipphone.setError("Invalid input");
                    }if (ipemail.getText().toString().isEmpty() | ipemail.getText().toString().matches("@") ){
                        ipemail.setError("Invalid input");
                    }if (ippassword.getText().toString().isEmpty() | ippassword.getText().toString().length() <6){
                        ippassword.setError("Invalid input");
                    }if (ipconfirmpassword.getText().toString().isEmpty() | ipconfirmpassword.getText().toString().length() <6){
                        ipconfirmpassword.setError("Invalid input");
                    }

                    return;
                }



   /*             if(TextUtils.isEmpty(name)) {
                    ipname.setError("Your message");
                    return;
                }*/


                Intent myint = new Intent(User_Input.this, Tv_Show.class);
                startActivity(myint);

            }
        });





        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(User_Input.this);
                dialog.setContentView(R.layout.user_ip_resultdialog);
                dialog.show();


            }
        });




    }



}