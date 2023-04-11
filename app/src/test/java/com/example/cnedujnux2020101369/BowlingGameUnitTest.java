package com.example.cnedujnux2020101369;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private MainActivity.BowlingGame game;

    @Test
    public void first_test()
    {
        MainActivity.BowlingGame game = new MainActivity.BowlingGame();
        for (int i = 0;i<20;i++)
        {
            game.roll(0);
        }

        assertEquals(10,game.score(0));

    }
}