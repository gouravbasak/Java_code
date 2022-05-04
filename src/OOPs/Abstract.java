package OOPs;

public class Abstract {
 private int area;
 public Abstract(int length , int breadth){
    this.area = length * breadth;
     System.out.println("I'm inside the constructor >> ");
 }
 public void draw() {
     System.out.println("Drawing the rectangle : ");
 }
 public void printArea(){
     System.out.println("Area of the rectangle is : "+ area);
 }
}
/*i am using the assign values through the abstract class
the order of abstraction is ..
public > protected > default > private
 */

