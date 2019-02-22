import java.util.Random;

public class GenerateAttacks {
    int noOfAttacks;
    int noOfHits;
    float damageAmount;

    public float generateHits() {
        Random random = new Random();
        noOfAttacks = random.nextInt(25);
        if (noOfAttacks >= (noOfHits = random.nextInt(25))) {
            System.out.print("No. of Attacks: " + noOfAttacks + "    No. Of Hits : " + noOfHits + "\n");
            damageAmount = ((noOfHits * 100) / noOfAttacks);
            return damageAmount;
        } else {
            generateHits();
        }
        return damageAmount;
    }
}