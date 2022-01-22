import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice d4 = new Dice(4);
        Dice d6 = new Dice(6);
        Dice d8 = new Dice(8);
        Dice d10 = new Dice(10);
        Dice d12 = new Dice(12);
        Dice d20 = new Dice(20);
        Dice[] dice = new Dice[]{d4, d6, d8, d10, d12, d20};

        System.out.println("""
                The goal of the game is to roll the max number on each dice (d4, d6, d8, d10, d12, and d20) and move on to each subsequent die.
                If you roll below the max amount, you must start over from the beginning.
                For example, if you roll a 4 on a d4 you can move on to a d6 and if you roll anything below a 6 you must start over from the d4.""");
        Thread.sleep(5000);
        System.out.println("The game will begin now.");
        Thread.sleep(2000);

        for (int i = 0; i < dice.length; ) {
            dice[i].roll();
            dice[i].printRoll();
            if (dice[i].getCurrentRoll() == dice[i].getSideNumber()) {
                i++;
            } else {
                i = 0;
            }
        }
        System.out.println();
        System.out.println("Congratulations, the game has been completed!");
        System.out.println("Here are your statistics: ");
        System.out.println("You rolled a d4 " + d4.getNumberOfTimesRolled() + " times.");
        System.out.println("You rolled a d6 " + d6.getNumberOfTimesRolled() + " times.");
        System.out.println("You rolled a d8 " + d8.getNumberOfTimesRolled() + " times.");
        System.out.println("You rolled a d10 " + d10.getNumberOfTimesRolled() + " times.");
        System.out.println("You rolled a d12 " + d12.getNumberOfTimesRolled() + " times.");
        System.out.println("You rolled a d20 " + d20.getNumberOfTimesRolled() + " times.");
        System.out.println();
        System.out.println("You've rolled a total of " +
                (d4.getNumberOfTimesRolled() + d6.getNumberOfTimesRolled()
                        + d8.getNumberOfTimesRolled() + d10.getNumberOfTimesRolled() +
                        d12.getNumberOfTimesRolled() + d20.getNumberOfTimesRolled()) + " dice.");
    }
}
