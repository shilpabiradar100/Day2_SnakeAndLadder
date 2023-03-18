package SnakeProgram;
/*UC6 = Report the number of
  times the dice was
played to win the game
and also the position
after every die role*/
/*UC7 = Play the game with 2
Player. In this case if a
Player gets a Ladder
then plays again.
Finally report which
Player won the game*/
public class UC6 {
    public static int rollsDie() {
        int dieNum = (int) (Math.random() * 6 + 1);
        return dieNum;
    }

    public static int checkOption() {
        int option = (int) (Math.random() * 3);
        return option;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        int startPosition = 0, currentPosition = 0, dieNumber, option, diceCount = 0;
        final int NO_PLAY = 0, LADDER = 1, SNAKE = 2, winningPosition = 100;

        System.out.println("current Position : " + currentPosition);

        while (currentPosition < winningPosition) {
            diceCount++;
            int temPosition = currentPosition;

            dieNumber = rollsDie();
            System.out.println("Dice Number : " + dieNumber);

            option = checkOption();
            // System.out.println("Play Option : " + option);

            switch (option) {
                case NO_PLAY:
                    System.out.println("No play! You are at the Same Position : " + currentPosition);
                    break;
                case LADDER:
                    currentPosition = currentPosition + dieNumber;
                    // i did this in uc4 Exact Winning Position
                    if (currentPosition > winningPosition) {
                        System.out.println("You need a different number to win!");
                        currentPosition = temPosition;
                    }
                    System.out.println("You got the Ladder, Position : " + currentPosition);
                    break;
                case SNAKE:
                    if (currentPosition != 0) {
                        currentPosition = currentPosition - dieNumber;
                    }
                    if (currentPosition < 0) {
                        currentPosition = 0;
                    }
                    System.out.println("Bitten by a Snake, Position : " + currentPosition);
                    break;
            }
        }
        System.out.println("The No.of times dice was rolled is : " + diceCount);

    }
}
