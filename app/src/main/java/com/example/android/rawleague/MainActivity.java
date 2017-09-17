package com.example.android.rawleague;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {
    int scoreEnyimba = 0;
    int scoreRangers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForEnyimba(View v) {
        scoreEnyimba = scoreEnyimba + 1;
        displayForTeamA(scoreEnyimba);
    }

    /**
     * Decrease the score for Team A by 1 points.
     */
    public void addOneFoulForEnyimba(View v) {
        scoreEnyimba = scoreEnyimba + 3;
        displayForTeamA(scoreEnyimba);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForRangers(View v) {
        scoreRangers = scoreRangers + 1;
        displayForTeamB(scoreRangers);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addOneFoulForRangers(View v) {
        scoreRangers = scoreRangers + 2;
        displayForTeamB(scoreRangers);
    }c

    /**
     * Reset the score for Team A and B to 0 point.
     */
    public void resetScore(View v) {
        scoreEnyimba = 0;
        scoreRangers = 0;
        displayForTeamA(scoreEnyimba);
        displayForTeamB(scoreRangers);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_enyimba);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_rangers);
        scoreView.setText(String.valueOf(score));
    }
}
