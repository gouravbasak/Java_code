package OOPs;

public class Exception_handling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println("The devision of this 2 number is : "+(a/b));
        }
        catch (Exception e){
            System.out.println("This kind of division is not possible ");
        }
        finally {
            System.out.println("The code completed here..");
        }
    }
}
