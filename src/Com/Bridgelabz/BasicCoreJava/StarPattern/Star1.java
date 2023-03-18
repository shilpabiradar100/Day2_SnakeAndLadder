package Com.Bridgelabz.BasicCoreJava.StarPattern;

public class Star1 {
    public static void main(String[] args) {
      /*  System.out.println("Please enter limit of Row: ");
        int rows = rows.intScanner();

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

     /*   for (int i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    */
        for (int row = 1; row <= 8; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

//*
//**
//***
//****
//*****
