package Logger;

import static java.lang.System.*;
import static java.lang.System.out;

/**
 * Created by Yo on 16/4/2019.
 */
public abstract class Logger {

    public static void peeLog(String teamName,String name){
        out.println(teamName
                + " "
                + name
                + " ran to pee!"
                + "\n");
    }

    public static void drinkLog(String teamName, String name, int bladderCapacityLeft){
        out.println(teamName
                + " "
                + name
                + " already has "
                + bladderCapacityLeft
                + " of his capacity"
                +"\n");
    }

    public static void presentLog(String teamName,String name){
        out.println(teamName
                + " "
                + name
                + " ready to contest");
    }

    public static void startToDrinkLog(String teamName,String name){
        out.println(teamName
                + " "
                + name
                + " is drinking beer"
                +"\n");
    }

    public static void endRoundLog(String teamName,String name){
        out.println(teamName
                + " "
                + name
                + " won this round!"
                +"\n");
    }

    public static void tiedRoundLog(){
        out.println("Both competitors ran to pee!"
        +"\n");
        out.println("THIS ROUND IS A TIE!");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
    }

    public static void teamWinsRoundLog(String teamName){
        out.println(teamName + " WON THIS ROUND!");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
    }

    public static void tiedTournament(){
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
        out.println("\n" + "TOURNAMENT ENDS LIKE A TIE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! "+
                "\n");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
    }

    public static void endTournament(String teamName){
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
        out.println("\n" +  "THE " + teamName + " WINS THE BEERS TOURNAMENT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" +
                "\n");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
        out.print("---------------------------------------------------------------------------------------------------"+"\n");
    }


}
