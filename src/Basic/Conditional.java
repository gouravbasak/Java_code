package Basic;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the no : ");
        String day = sc.next();

    //if-else case
        if (day.equals("1")) {
            System.out.println("Monday");
        }
        else if (day.equals("2")) {
            System.out.println("Tuesday");
        }
        else if (day.equals("3")) {
            System.out.println("Wednesday");
        }
        else{
            System.out.println("some other day");
        }

    //switch case
        switch (day){
            case "1" :
                System.out.println("Monday");
                break;
            case "2" :
                System.out.println("Tuesday");
                break;
            case "3" :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("some other day");
        }
    }
}
