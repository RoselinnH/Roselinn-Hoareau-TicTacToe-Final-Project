package com.techgirl.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerSelectionActivity extends AppCompatActivity {



    private static Player mPlayer1;
    private static Player mPlayer2;
    private RadioButton mSelectedRadioButton;
    private  RadioButton mBullbasaurRadioBtn;
    private  RadioButton mCharmanderRadioBtn;
    private  RadioButton mCaterpieRadioBtn;
    private  RadioButton mJigglypuffRadioBtn;
    private  RadioButton mPikachuRadioBtn;
    private  RadioButton mSnorlaxRadioBtn;
    private  RadioButton mPidgeyRadioBtn;
    private  RadioButton mPsychduckRadioBtn;
    private  RadioButton mZubateRadioBtn;
    private RadioGroup mRadioGroup;
     public GameMode mGameMode;

     private int mNumbOfPlayers;
    private Button mNextButton;
    private TextView mPlayer;

    private EditText mName;

    public void setCharacter(String character) {
        mCharacter = character.substring(5);
    }

    private String mCharacter;
    private static int count=0;
    public void addListenerButton(){
        mBullbasaurRadioBtn =(RadioButton) findViewById(R.id.rbtn_bullbasaur);
        mCharmanderRadioBtn =(RadioButton) findViewById(R.id.rbtn_charmander);
        mCaterpieRadioBtn =(RadioButton) findViewById(R.id.rbtn_caterpie);
        mJigglypuffRadioBtn =(RadioButton) findViewById(R.id.rbtn_jigglypuff);
        mPikachuRadioBtn =(RadioButton) findViewById(R.id.rbtn_pikachu);
        mSnorlaxRadioBtn =(RadioButton) findViewById(R.id.rbtn_snorlax);
        mPidgeyRadioBtn =(RadioButton) findViewById(R.id.rbtn_pidgey);
        mPsychduckRadioBtn =(RadioButton) findViewById(R.id.rbtn_psyduck);
        mZubateRadioBtn =(RadioButton) findViewById(R.id.rbtn_zubat);

        mBullbasaurRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mBullbasaurRadioBtn;
            }
        });
        mCharmanderRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mCharmanderRadioBtn;
            }
        });
        mJigglypuffRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mJigglypuffRadioBtn;
            }
        });
        mPidgeyRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mPidgeyRadioBtn;
            }
        });
        mSnorlaxRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mSnorlaxRadioBtn;
            }
        });
        mPikachuRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mPikachuRadioBtn;
            }
        });
        mCaterpieRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mCaterpieRadioBtn;
            }
        });
        mPsychduckRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mZubateRadioBtn.setChecked(false);
                mSelectedRadioButton=mPsychduckRadioBtn;
            }
        });
        mZubateRadioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBullbasaurRadioBtn.setChecked(false);
                mCharmanderRadioBtn.setChecked(false);
                mJigglypuffRadioBtn.setChecked(false);
                mPidgeyRadioBtn.setChecked(false);
                mSnorlaxRadioBtn.setChecked(false);
                mPikachuRadioBtn.setChecked(false);
                mCaterpieRadioBtn.setChecked(false);
                mPsychduckRadioBtn.setChecked(false);
                mSelectedRadioButton=mZubateRadioBtn;
            }
        });

        mName= (EditText) findViewById(R.id.name_edit_text);
        mNextButton= (Button) findViewById(R.id.next_button);
        mPlayer= (TextView) findViewById(R.id.player_text);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_selection);
        addListenerButton();
        setNumbOfPlayers();
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int rbtnID= mSelectedRadioButton.getId();
                setCharacter(mSelectedRadioButton.getResources().getResourceEntryName(rbtnID));

                if (mPlayer1==null){
                    try {
                        mPlayer1= new Player(String.valueOf(mName.getText()),mCharacter);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Toast.makeText(PlayerSelectionActivity.this, mPlayer1.getPlayerName(), Toast.LENGTH_SHORT);
                    if (mNumbOfPlayers==1){
                        playGame();
                    } else {
                        mSelectedRadioButton.setEnabled(false);
                        mName.getText().clear();
                        mPlayer.setText(R.string.player_2);
                    }
                } else {
                    try {
                        mPlayer2= new Player(String.valueOf(mName.getText()),mCharacter);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Toast.makeText(PlayerSelectionActivity.this, mPlayer2.getPlayerName(), Toast.LENGTH_SHORT);
                    playGame();
                }

            }
        });
    }

    public void setNumbOfPlayers(){
        if(MenuActivity.ismPlayBot()==true){
            mNumbOfPlayers=1;
        }
        else {
            mNumbOfPlayers=2;
        }
    }
    public static Player getPlayer1() {
        return mPlayer1;
    }
    public static Player getPlayer2() {
        if (mPlayer2==null){
            mPlayer2= new Player();
        }
        return mPlayer2;
    }

    private void playGame(){
        Intent intent= new Intent(this, GameActivity.class);
        startActivity(intent);
    }

}
