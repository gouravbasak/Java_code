package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("the sum of the 2 number is : "+add(3,4));
        System.out.println("the sum of the 3 number is : "+add(3,4,5));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
//here we can give two function the same name because of the polymorphism without getting any error
