package Main;

import Achievements.*;
import GenerateDataa.GenerateData;
import GenerateDataa.PlayersStatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EntryPoint {
    static TreeMap<String, PlayersStatistics> playerdata;
    List awards = new ArrayList();

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();
        playerdata = new GenerateData().teamandPlayerdata();
        System.out.println("Winner is : " + entryPoint.winner(playerdata));


        AwardsAllocation awardsAllocation=new AwardsAllocation();
        entryPoint.showAchievements();

    }

    public List awardsList() {
        awards.add(new Bruiser());
        awards.add(new SharpShooter());
        awards.add(new Vetran());
        awards.add(new BigWinner());
        return awards;
    }

    public void showAchievements() {
        System.out.format("---------------------------------------------------------------\n");
        System.out.format("| Team- Players  |             Awards                         |\n");
        System.out.format("---------------------------------------------------------------\n");
    }

    public String winner(TreeMap<String, PlayersStatistics> playerdata) {
        if (!(playerdata.isEmpty())) {
            int Team1 = 0;
            int Team2 = 0;
            for (Map.Entry<String, PlayersStatistics> entry : playerdata.entrySet()) {
                String[] strings = entry.getKey().split("-");
                if (strings[0].equals("Team1")) {
                    Team1 = Team1 + entry.getValue().getTotalNoOfKillInGame();
                } else if (strings[0].equals("Team2")) {
                    Team2 += entry.getValue().getTotalNoOfKillInGame();
                }
            }
            if (Team1 > Team2) {
                return "Team 1 Wins";
            } else {
                return "Team 2 Wins";
            }
        }
        return "Both teams have equal no. of kills";
    }
}