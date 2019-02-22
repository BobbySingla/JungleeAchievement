import java.util.*;

public class GeneratePlayers {
    TreeMap<String, Float> eachteamplayers = new TreeMap<>();

    TreeMap<String, Float> players() {
        for (int i = 0; i < 3; i++) {
            eachteamplayers.put("Team1 " + "Player" + (i + 1), new GenerateAttacks().generateHits());
        }
        for (int i = 0; i < 3; i++) {
            eachteamplayers.put("Team2 " + "Player" + (i + 1), new GenerateAttacks().generateHits());
        }
        return eachteamplayers;
    }


    public void disp() {
        Set set = players().entrySet();
        Iterator iterable = set.iterator();
        System.out.format("-----------------------------------------------------\n");
        System.out.format("| Team and Players  | Total Damage Done  |\n");
        System.out.format("-----------------------------------------------------\n");
        while (iterable.hasNext()) {
            Map.Entry m = (Map.Entry) iterable.next();
            System.out.print("   " + m.getKey() + "          " + m.getValue() +"\n");
        }
    }
}