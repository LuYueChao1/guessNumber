package com.twschool.practice;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
public class UserTest {
    @Test
    public void should_return_3_given_when_user_win_1_times(){
        User user=new User("001");
        Answer answer=new Answer();

        GeneratorExtent generatorExtent=new GeneratorExtent(answer);

        generatorExtent.setGeneratorAnswer("1234");
        Game game=new Game(generatorExtent);

        user.playGame("3241",game);
        user.playGame("1234",game);

        assertEquals(3,user.getUserMars());

    }

    @Test
    public void should_return_negative3_given_when_user_lost_1_times(){
        User user=new User("001");
        Answer answer=new Answer();

        GeneratorExtent generatorExtent=new GeneratorExtent(answer);

        generatorExtent.setGeneratorAnswer("1534");
        Game game=new Game(generatorExtent);

        user.playGame("3241",game);
        user.playGame("1234",game);
        user.playGame("1234",game);
        user.playGame("1234",game);
        user.playGame("1234",game);
        user.playGame("1234",game);

        assertEquals(-3,user.getUserMars());

    }
}
