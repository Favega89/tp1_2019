package Model.TournamentModel;

import Model.HumansModel.Human;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static Logger.Logger.*;


/**
 * Created by Yo on 13/4/2019.
 */
public class Round {

    public static void present(List<Human> humans){
        humans.stream().forEach(human -> human.present());
    }

    public static Optional<Human> getCompetitor(List<Human> humans){
        Optional<Human> competitor = humans.stream().findAny();
        if(competitor.isPresent()) {
            startToDrinkLog(competitor.get().getClass().getSimpleName(), competitor.get().getName());
        }
        return competitor;
    }

    public static boolean beginRound(Optional<Human> competitor1, Optional<Human> competitor2){
        if(competitor1.isPresent() && competitor2.isPresent()) {
            runRound(competitor1.get() , competitor2.get());
            return true;
        }else {
            finishTournament();
            return false;
        }
    }

    private static void runRound(Human comp1,Human comp2){
        while (true) {
            comp1.drink();
            comp2.drink();
            if (comp1.goToPee()) {
                if (!comp2.goToPee()) {
                    finishNormalRound(comp2,comp1);
                    return;
                } else {
                    finishTiedRound(comp1,comp2);
                    return;
                }
            } else if (comp2.goToPee()) {
                finishNormalRound(comp1,comp2);
                return;
            }
        }
    }

    private static void finishNormalRound(Human winner,Human looser){
        peeLog(looser.getClass().getSimpleName(), looser.getName());
        endRoundLog(winner.getClass().getSimpleName(), winner.getName());
        ScoreBoard.score(winner);
    }

    private static void finishTiedRound(Human comp1, Human comp2){
        peeLog(comp1.getClass().getSimpleName(), comp1.getName());
        peeLog(comp2.getClass().getSimpleName(), comp2.getName());
        tiedRoundLog();
    }

    private static void finishTournament(){
        Tournament.finishTournament();
    }
}
