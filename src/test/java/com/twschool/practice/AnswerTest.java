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

}
