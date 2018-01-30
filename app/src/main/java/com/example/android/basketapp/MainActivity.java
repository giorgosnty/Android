package com.example.android.basketapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.basketapp.R.layout.activitymain;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int foulsTeamA = 0;
    int reboundsTeamA = 0;
    int assistsTeamA = 0;
    int turnoversTeamA = 0;
    int blocksTeamA = 0;

    int scoreTeamB = 0;
    int foulsTeamB = 0;
    int reboundsTeamB = 0;
    int assistsTeamB = 0;
    int turnoversTeamB = 0;
    int blocksTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activitymain);

        displayForTeamA(0);
        displayTeamARebounds(0);
        displayTeamAFouls(0);
        displayTeamAAssists(0);
        displayTeamATurnovers(0);

        displayForTeamB(0);
        displayTeamBRebounds(0);
        displayTeamBFouls(0);
        displayTeamBAssists(0);
        displayTeamBTurnovers(0);



    }




    //           TEAM A
    //add 1 point
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    //add 2 points
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //add 3 points
    public void addThreeForTeamA(View v) {
        scoreTeamA= scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //add rebounds
    public void addReboundsTeamA(View v) {
        reboundsTeamA= reboundsTeamA + 1;
        displayTeamARebounds(reboundsTeamA);
    }

    //add assists
    public void addAssistsTeamA(View v) {
        assistsTeamA= assistsTeamA + 1;
        displayTeamAAssists(assistsTeamA);
    }

    //add fouls
    public void addFoulsTeamA(View v) {
       foulsTeamA= foulsTeamA + 1;
        displayTeamAFouls(foulsTeamA);
    }

    //add turnovers
    public void addTurnoversTeamA(View v) {
        turnoversTeamA= turnoversTeamA + 1;
        displayTeamATurnovers(turnoversTeamA);
    }

    public void addBlocksTeamA(View v) {
        blocksTeamA= blocksTeamA + 1;
        displayTeamABlocks(blocksTeamA);
    }




    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamARebounds(int rebs){
        TextView rebounds = (TextView) findViewById(R.id.team_a_rebounds);
        rebounds.setText(String.valueOf(rebs));
    }

    public void displayTeamAFouls(int foul){
        TextView fouls = (TextView) findViewById(R.id.team_a_fouls);
        fouls.setText(String.valueOf(foul));
    }

    public void displayTeamAAssists(int assist){
        TextView assists = (TextView) findViewById(R.id.team_a_assists);
        assists.setText(String.valueOf(assist));
    }

    public void displayTeamATurnovers(int turnover){
        TextView turnovers = (TextView) findViewById(R.id.team_a_turnovers);
       turnovers.setText(String.valueOf(turnover));
    }

    public void displayTeamABlocks(int block){
        TextView blocks = (TextView) findViewById(R.id.team_a_blocks);
        blocks.setText(String.valueOf(block));
    }


    //              TEAM B
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    //add rebounds
    public void addReboundsTeamB(View v) {
        reboundsTeamB= reboundsTeamB + 1;
        displayTeamBRebounds(reboundsTeamB);
    }

    //add assists
    public void addAssistsTeamB(View v) {
        assistsTeamB= assistsTeamB + 1;
        displayTeamBAssists(assistsTeamB);
    }

    //add fouls
    public void addFoulsTeamB(View v) {
        foulsTeamB= foulsTeamB + 1;
        displayTeamBFouls(foulsTeamB);
    }

    //add turnovers
    public void addTurnoversTeamB(View v) {
        turnoversTeamB= turnoversTeamB + 1;
        displayTeamBTurnovers(turnoversTeamB);
    }

    public void addBlocksTeamB(View v) {
        blocksTeamB= blocksTeamB + 1;
        displayTeamBBlocks(blocksTeamB);
    }




    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamBRebounds(int rebs){
        TextView rebounds = (TextView) findViewById(R.id.team_b_rebounds);
        rebounds.setText(String.valueOf(rebs));
    }

    public void displayTeamBFouls(int foul){
        TextView fouls = (TextView) findViewById(R.id.team_b_fouls);
        fouls.setText(String.valueOf(foul));
    }

    public void displayTeamBAssists(int assist){
        TextView assists = (TextView) findViewById(R.id.team_b_assists);
        assists.setText(String.valueOf(assist));
    }

    public void displayTeamBTurnovers(int turnover){
        TextView turnovers = (TextView) findViewById(R.id.team_b_turnovers);
        turnovers.setText(String.valueOf(turnover));
    }

    public void displayTeamBBlocks(int block){
        TextView blocks = (TextView) findViewById(R.id.team_b_blocks);
        blocks.setText(String.valueOf(block));
    }

    public void resetScore (View v){
         scoreTeamA = 0;
         foulsTeamA = 0;
         reboundsTeamA = 0;
         assistsTeamA = 0;
         turnoversTeamA = 0;
         blocksTeamA = 0;

         scoreTeamB = 0;
         foulsTeamB = 0;
         reboundsTeamB = 0;
         assistsTeamB = 0;
         turnoversTeamB = 0;
         blocksTeamB = 0;

        displayForTeamA(0);
        displayTeamATurnovers(0);
        displayTeamAFouls(0);
        displayTeamABlocks(0);
        displayTeamARebounds(0);
        displayTeamAAssists(0);

        displayForTeamB(0);
        displayTeamBAssists(0);
        displayTeamBBlocks(0);
        displayTeamBFouls(0);
        displayTeamBRebounds(0);
        displayTeamBTurnovers(0);

        EditText nameTeamA = (EditText) findViewById(R.id.team_a_name);
        EditText nameTeamB = (EditText) findViewById(R.id.team_b_name);
        nameTeamA.setText("Team A");
        nameTeamB.setText("Team B");
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View view = getCurrentFocus();
        if (view != null && (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) && view instanceof EditText && !view.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            view.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + view.getLeft() - scrcoords[0];
            float y = ev.getRawY() + view.getTop() - scrcoords[1];
            if (x < view.getLeft() || x > view.getRight() || y < view.getTop() || y > view.getBottom())
                ((InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
}