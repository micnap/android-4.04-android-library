package com.mickeywilliamson.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = getIntent();
        tvJoke = (TextView) findViewById(R.id.tvJoke);
        tvJoke.setText(intent.getStringExtra("JOKE"));
    }
}
