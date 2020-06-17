package com.twschool.practice;

public class Answer {
    public String getAnswerResult(String actualAnswer,String inputAnswer){
        int valuePositionCorrectCount=0;
        int onlyValueCorrectCount=0;
        for(int index=0;index<actualAnswer.length();index++){
            boolean isSamePositionSameValue=actualAnswer.charAt(index)==inputAnswer.charAt(index);
            if(isSamePositionSameValue){
                valuePositionCorrectCount++;
            }
        }
        for(int index=0;index<actualAnswer.length();index++){
            boolean isSameValueAndDiffPosition=inputAnswer.contains(String.valueOf(actualAnswer.charAt(index)))&&inputAnswer.indexOf(String.valueOf(actualAnswer.charAt(index)))!=index;
            if(isSameValueAndDiffPosition){
                onlyValueCorrectCount++;
            }
        }
        return valuePositionCorrectCount+"A"+onlyValueCorrectCount+"B";
    }
    public boolean checkStrIsOk(String str){
        if(str==null||str.isEmpty()||str.length()!=4){
            return false;
        }
        char[] elements=str.toCharArray();
        for(char e:elements){
            if(str.indexOf(e)!=str.lastIndexOf(e)||!Character.isDigit(e)){
                return false;
            }
        }
        return true;
    }
}
