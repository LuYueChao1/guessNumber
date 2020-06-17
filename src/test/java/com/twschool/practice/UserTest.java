package com.twschool.practice;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
public class UserTest {
    @Test
    public void should_return_marks_3_given_when_user_win_1_times(){
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
    public void should_return_marks_negative3_given_when_user_lost_1_times(){
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
    public void should_return_marks_12_given_when_user_win_3_times(){
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

    @Test
    public void should_return_marks_23_given_when_user_win_5_times(){
        User user=new User("001");
        Answer answer=new Answer();

        GeneratorExtent generatorExtent2134=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent2634=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent2934=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent2734=new GeneratorExtent(answer);
        GeneratorExtent generatorExtent2534=new GeneratorExtent(answer);

        generatorExtent2134.setGeneratorAnswer("2134");
        generatorExtent2634.setGeneratorAnswer("2634");
        generatorExtent2934.setGeneratorAnswer("2934");
        generatorExtent2734.setGeneratorAnswer("2734");
        generatorExtent2534.setGeneratorAnswer("2534");

        Game game2134=new Game(generatorExtent2134);
        Game game2634=new Game(generatorExtent2634);
        Game game2934=new Game(generatorExtent2934);
        Game game2734=new Game(generatorExtent2734);
        Game game1534=new Game(generatorExtent2534);

        user.playGame("2134",game2134);
        user.playGame("2634",game2634);
        user.playGame("2934",game2934);
        user.playGame("2734",game2734);
        user.playGame("2534",game1534);

        assertEquals(23,user.getUserMars());
    }
}
