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
        Answer answer=new Answer();
        String guessResult=answer.getAnswerResult(actualAnswer,inputAnswer);
        avaiableTimes--;
    }
    public void modifyStatus(String result){
        boolean isNotimes=avaiableTimes==0;
        if(isNotimes){
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
