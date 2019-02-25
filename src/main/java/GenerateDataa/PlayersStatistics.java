package GenerateDataa;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
//@AllArgsConstructor
@Builder
public class PlayersStatistics {


    public int getTotalNoOfAttemptedAttacks() {
        return totalNoOfAttemptedAttacks;
    }

    public int getTotalNoOfHits() {
        return totalNoOfHits;
    }

    public int getTotalAmountDamageDone() {
        return totalAmountDamageDone;
    }

    public int getTotalNoOfKillInGame() {
        return totalNoOfKillInGame;
    }

    public int getNoOfFirstHitKills() {
        return noOfFirstHitKills;
    }

    public int getNoOfAssists() {
        return noOfAssists;
    }

    public int getNoOfSpellCast() {
        return noOfSpellCast;
    }

    public int getTotalSpellCastDamageDone() {
        return totalSpellCastDamageDone;
    }

    public int getTotalTimePlayed() {
        return totalTimePlayed;
    }

    public int getTotalNoOfGamesPlayed() {
        return totalNoOfGamesPlayed;
    }

    public int getTotalDurationOfGamesPlayed() {
        return totalDurationOfGamesPlayed;
    }

    public int getTotalNoOfKill() {
        return totalNoOfKill;
    }

    public int getTotalGamesWinned() {
        return totalGamesWinned;
    }

    int totalNoOfAttemptedAttacks;
    int totalNoOfHits;
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
}


