package com.example.android.cricketscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runs = 0;
    int wickets = 0;
    int overs = 0;
    int balls = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayRuns() {
        TextView runsTextView = (TextView) findViewById(R.id.runs_text_view);
        String runsStr = ""+runs;
        runsTextView.setText(runsStr);
    }
    public void displayWickets() {
        TextView wicketsTextView = (TextView) findViewById(R.id.wickets_text_view);
        String wicketsStr = ""+wickets;
        wicketsTextView.setText(wicketsStr);
    }
    private void displayOvers() {
        TextView oversTextView = (TextView) findViewById(R.id.overs_text_view);
        String oversStr = overs+"."+balls;
        oversTextView.setText(oversStr);
    }
    public void addOneRun(View view) {
        runs = runs+1;
        displayRuns();
    }
    public void addTwoRuns(View view) {
        runs = runs+2;
        displayRuns();
    }
    public void addThreeRuns(View view) {
        runs = runs+3;
        displayRuns();
    }
    public void addFourRuns(View view) {
        runs = runs+4;
        displayRuns();
    }
    public void addSixRuns(View view) {
        runs = runs+6;
        displayRuns();
    }
    public void addWicket(View view) {
        if(wickets!=10) {
            wickets = wickets+1;
            displayWickets();
        }
    }
    public void addBall(View view) {
        balls = balls+1;
        if(balls%6 == 0 ){
            overs = overs+1;
            displayOvers();
            balls=0;
        }
        displayOvers();
    }
    public void addNoball(View view) {
        runs = runs+1;
        displayRuns();
    }
    public void addWide(View view) {
        runs = runs+1;
        displayRuns();
    }
}
