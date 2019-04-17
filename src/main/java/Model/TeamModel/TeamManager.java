package Model.TeamModel;

import Model.HumansModel.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Created by Yo on 16/4/2019.
 */
public class TeamManager {

    public static List<Human> teamBuilder(String className,String...names){
        return Arrays.stream(names)
                .map(name -> {
                    System.out.println(className);
                    if(className.equals("Viking"))
                        return new Viking(name,
                                current().nextInt(20,60),
                                current().nextInt(60,100),
                                new VikingDrinkImp(),
                                new PeeImplemented());
                    else
                        return new Spartan(name,
                                current().nextInt(20,60),
                                current().nextInt(60,100),
                                new SpartanDrinkImp(),
                                new PeeImplemented());
                }).sorted()
                .collect(Collectors.toList());
    }

    public static List<Human> removePlayerFromTeam(List<Human> team, Optional<Human> drunk){
        if (drunk.isPresent()) {
            team.stream()
                    .filter(Predicate.isEqual(drunk.get()))
                    .findFirst()
                    .map(c -> {
                        team.remove(c);
                        return c;
                    });
        }
        return team;
    }

}
