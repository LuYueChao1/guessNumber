package com.twschool.practice;

import java.util.Scanner;

public class Game {
    private String actualAnswer=this.generator();
    public void Main(){
        // Scanner scan=new Scanner(System.in);
        System.out.println("Input　　    Output       actualAnswer");
        Answer answer=new Answer();
        int inputCount=1;
        while (inputCount<6){
            // String inputAnswer=scan.nextLine();
            String inputAnswer=String.valueOf((int)((Math.random()*9+1)*1000));
            String answerResult=this.checkStrIsOk(inputAnswer)?answer.getAnswerResult(this.actualAnswer,inputAnswer):"输入不合法";
            System.out.println(inputAnswer+"        "+answerResult+"        "+actualAnswer);
            inputCount++;
        }
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
    public String generator(){
        String inputAnswer=String.valueOf((int)((Math.random()*9+1)*1000));
        while (!this.checkStrIsOk(inputAnswer)){
            inputAnswer=String.valueOf((int)((Math.random()*9+1)*1000));
        }
        return inputAnswer;
    }

}
