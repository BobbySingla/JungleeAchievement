package GenerateDataa;

import java.util.Random;
import java.util.TreeMap;

public class GenerateData {
    TreeMap<String, PlayersStatistics> playerdata = new TreeMap<String, PlayersStatistics>();

    public TreeMap<String, PlayersStatistics> teamandPlayerdata() {
        for (int i = 0; i < 3; i++) {
            playerdata.put("Team1-" + "Player" + (i + 1), generateData());
        }
        for (int i = 0; i < 3; i++) {
            playerdata.put("Team2-" + "Player" + (i + 1), generateData());
        }
        return playerdata;
    }

    PlayersStatistics generateData() {
        int min = 1;
        Random random = new Random();
        int totalNoOfAttemptedAttacks = random.nextInt(50 + min);
        int totalNoOfHits = random.nextInt(totalNoOfAttemptedAttacks + min);
        int totalAmountDamageDone = random.nextInt(1000 + min);
        int totalNoOfKillInGame = random.nextInt(totalNoOfHits + min);
        int noOfFirstHitKills = random.nextInt(totalNoOfHits + min);
        int noOfAssists = random.nextInt(totalNoOfHits + min);
        int noOfSpellCast = random.nextInt(10 + min);
        int totalSpellCastDamageDone = random.nextInt(15 + min);
        int totalTimePlayed = random.nextInt(300 + min);
        int totalNoOfGamesPlayed = random.nextInt(1500 + min);
        int totalDurationOfGamesPlayed = random.nextInt(totalTimePlayed + min);
        int totalNoOfKill = random.nextInt(totalNoOfKillInGame + min) + 50;
        int totalGamesWinned = random.nextInt(totalNoOfGamesPlayed + min);
        System.out.println(totalNoOfAttemptedAttacks + "  " + totalNoOfHits
                + " " + totalAmountDamageDone + "          " + totalNoOfKillInGame + "        " +
                noOfFirstHitKills + " " + noOfAssists + " " + noOfSpellCast + " " +
                totalSpellCastDamageDone + " " + totalTimePlayed + " " + totalNoOfGamesPlayed + " " +
                totalDurationOfGamesPlayed + " " + totalNoOfKill + " " + totalGamesWinned);
        return new PlayersStatistics.PlayersStatisticsBuilder()
                .totalNoOfAttemptedAttacks(totalNoOfAttemptedAttacks)
                .totalNoOfHits(totalNoOfHits)
                .totalAmountDamageDone(totalAmountDamageDone)
                .totalNoOfKillInGame(totalNoOfKillInGame)
                .noOfFirstHitKills(noOfFirstHitKills)
                .noOfAssists(noOfAssists)
                .noOfSpellCast(noOfSpellCast)
                .totalSpellCastDamageDone(totalSpellCastDamageDone)
                .totalTimePlayed(totalTimePlayed)
                .totalNoOfGamesPlayed(totalNoOfGamesPlayed)
                .totalDurationOfGamesPlayed(totalDurationOfGamesPlayed)
                .totalNoOfKill(totalNoOfKill)
                .totalGamesWinned(totalGamesWinned)
                .build();
    }
}