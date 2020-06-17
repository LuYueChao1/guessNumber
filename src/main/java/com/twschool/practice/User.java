package com.twschool.practice;

public class User {
    private String userNumber;
    private int userMars=0;
    private int winTimes=0;

    public User(String userNumber){
        this.userNumber=userNumber;
    }

    public void playGame(String inputNumber,Game game){
        if(game.getGameStatus()==GameStatus.CONTINUED){
            game.guess(inputNumber);
            this.countMars(game);

        }
    }
    public int getUserMars(){
        return this.userMars;
    }
    private void countMars(Game game){
        if(game.getGameStatus()==GameStatus.SUCCEED){
            this.winTimes++;
            this.userMars=this.userMars+3;
            if(this.winTimes>0&&winTimes%3==0){
                this.userMars=this.userMars+3;
            }
        }
        if (game.getGameStatus()==GameStatus.FAILED){
            this.userMars=this.userMars-3;
        }

    }


}
