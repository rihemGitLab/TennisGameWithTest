package main;


public class TennisGame {

    private TennisPlayer firstTennisPlayer;
    private TennisPlayer secondTennisPlayer;
    private static final String WIN = "Win for ";
    private static final String ADVANTAGE = "Advantage for ";
    private static final String DEUCE = "Deuce";

    public TennisGame(TennisPlayer firstTennisPlayer, TennisPlayer secondTennisPlayer) {
        this.firstTennisPlayer = firstTennisPlayer;
        this.secondTennisPlayer = secondTennisPlayer;
    }

    public String calculatePlayerScore() {
        if (firstTennisPlayer.getPlayerPoints() >= 3 && secondTennisPlayer.getPlayerPoints() >= 3) {
            if (Math.abs(secondTennisPlayer.getPlayerPoints() - firstTennisPlayer.getPlayerPoints()) >= 2) {
                return WIN +hightScorePlayer().getPlayerName() ;
            } else if (firstTennisPlayer.getPlayerPoints() == secondTennisPlayer.getPlayerPoints()) {
                return DEUCE;
            } else {
                return ADVANTAGE + hightScorePlayer().getPlayerName();
            }

        } else {
                  return  Defaults.values()[firstTennisPlayer.getPlayerPoints()]+", "+Defaults.values()[secondTennisPlayer.getPlayerPoints()];
        }
    }




    public TennisPlayer hightScorePlayer(){
      return firstTennisPlayer.getPlayerPoints()>secondTennisPlayer.getPlayerPoints()?firstTennisPlayer:secondTennisPlayer;
    }
}
