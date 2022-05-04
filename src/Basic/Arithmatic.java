package Basic;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //this will increment the value after printing
        System.out.println(a++);
        //this will increment the value before printing
        System.out.println(++b);
        //compound assignment operator
        a += b;
        System.out.println(a);
    }
}
