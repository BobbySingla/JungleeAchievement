package Achievements;

import GenerateDataa.PlayersStatistics;

public class BigWinner implements Awards {

    @Override
    public boolean validate(PlayersStatistics playersStatistics) {
        return playersStatistics.getTotalGamesWinned() > 200;
    }

    @Override
    public String toString() {
        return " BIG WINNER";
    }
}
