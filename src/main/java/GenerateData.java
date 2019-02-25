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
        Random random = new Random();
        int totalNoOfAttemptedAttacks = random.nextInt(50);
        int totalN0OfHits = random.nextInt(totalNoOfAttemptedAttacks);
        int totalAmountDamageDone = ((totalN0OfHits / totalNoOfAttemptedAttacks) * 100);
        int totalNoOfKillInGame = random.nextInt(totalN0OfHits);
        int noOfFirstHitKills = random.nextInt(totalN0OfHits);
        int noOfAssists = random.nextInt(totalN0OfHits);
        int noOfSpellCast = random.nextInt(10);
        int totalSpellCastDamageDone = random.nextInt(15);
        int totalTimePlayed = random.nextInt(100);
        int totalNoOfGamesPlayed = random.nextInt(200);
        int totalDurationOfGamesPlayed = random.nextInt(totalTimePlayed) + 50;
        int totalNoOfKill = random.nextInt(totalNoOfKillInGame) + 25;
        int totalGamesWinned = random.nextInt(totalDurationOfGamesPlayed);
        System.out.println(totalNoOfAttemptedAttacks + "    " + totalN0OfHits
                + " " + totalAmountDamageDone + " " + totalNoOfKillInGame + " " +
                noOfFirstHitKills + " " + noOfAssists + " " + noOfSpellCast + " " +
                totalSpellCastDamageDone + " " + totalTimePlayed + " " + totalNoOfGamesPlayed + " " +
                totalDurationOfGamesPlayed + " " + totalNoOfKill + " " + totalGamesWinned);
        return new PlayersStatistics().totalNoOfAttemptedAttacks(totalNoOfAttemptedAttacks)
                .tot


    }
}

