package SnakeProgram;

public class SnakeLadder {
    public static int rollsDie() {
        int dieNumber = (int) (Math.random() * 6 + 1);
        return dieNumber;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        int startPosition = 0, dieNum;

        dieNum = rollsDie();
        System.out.println("Die Number : " + dieNum);
    }
}
