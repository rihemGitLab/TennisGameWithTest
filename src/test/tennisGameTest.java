package test;

import main.TennisGame;
import main.TennisPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class tennisGameTest  {
    TennisPlayer player1;
    TennisPlayer player2;
    TennisGame tennisGame;


    @Before
    public void preapareGamePlayers(){
         player1=new TennisPlayer("rihem",0);
         player2=new TennisPlayer("george",0);
        tennisGame=new TennisGame(player1,player2);
    }
    @Test
    public void LoveLoveShouldBeScoreforBothPlayers(){
      String result=  tennisGame.calculatePlayerScore();
        assertEquals("Love, Love",result);
    }

    @Test
    public void ThirtyShouldbeScoreForFirstPlayer(){
        player1.setPlayerPoints(2);
        String result=  tennisGame.calculatePlayerScore();
        assertEquals("Thirty, Love",result);
    }
    @Test
    public void fifteen_fortyShoudBeTheScore(){
        player1.setPlayerPoints(1);
        player2.setPlayerPoints(3);
        String result=  tennisGame.calculatePlayerScore();
        assertEquals("Fifteen, Forty",result);
    }
    @Test
    public void rihemShoudWinTheGame(){
        player1.setPlayerPoints(5);
        player2.setPlayerPoints(3);
        String result=  tennisGame.calculatePlayerScore();
        assertNotEquals("Win for george",result);
        assertEquals("Win for rihem",result);
    }

    @Test
    public void rihemAndGeorgeShoudBeDeuce(){
        player1.setPlayerPoints(4);
        player2.setPlayerPoints(4);
        String result=  tennisGame.calculatePlayerScore();
        assertEquals("Deuce",result);
    }

    @Test
    public void theAdvantageShouldBeForGeorge(){
        player1.setPlayerPoints(3);
        player2.setPlayerPoints(4);
        String result=  tennisGame.calculatePlayerScore();
        assertEquals("Advantage for george",result);
    }
}
