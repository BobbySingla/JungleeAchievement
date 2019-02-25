import lombok.*;

@Data

public class PlayersStatistics {


    int totalNoOfAttemptedAttacks;
    int totalN0OfHits;
    int totalAmountDamageDone;
    int totalNoOfKillInGame;
    int noOfFirstHitKills;
    int noOfAssists;
    int noOfSpellCast;
    int totalSpellCastDamageDone;
    int totalTimePlayed;
    int totalNoOfGamesPlayed;
    int totalDurationOfGamesPlayed;
    int totalNoOfKill;
    int totalGamesWinned;

    public int getTotalNoOfKillInGame() {
        return totalNoOfKillInGame;
    }


}


