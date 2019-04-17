package Model.TournamentModel;

import Logger.Logger;
import Model.HumansModel.Human;
import Model.HumansModel.Viking;
import Percistence.TournamentDBWriter;

import static Logger.Logger.endTournament;
import static Logger.Logger.teamWinsRoundLog;
import static Logger.Logger.tiedTournament;

/**
 * Created by Yo on 15/4/2019.
 */
public class ScoreBoard {

    private static int TEAM_ONE_POINTS = 0;
    private static int TEAM_TWO_POINTS = 0;


    public static void score(Human winner){
        if (winner.getClass().equals(Viking.class)){
            TEAM_ONE_POINTS ++ ;
            teamWinsRoundLog("VIKINGS");
        }else {
            TEAM_TWO_POINTS ++ ;
            teamWinsRoundLog("SPARTANS");
        }
    }

    public static void getResults(){
       int result = Integer.valueOf(TEAM_ONE_POINTS)
               .compareTo(Integer.valueOf(TEAM_TWO_POINTS));

       switch (result){
           case 1: finish(false) ;
               break;
           case 0: tie();
               break;
           case -1: finish(true);
               break;
       }
    }

    private static void finish(boolean spartansWins) {
        if (spartansWins) {
            endTournament("SPARTANS");
            TournamentDBWriter.getInstance()
                    .writeResult(new Register("Spartans", TEAM_TWO_POINTS, TEAM_ONE_POINTS));
        } else {
            endTournament("VIKINGS");
            TournamentDBWriter.getInstance()
                    .writeResult(new Register("Vikigns", TEAM_ONE_POINTS, TEAM_TWO_POINTS));
        }
    }

    private static void tie(){
        tiedTournament();
        TournamentDBWriter.getInstance().writeResult(new Register(TEAM_ONE_POINTS));
    }
}
