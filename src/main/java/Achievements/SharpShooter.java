package Achievements;

import GenerateDataa.PlayersStatistics;

public class SharpShooter implements Awards {


    @Override
    public boolean validate(PlayersStatistics playersStatistics) {
        return (playersStatistics.getTotalNoOfAttemptedAttacks() * 0.75) >
                (playersStatistics.getTotalNoOfKillInGame() + playersStatistics.getNoOfAssists());
    }

    @Override
    public String toString() {
        return "Sharp Shooter";
    }
}
