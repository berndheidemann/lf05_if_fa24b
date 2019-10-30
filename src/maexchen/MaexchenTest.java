package maexchen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaexchenTest {
    private Maexchen game;

    @BeforeEach
    public void setUp(){
        game = new Maexchen();
    }

    @Test
    public void givenTwoAndOne_WhenCalculatePoints_Then1000(){
        assertEquals(1000, game.calculatePoints(2, 1));
    }

    @Test
    public void givenOneAndTwoWhenCalculatePointsThen1000(){
        assertEquals(1000, game.calculatePoints(1, 2));
    }

    @Test
    public void givenADoubletsWhenCalculatePointsThenScoreMultiplyWith100(){
        assertEquals(200, game.calculatePoints(2, 2));
        assertEquals(400, game.calculatePoints(4, 4));
        assertEquals(500, game.calculatePoints(5, 5));
    }

    @Test
    public void givenThrow1biggerThanThrow2WhenCalculatePointsThenThrow1Multiply10PlusThrow2(){
        assertEquals(53, game.calculatePoints(5, 3));
    }

    @Test
    public void givenThrow1SmallerThanThrow2WhenCalculatePointsThenThrow2Multiply10PlusThrow1(){
        assertEquals(64, game.calculatePoints(4, 6));
    }

    @Test
    public void givenParamsOutOfRangeWhenCalculatePointsThenReturnMinus1(){
        assertEquals( -1, game.calculatePoints(-1, 2));
        assertEquals( -1, game.calculatePoints(2, 7));
        assertEquals( -1, game.calculatePoints(10, 3));
        assertEquals( -1, game.calculatePoints(4, -6));
    }
}