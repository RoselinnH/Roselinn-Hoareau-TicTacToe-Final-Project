package com.techgirl.tictactoe;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {
    private GameMode mGame;
    private ImageButton[][] mImageButtons = new ImageButton[3][3];
    private Boolean mPlayer1Turn = true;
    private int mRoudCount;
    private Toast mToast;
    private String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mGame = new GameMode(PlayerSelectionActivity.getPlayer1(), PlayerSelectionActivity.getPlayer2());
        writePlayersName(mGame.getPlayer1().getPlayerName(), mGame.getPlayer2().getPlayerName());
        mRoudCount = 1;
        customToast("START");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                String buttonID = ("button_" + x + y);
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                mImageButtons[x][y] = findViewById(resID);
                mImageButtons[x][y].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((ImageButton) v).getDrawable() != null) {
                            return;
                        }
                        if (mGame.isPlayer1Turn()) {
                            ((ImageButton)v).setImageResource(resId(1));
                            mGame.setSpot(getResources().getResourceEntryName(((ImageButton)v).getId()),1);
                        } else {
                            ((ImageButton) v).setImageResource(resId(2));
                            mGame.setSpot(getResources().getResourceEntryName(((ImageButton)v).getId()),2);
                        }
                        mRoudCount++;
                        if(mGame.CheckWin()){
                            if (mGame.isPlayer1Turn()){
                                customToast(mGame.player1Wins());
                                deactivateImageButtons();
                                addPoint(true);
                            }
                            else {
                                customToast(mGame.player2Wins());
                                deactivateImageButtons();
                                addPoint(false);
                            }
                        }
                        else if(mRoudCount==10){
                            customToast(mGame.draw());
                            deactivateImageButtons();
                        }
                        else {mGame.setPlayer1Turn();}
                    }
                });
            }
        }
        Button buttonRematch = findViewById(R.id.button_rematch);
        buttonRematch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rematch();
            }
        });
    }

    private void writePlayersName(String player1Name, String player2Name) {
        TextView player1TextView = (TextView) findViewById(R.id.player_1);
        player1TextView.setText("Player 1: " + player1Name);
        TextView player2TextView = (TextView) findViewById(R.id.player_2);
        player2TextView.setText("Player2: " + player2Name);
    }

    private void customToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        TextView tv = (TextView) layout.findViewById(R.id.txtvw);
        tv.setText(message);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    public void deactivateImageButtons(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++)
            {
                mImageButtons[x][y].setClickable(false);
            }
        }
    }
    public void rematch(){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++)
            {
                mImageButtons[x][y].setClickable(true);
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++)
            {
                mImageButtons[x][y].setImageDrawable(null);
                mGame.resetSpot();
            }
        }
        mRoudCount=1;
    }

    public int resId(int i){
        int resID;
        if (i==1){
            resID = getResources().getIdentifier(mGame.getPlayer1().getCharacter(), "drawable",  getPackageName());
        }else{
            resID = getResources().getIdentifier(mGame.getPlayer2().getCharacter(), "drawable", getPackageName());
        }
        return resID;
    }

    public void addPoint(boolean player1){
        TextView player1Points= (TextView) findViewById(R.id.player1_points);
        TextView player2Points= (TextView) findViewById(R.id.player2_points);
        String wins;
        if (player1){
            mGame.getPlayer1().addWins();
            wins= getString(R.string.wins)+mGame.getPlayer1().getWins();
            player1Points.setText(wins);
        }
        else {
            mGame.getPlayer2().addWins();
            wins= getString(R.string.wins)+mGame.getPlayer2().getWins();
            player1Points.setText(wins);
        }
    }
}
