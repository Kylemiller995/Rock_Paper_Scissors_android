package com.example.kylemiller.rockpaperscissorswithheather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RockPaperScissorsMainPageActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors_main_page);
        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button){
        Intent intent = new Intent(this, ResultActivity.class);
        String playerChoiceRock = "rock";
        intent.putExtra("playerChoice", playerChoiceRock);
        startActivity(intent);
    }
}
