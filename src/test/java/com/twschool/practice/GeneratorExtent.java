package com.twschool.practice;

public class GeneratorExtent extends Generator {

    public GeneratorExtent(Answer answer) {
        super(answer);
    }

    public void setGeneratorAnswer(String answerStr){
        this.generateAnswer=answerStr;
    }
}
