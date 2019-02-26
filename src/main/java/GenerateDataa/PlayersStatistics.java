package GenerateDataa;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class PlayersStatistics {
    private int totalNoOfAttemptedAttacks;
    private int totalNoOfHits;
    private int totalAmountDamageDone;
    private int totalNoOfKillInGame;
    private int noOfFirstHitKills;
    private int noOfAssists;
    private int noOfSpellCast;
    private int totalSpellCastDamageDone;
    private int totalTimePlayed;
    private int totalNoOfGamesPlayed;
    private int totalDurationOfGamesPlayed;
    private int totalNoOfKill;
    private int totalGamesWinned;
}


