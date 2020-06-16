package com.twschool.practice;

public class Answer {
    public String getAnswerResult(String actualAnswer,String inputAnswer){
        int valuePositionCorrectCount=0;
        int onlyValueCorrectCount=0;
        for(int index=0;index<actualAnswer.length();index++){
            if(actualAnswer.charAt(index)==inputAnswer.charAt(index)){
                valuePositionCorrectCount++;
            }
        }
        return valuePositionCorrectCount+"A"+onlyValueCorrectCount+"B";
    }
}
