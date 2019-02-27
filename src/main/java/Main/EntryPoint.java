package Main;

import Achievements.*;
import GenerateDataa.GenerateData;
import GenerateDataa.PlayersStatistics;

import java.util.*;

public class EntryPoint {
    static TreeMap<String, PlayersStatistics> playerdata;
    List awards = new ArrayList();

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();
        playerdata = new GenerateData().teamandPlayerdata();
        System.out.println("Winner is : " + entryPoint.winner(playerdata));
        AwardsAllocation awardCeremony = new AwardsAllocation(getAwards());
        Map<String, List<String>> playeraward = awardCeremony.awardscal(playerdata);
        showAchievements(playeraward);
    }

    public static List<Awards> getAwards() {
        return Arrays.asList(
                new SharpShooter(),
                new Bruiser(),
                new Vetran(),
                new BigWinner());
    }

    private static void showAchievements(final Map<String, List<String>> playerawards) {
        System.out.format("---------------------------------------------------------------\n");
        System.out.format("| Team- Players  |             Awards                         |\n");
        System.out.format("---------------------------------------------------------------\n");
        playerawards.forEach((playerdata, awards) ->
                System.out.println("  "+playerdata + "    " + awards));
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