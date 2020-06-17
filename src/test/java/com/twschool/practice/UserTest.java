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

    @Test
    public void should_return_12_given_when_user_win_3_times(){
        User user=new User("001");
        Answer answer=new Answer();

        GeneratorExtent generatorExtent1534=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent1634=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent1734=new GeneratorExtent(answer);
        generatorExtent1534.setGeneratorAnswer("1534");
        generatorExtent1634.setGeneratorAnswer("1634");
        generatorExtent1734.setGeneratorAnswer("1734");
        Game game1534=new Game(generatorExtent1534);
        Game game1634=new Game(generatorExtent1634);
        Game game1734=new Game(generatorExtent1734);

        user.playGame("3241",game1534);
        user.playGame("1534",game1534);
        user.playGame("1234",game1634);
        user.playGame("1634",game1634);
        user.playGame("1734",game1734);
        user.playGame("1234",game1734);

        assertEquals(12,user.getUserMars());

    }
}
