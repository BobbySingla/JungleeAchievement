package Achievements;

import GenerateDataa.PlayersStatistics;

public class FirstHitsKillsAward  implements Awards {
    @Override
    public boolean validate(PlayersStatistics playersStatistics) {
        return playersStatistics.getNoOfFirstHitKills() > 15;
    }

    @Override
    public String toString() {
        return " FiRST-KILL AWARD";
    }
}
