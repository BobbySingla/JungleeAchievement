package Achievements;

import GenerateDataa.PlayersStatistics;

public class Bruiser implements Awards {


    @Override
    public boolean validate(PlayersStatistics playerStats) {
        return playerStats.getTotalAmountDamageDone() >= 500;
    }

    @Override
    public String toString() {
        return "BRUSIER";
    }
}
