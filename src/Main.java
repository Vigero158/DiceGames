public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice d4 = new Dice(4);
        Dice d6 = new Dice(6);
        Dice d8 = new Dice(8);
        Dice d10 = new Dice(10);
        Dice d12 = new Dice(12);
        Dice d20 = new Dice(20);

        System.out.println("""
                The goal of the game is to roll the max number on each dice (d4, d6, d8, d10, d12, and d20) and move on to each subsequent die.
                If you roll below the max amount, you must start over from the beginning.
                For example, if you roll a 4 on a d4 you can move on to a d6 and if you roll anything below a 6 you must start over from the d4.""");
        Thread.sleep(5000);
        System.out.println("The game will begin now.");
        Thread.sleep(2000);

        while (!d4.getIsCorrect() && !d6.getIsCorrect() && !d8.getIsCorrect() && !d10.getIsCorrect() && !d12.getIsCorrect() && !d20.getIsCorrect()) {
            d4.roll();
            d4.printRoll();
            if (d4.getCurrentRoll() == d4.getSideNumber()) {
                d4.setIsCorrect(true);
                d6.roll();
                d6.printRoll();
                if (d6.getCurrentRoll() == d6.getSideNumber()) {
                    d6.setIsCorrect(true);
                    d8.roll();
                    d8.printRoll();
                    if (d8.getCurrentRoll() == d8.getSideNumber()) {
                        d8.setIsCorrect(true);
                        d10.roll();
                        d10.printRoll();
                        if (d10.getCurrentRoll() == d10.getSideNumber()) {
                            d10.setIsCorrect(true);
                            d12.roll();
                            d12.printRoll();
                            if (d12.getCurrentRoll() == d12.getSideNumber()) {
                                d12.setIsCorrect(true);
                                d20.roll();
                                d20.printRoll();
                                if (d20.getCurrentRoll() == d20.getSideNumber()) {
                                    d20.setIsCorrect(true);
                                } else {
                                    d4.setIsCorrect(false);
                                    d6.setIsCorrect(false);
                                    d8.setIsCorrect(false);
                                    d10.setIsCorrect(false);
                                    d12.setIsCorrect(false);
                                    continue;
                                }

                            } else {
                                d4.setIsCorrect(false);
                                d6.setIsCorrect(false);
                                d8.setIsCorrect(false);
                                d10.setIsCorrect(false);
                                continue;

                            }
                        } else {
                            d4.setIsCorrect(false);
                            d6.setIsCorrect(false);
                            d8.setIsCorrect(false);
                            continue;
                        }
                    } else {
                        d4.setIsCorrect(false);
                        d6.setIsCorrect(false);
                        continue;
                    }
                } else {
                    System.out.println("Resetting rolls.");
                    System.out.println();
                    d4.setIsCorrect(false);
                    continue;
                }
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
