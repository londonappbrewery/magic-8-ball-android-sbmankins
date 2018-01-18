package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView BALL_DISPLAY = findViewById(R.id.image_eightBall);
        final int [] BALL_ARRAY = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,R.drawable.ball4, R.drawable.ball5 };
        Button askButton;
        askButton = findViewById(R.id.ask_button);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("eightBall", "The button has been pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                Log.d("eightBall", "The number is: " + number);
                BALL_DISPLAY.setImageResource(BALL_ARRAY[number]);


            }
        });
    }
}
