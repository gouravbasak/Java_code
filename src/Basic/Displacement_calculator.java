package Basic;

import java.util.Scanner;

public class Displacement_calculator {
    public static void main(String[] args) {

        //formula >>  s = ut + 1/2 at^2
        double u;
        double t;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Initial velocity : ");
            u = sc.nextInt();
        } while (u < 0);

        do {
            System.out.print("Time : ");
            t = sc.nextInt();
        }while (t <0);
        System.out.print("acceleration : ");
        double a = sc.nextInt();
        double s = u*t + 0.5 * a * Math.pow(t, 2);
        System.out.println("value of distance is : " +s);
    }
}
