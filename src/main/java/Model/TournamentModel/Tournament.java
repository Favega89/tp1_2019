package Model.TournamentModel;

import Model.HumansModel.Human;
import Model.TeamModel.TeamManager;

import java.util.List;
import java.util.Optional;

/**
 * Created by Yo on 16/4/2019.
 */
public class Tournament {

    private static List<Human> team1;
    private static List<Human> team2;

    public Tournament() {
    }

    public static void begin(){
        setTeams();
        while (newRound()){
        }
    }

    private static void setTeams(){
        team1 = TeamManager.teamBuilder("Viking","RAGNAR","ROLLO","FLOKI","BJORN");
        team2 = TeamManager.teamBuilder("Spartans","SPARTACUS","LEONIDAS","ALEJANDRO MAGNO","VICKY XIPOLITAKIS");
    }

    private static boolean newRound(){
        Round.present(team1);
        Round.present(team2);
        Optional<Human> competitor1 = Round.getCompetitor(team1);
        Optional<Human> competitor2 = Round.getCompetitor(team2);
        team1 = TeamManager.removePlayerFromTeam(team1,competitor1);
        team2 = TeamManager.removePlayerFromTeam(team2,competitor2);
        return Round.beginRound(competitor1, competitor2);
    }

    public static void finishTournament(){
        ScoreBoard.getResults();
    }
}
