import java.util.Random;

public class Dice {

    private int sideNumber;
    private int currentRoll;
    private Boolean isCorrect;
    private Random random = new Random();
    private int numberOfTimesRolled;

    public Dice(int sideNumber) {
        this.sideNumber = sideNumber;
        this.isCorrect = false;
        currentRoll = 1;
        numberOfTimesRolled = 0;
    }

    public void roll() {
        numberOfTimesRolled++;
        currentRoll = random.nextInt(1, sideNumber + 1);
    }

    public int getCurrentRoll() {
        return currentRoll;
    }

    public void printRoll() {
        System.out.print("d" + sideNumber + " being rolled : ");
        System.out.println("Roll: " + currentRoll);
    }

    public void setIsCorrect(Boolean x) {
        isCorrect = x;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public int getSideNumber() {
        return sideNumber;
    }

    public int getNumberOfTimesRolled() {
        return numberOfTimesRolled;
    }

}
