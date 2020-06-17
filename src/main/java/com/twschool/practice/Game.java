package com.twschool.practice;

import java.util.Scanner;

public class Game {
    private String actualAnswer;
    private GameStatus gameStatus=GameStatus.CONTINUED;
    private int typeMax=6;
    private int avaiableTimes=typeMax;

    public Game(Generator generator){
        this.actualAnswer=generator.getGeneratorAnswer();
    }
    public void guess(String inputAnswer){
        if(this.gameStatus.equals(GameStatus.CONTINUED)){
            Answer answer=new Answer();
            String guessResult=answer.getAnswerResult(actualAnswer,inputAnswer);
            avaiableTimes--;
            this.modifyStatus(guessResult);
        }

    }
    public void modifyStatus(String result){
        boolean isNoTimes=avaiableTimes==0;
        if(isNoTimes){
            gameStatus=GameStatus.FAILED;
        }
        if(result.equals("4A0B")){
            gameStatus=GameStatus.SUCCEED;
        }
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
