package com.example.kylemiller.rockpaperscissorswithheather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    RockPaperScissors rockPaperScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerChoice = extras.getString("playerChoice");

    }

    public void setTextView(){
        RockPaperScissors.playgame();

    }


}
