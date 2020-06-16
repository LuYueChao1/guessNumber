package com.twschool.practice;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class AnswerTest {
    @Test
    public void should_return_0A0B_given_when_input_actualAnswer_1358_and_inputAnswer_0479(){
        Answer answer=new Answer();
        String answerResult=answer.getAnswerResult("1358","0479");
        assertEquals("0A0B",answerResult);
    }
    @Test
    public void should_return_4A0B_given_when_input_actualAnswer_1358_and_inputAnswer_1358(){
        Answer answer=new Answer();
        String answerResult=answer.getAnswerResult("1358","1358");
        assertEquals("4A0B",answerResult);
    }
    @Test
    public void should_return_0A4B_given_when_input_actualAnswer_1358_and_inputAnswer_8531(){
        Answer answer=new Answer();
        String answerResult=answer.getAnswerResult("1358","8531");
        assertEquals("0A4B",answerResult);
    }
    @Test
    public void should_return_1A1B_given_when_input_actualAnswer_1358_and_inputAnswer_1546(){
        Answer answer=new Answer();
        String answerResult=answer.getAnswerResult("1358","1546");
        assertEquals("1A1B",answerResult);
    }
    @Test
    public void should_return_1A0B_given_when_input_actualAnswer_1358_and_inputAnswer_1746(){
        Answer answer=new Answer();
        String answerResult=answer.getAnswerResult("1358","1546");
        assertEquals("1A1B",answerResult);
    }

}
