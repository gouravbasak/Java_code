package OOPs;

public class Inheritance_with_interface implements Shape_interface{
    private static final double pie = 3.14;
    private int radius ;
    public Inheritance_with_interface(int radius){
        super(); //this used to bring the constructor of the parent class
        this.radius = radius;
        System.out.println("I am inside the constructor >> ");
    }
    public void draw(){
      System.out.println("Drawing a circle : ");
    }
    public void printArea() {
        System.out.println("Area of the circle is : " + (2 * pie * radius));
        //if we don't implement this then code will give me error because this is an abstract class function
    }
}
