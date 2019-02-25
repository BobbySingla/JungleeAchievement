import java.util.Map;
import java.util.TreeMap;

public class EntryPoint {
    static TreeMap<String, PlayersStatistics> playerdata;

    public static void main(String[] args) {
        EntryPoint entryPoint = new EntryPoint();
        playerdata = new GenerateData().teamandPlayerdata();
        System.out.println("Winner is : " + entryPoint.winner(playerdata));
    }

    public String winner(TreeMap<String, PlayersStatistics> playerdata) {
        if (!(playerdata.isEmpty())) {
            int Team1 = 0;
            int Team2 = 0;
            for (Map.Entry<String, PlayersStatistics> entry : playerdata.entrySet()) {
                String[] strings = entry.getKey().split("-");
                if (strings[0].equals("team1")) {
                    Team1 = Team1 + entry.getValue().getTotalNoOfKillInGame();
                } else if (strings[0].equals("team2")) {
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



