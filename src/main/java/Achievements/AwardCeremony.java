package Achievements;

import GenerateDataa.PlayersStatistics;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AwardCeremony {
    private final List<Awards> availableAwards;
    Map<String, List<String>> eachPlayerAwards = new TreeMap<>();

    public AwardCeremony(final List<Awards> availableAwards) {
        this.availableAwards = availableAwards;
    }

    public Map<String, List<String>> awardCalculate(Map<String, PlayersStatistics> eachPlayerStatsMap) {

        eachPlayerStatsMap.forEach((s, playerStats) -> {

            List<String> awardsLists = availableAwards.stream()
                    .filter(award -> award.validate(playerStats))
                    .map(Objects::toString)
                    .collect(Collectors.toList());
            eachPlayerAwards.put(s, awardsLists);

        });
        return eachPlayerAwards;
    }
}
