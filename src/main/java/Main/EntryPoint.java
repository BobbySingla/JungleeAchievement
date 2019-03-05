package Main;

import Achievements.*;
import GenerateDataa.GenerateData;
import GenerateDataa.PlayersStatistics;

import java.util.*;

public class EntryPoint {
    static TreeMap<String, PlayersStatistics> playerdata;
    static List<Awards> awards = new ArrayList<>();

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();
        playerdata = new GenerateData().teamandPlayerdata();
        System.out.println("Winner is : " + entryPoint.winner(playerdata));
        System.out.println("Teams and Awards Data : ");
        AwardsAllocation awardsAllocation = new AwardsAllocation(getawards());
        Map<String, List<String>> playerAward = awardsAllocation.awardcal(playerdata);
        entryPoint.show(playerAward);
    }

    private static void show(Map<String, List<String>> playerawards) {
        System.out.printf("-------------------------------------------------------------------------------\n");
        System.out.printf("|     Team      |                           Awards                             |\n");
        System.out.printf("-------------------------------------------------------------------------------\n");
        playerawards.forEach((player, awards) ->
                System.out.printf("| %12s | %-60s |\n",player, awards));
        System.out.printf("-------------------------------------------------------------------------------\n");
    }

    public static List getawards() {
        return Arrays.asList(new SharpShooter(), new BigWinner(), new Vetran(), new Bruiser(), new FirstHitsKillsAward());
    }

    public String winner(TreeMap<String, PlayersStatistics> playerdata) {
        if (!(playerdata.isEmpty())) {
            int Team1 = 0, Team2 = 0;
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