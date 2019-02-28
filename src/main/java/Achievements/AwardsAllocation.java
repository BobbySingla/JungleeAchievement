package Achievements;


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


}
