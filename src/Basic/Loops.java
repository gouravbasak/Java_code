package Basic;

public class Loops {
    public static void main(String[] args) {
        int a = 5;
       //while loop
        while (a <10){
            System.out.println(a);
            a++;
        }
       //for loop
        for (int b = 5 ; b> 0; b--){
            System.out.println(b);
        }
       // do while
        int c = 5;
       do {
           System.out.println(c);
           c++;
       }while (c< 10);
      //for each
      int[] marks = new int []{50, 51,54};
        for (int mark: marks) {
            System.out.println(mark);
        }
    }
}
