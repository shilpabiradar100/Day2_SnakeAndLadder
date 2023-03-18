package Com.LineComparision;
import java.util.Scanner;
public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = sc.nextInt();
        System.out.println("Enter col size: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter " + (col * row) + " Elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("Array Elements: ");
           /* for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("[" + i + "][" + j + "] : " + arr[i][j] + " | ");
                }
                System.out.print("\n");
            }*/
        }
    }
}