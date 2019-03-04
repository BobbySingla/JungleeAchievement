package Achievements;


import GenerateDataa.PlayersStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class AwardsAllocation {
    static List<Awards> awards = new ArrayList<>();

    TreeMap<String, List<String>> playerawards = new TreeMap<>();

    public AwardsAllocation(List<Awards> awards) {
        this.awards = awards;
    }

    public Map<String, List<String>> awardcal(Map<String, PlayersStatistics> playerData) {
//        playersStatisforEach((s, playersStatistics1) -> );
        playerData.forEach((s, playersStatistics) -> {
            List<String> awardsList = awards.stream()
                    .filter(awards1 -> awards1.validate(playersStatistics))
                    .map(Objects::toString)
                    .collect(Collectors.toList());
            playerawards.put(s, awardsList);
        });
        return playerawards;
    }

}
