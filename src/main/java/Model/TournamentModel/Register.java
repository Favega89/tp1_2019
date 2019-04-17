package Model.TournamentModel;

import lombok.Getter;

/**
 * Created by Yo on 17/4/2019.
 */
@Getter
public class Register {

    @Getter
    private int winnerPoints;
    @Getter
    private int looserPoints;
    private String winnerName;
    private boolean isATie;

    public Register(int points) {
        winnerName = "";
        winnerPoints = points;
        looserPoints = points;
        isATie = true;
    }

    public Register(String winner,int winnerPoints, int looserPoints){
        this.winnerName = winner;
        this.winnerPoints = winnerPoints;
        this.looserPoints = looserPoints;
        isATie = false;
    }
}
