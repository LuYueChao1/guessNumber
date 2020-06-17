package com.twschool.practice;

import java.util.Scanner;

public class Game {
    private String actualAnswer;
    private GameStatus gameStatus=GameStatus.CONTINUED;
    private int typeMax=6;
    private int avaiableTimes=typeMax;
    private User user;

    public Game(Generator generator){
        this.actualAnswer=generator.getGeneratorAnswer();
    }


}
