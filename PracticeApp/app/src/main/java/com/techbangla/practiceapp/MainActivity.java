package com.techbangla.practiceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlertDialog;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        webView = findViewById(R.id.webView);

        webView.

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaEnable();
                webView.setVisibility(View.VISIBLE);
                webView.loadUrl("https://www.youtube.com/embed/oA1woszlICs");


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaEnable();
                webView.loadUrl("https://www.youtube.com/embed/i8nwFrJh_us");


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaEnable();

                webView.loadUrl("https://www.youtube.com/embed/4sZ7xDUiajE");


            }
        });




//Finish Activity OnCreate
    }

    private void javaEnable(){
        webView.getSettings().setJavaScriptEnabled(true);
    }


    private void Mtoast(String a) {
        Toast.makeText(MainActivity.this, a, Toast.LENGTH_LONG).show();
    }


    private boolean CheckInternet() {
        ConnectivityManager connectivitymanager = (ConnectivityManager) getSystemService(Service.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connectivitymanager.getActiveNetworkInfo();

        if (netInfo != null && netInfo.isConnected()) {
            return true;
        } else {
            return false;
        }


    }


}