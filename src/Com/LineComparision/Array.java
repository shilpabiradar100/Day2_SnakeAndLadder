package Com.LineComparision;

public class Array {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];

        arr[1][1] = 10;
        arr[2][1] = 50;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] : " + arr[i][j] + " | ");
            }
            System.out.print("\n");
        }
    }
}
