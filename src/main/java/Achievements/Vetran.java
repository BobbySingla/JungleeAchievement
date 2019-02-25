package Achievements;

import GenerateDataa.PlayersStatistics;

public class Vetran implements Awards {


    @Override
    public boolean validate(PlayersStatistics playersStatistics) {

       return  (playersStatistics.getTotalNoOfGamesPlayed() > 1000);

    }

    @Override
    public String toString() {
        return "Veteran ";
    }
}

