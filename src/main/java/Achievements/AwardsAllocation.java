package Achievements;

import GenerateDataa.PlayersStatistics;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AwardsAllocation {
    List<Awards> awards;
    Map<String, List<String>> playerawards = new TreeMap<>();

    public AwardsAllocation(List<Awards> awards) {
        this.awards = awards;
    }

    public Map<String, List<String>> awardscal(Map<String, PlayersStatistics> playerdata) {

        playerdata.forEach((s, playersStatistics) -> {
            List<String> awardsLists = awards.stream()
                    .filter(award -> award.validate(playersStatistics))
                    .map(Objects::toString)
                    .collect(Collectors.toList());
            playerawards.put(s, awardsLists);
        });
        return playerawards;
    }
}
