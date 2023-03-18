package Com.LineComparision;

import java.util.Scanner;

public class LineComparision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Line1 (x1,y1,x2,y2) (x1.y2).............(x2,Y2)
        System.out.println(" enter the coordinate values of line 1 : ");
        System.out.println(" enter the  x1 coordinate values of line 1 : ");
        double x1 = sc.nextDouble();
        System.out.println(" enter the  Y1 coordinate values of line 1 : ");
        double Y1 = sc.nextDouble();
        System.out.println(" enter the  X2 coordinate values of line 1 : ");
        double X2 = sc.nextDouble();

        System.out.println(" enter the  X2 coordinate values of line 1 : ");
        double Y2 = sc.nextDouble();

        //Line2 (m1,n1)......(m2,n2)
        System.out.println("enter the coordinate values of line 2:");
        System.out.println("enter the m1 coordinate values of line 1:");
        double m1 = sc.nextDouble();
        System.out.println("enter the n1 coordinate values of line 1:");
        double n1 = sc.nextDouble();
        System.out.println("enter the m2 coordinate values of line 1:");
        double m2 = sc.nextDouble();
        System.out.println("enter the n2 coordinate values of line 1:");
        double n2 = sc.nextDouble();

         sc.close();

         double length1 = Math.sqrt(Math.pow((X2-x1) ,2) + Math.pow((Y2-Y1) ,2));
        double length2 = Math.sqrt(Math.pow((m2-m1) ,2) + Math.pow((n2-n1) ,2));

         if(length1==length2){
             System.out.println("Lengths of two lines are equal .");
         } else if (length1 > length2) {
             System.out.println("line1 is longer than  are equal .");

         } else{
             System.out.println("line2 is longer than line1 .");
         }

    }

}

