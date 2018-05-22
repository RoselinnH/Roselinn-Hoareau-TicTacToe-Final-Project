package com.techgirl.tictactoe;

public class Player {
    private String playerName;
    private String character;
    private int wins=0;

    private boolean bot;

    Player(String playerName, String character) throws Exception{
        if (playerName.length()<=8){
            this.playerName=playerName;
            this.character=character;
        }
        else throw new Exception("Name must be of 8 characters or less");
    }

    Player(){
            playerName="Team Rocket";
            character="meowth";
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) throws Exception{
        if(playerName.length()<=8){
            this.playerName = playerName;
        }
        else throw new Exception("Name must be of 8 characters or less");

    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public int getWins() {
        return wins;
    }

    public void addWins() {
        this.wins++;
    }
}
