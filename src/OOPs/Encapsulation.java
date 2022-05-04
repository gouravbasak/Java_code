package OOPs;
//rectangle
public class Encapsulation {
    public int length;
    public int breadth ;
    public void draw(){
        System.out.println("Drawing a rectangle : ");
    }
    public void printArea(){
        System.out.println("Area of the rectangle is : "+ (length*breadth));
    }
}
//now we can use this to anywhere in the class because of encapsulation
