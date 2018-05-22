package com.techgirl.tictactoe;

import android.util.Log;
import android.widget.Button;

public class GameMode {

    private Player player1;
    private Player player2;
    private int round;
    private boolean player1Turn=true;
    private String toast="";
    private int spot[][]=new int[3][3];
    private String winner;
    GameMode(Player player1, Player player2){
        this.player1=player1;
        this.player2=player2;
        round=1;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getRound() {
        return round;
    }

    public void addRound() {
        this.round ++;
    }

    public boolean isPlayer1Turn() {
        return player1Turn;
    }

    public void setPlayer1Turn() {
        if(this.player1Turn){
            player1Turn=false;
        }
        else {
            this.player1Turn=true;
        } }

    public String toastRound(){
        toast= "Round "+String.valueOf(round);
        return toast;
    }

    public String player1Wins(){
        toast= ("Victory for "+player1.getPlayerName()+"!");
        return toast;
    }

    public String player2Wins(){
        toast= ("Victory for "+player2.getPlayerName()+"!");
        return toast;
    }
    public String draw(){
        toast= ("Draw");
        return toast;
    }

    public int[][] getSpot() {
        return spot;
    }

    public void setSpot(String resID,int player) {
        String xstring= resID.substring(7,8);
        String ystring= resID.substring(8);
        int x= Integer.parseInt(xstring);
        int y= Integer.parseInt(ystring);
        spot[x][y]= player==1? 1:2;
        this.spot = spot;
    }
    public void resetSpot(){
        for(int x=0;x<3;x++){
            for (int y=0;y<3;y++){
                spot[x][y]= 0;
            }
        }
    }
    public boolean CheckWin(){
        for (int x=0;x<3;x++){
                if(spot[x][0]==spot[x][1]&& spot[x][0]==spot[x][2] && (spot[x][0]==1 || spot[x][0]==2)){
                    return true;
                }
        }
        for(int i=0; i<3; i++){
            if(spot[0][i]==(spot[1][i])
                    && spot[0][i]==(spot[2][i])
                    && (spot[0][i]==1 || spot[0][i]==2)){
                return true;
            }
        }
        if(spot[0][0]==(spot[1][1])
                && spot[0][0]==(spot[2][2])
                && (spot[0][0]==1 || spot[0][0]==2)){
            return true;
        }
        if(spot[0][2]==(spot[1][1])
                && spot[0][2]==(spot[2][0])
                && (spot[0][2]==1 || spot[0][2]==2)){
            return true;
        }
        return false;
    }
}
