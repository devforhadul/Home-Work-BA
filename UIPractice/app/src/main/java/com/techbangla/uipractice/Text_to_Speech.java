package com.techbangla.uipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Text_to_Speech extends AppCompatActivity {

    EditText edText;
    LinearLayout listen, language;
    TextToSpeech textTospeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_to_speechh);

        edText =  findViewById(R.id.edText);
        listen = findViewById(R.id.listen);
        language = findViewById(R.id.language);



        textTospeech = new TextToSpeech(Text_to_Speech.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTospeech.speak(edText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);
                edText.setError("Null text!");
            }
        });

        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("Feature Coming soon...");
            }
        });





    }

    public  void toast(String text) {
        Toast.makeText(Text_to_Speech.this, ""+text, Toast.LENGTH_LONG).show();


    }
}

