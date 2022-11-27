package com.dcm.mp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class WinningActivity extends AppCompatActivity {

    String TeamWinning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winning);

        TextView txt_winner = findViewById(R.id.txt_winner);

        Intent intent = getIntent();
        int int_teamOne = intent.getIntExtra(MainActivity.EXTRA_INT1, 0);
        int int_teamTwo = intent.getIntExtra(MainActivity.EXTRA_INT2,0);
        TeamWinning = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        int spread_Score = (Math.max(int_teamOne, int_teamTwo) - Math.min(int_teamOne, int_teamTwo));

        txt_winner.setText(MessageFormat.format("{0} succeeded by: {1}", TeamWinning, spread_Score));
    }
}
