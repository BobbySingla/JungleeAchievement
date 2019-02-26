package Achievements;


import GenerateDataa.GenerateData;
import GenerateDataa.PlayersStatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AwardsAllocation {
    static List awards = new ArrayList();

    public void allocateAwards(TreeMap<String, PlayersStatistics> playerdata) {
        playerdata = new GenerateData().teamandPlayerdata();
//        return new GameAwards().name();
    }
}
