package Achievements;

import GenerateDataa.PlayersStatistics;

@FunctionalInterface
public interface  Awards {
     boolean validate(PlayersStatistics playersStatistics);
}
