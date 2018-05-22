package com.techgirl.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private static boolean mPlayBot=false;

    public GameMode mGameMode;
    public static boolean ismPlayBot() {
        return mPlayBot;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button playBotButton = (Button) findViewById(R.id.play_bot_button);
        Button playFriendButton = (Button) findViewById(R.id.play_friend_button);
        playBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayBot=true;
                selectCharacter(v);
            }
        });
        playFriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayBot=false;
                selectCharacter(v);
            }
        });
    }
    public void selectCharacter(View view){
        Intent intent= new Intent(this, PlayerSelectionActivity.class);
        startActivity(intent);
    }
}
