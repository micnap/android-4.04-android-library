package com.mickeywilliamson.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mickeywilliamson.jokedisplay.JokeDisplayActivity;
import com.mickeywilliamson.jokesource.JokeSource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayJoke(View view) {
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        JokeSource joke = new JokeSource();
        intent.putExtra("JOKE", joke.getJoke());
        startActivity(intent);

    }
}
