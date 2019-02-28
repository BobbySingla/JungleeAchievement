package Achievements;

import GenerateDataa.PlayersStatistics;

public class FirstHitAward implements Awards {
    @Override
    public boolean validate(PlayersStatistics playersStatistics) {
        return playersStatistics.getNoOfFirstHitKills()>15;
    }

    @Override
    public String toString() { return "FIRST-KILL-AWARD";
    }
}
