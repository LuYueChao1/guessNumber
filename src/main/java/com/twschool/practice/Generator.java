package com.twschool.practice;

public class Generator {
    protected String generateAnswer;
    public Generator( Answer answer){
        String randomAnswer=String.valueOf((int)((Math.random()*9+1)*1000));
        while (!answer.checkStrIsOk(randomAnswer)){
            randomAnswer=String.valueOf((int)((Math.random()*9+1)*1000));
        }
        this.generateAnswer=randomAnswer;
    }
    public String getGeneratorAnswer(){
        return this.generateAnswer;
    }
}
