package com.cursoandroid.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateQuote(View view) {
        int n = new Random().nextInt(4);
        String[] texts = {
                "Frase1",
                "Frase2",
                "Frase3",
                "Frase4"
        };
        TextView text = findViewById(R.id.textView);
        text.setText(texts[n]);
    }
}