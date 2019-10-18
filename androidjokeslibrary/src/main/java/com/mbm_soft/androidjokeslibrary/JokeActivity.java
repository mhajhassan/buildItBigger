package com.mbm_soft.androidjokeslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeTextView = findViewById(R.id.joke_text);
        String jokeText = getIntent().getStringExtra("JOKE_ID");
        if (jokeText != null) {
            jokeTextView.setText(jokeText);
        } else {
            jokeTextView.setText(R.string.joke_error);
        }

    }
}
