package com.techbangla.homework_214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextToVoice extends AppCompatActivity {
    Button btnconv;
    EditText edTxt;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_to_voice);

        btnconv = findViewById(R.id.btnconv);
        edTxt = findViewById(R.id.edTxt);

        textToSpeech = new TextToSpeech(TextToVoice.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        btnconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( edTxt.getText().toString().length() >0){
                    textToSpeech.speak(""+edTxt.getText().toString(),TextToSpeech.QUEUE_FLUSH, null, null );
                }else{
                    edTxt.setError("Please input Any Text!!");
                }


            }
        });




    }
}