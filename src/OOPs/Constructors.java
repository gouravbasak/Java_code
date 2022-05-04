package OOPs;

public class Constructors {
        public int length;
        public int breadth ;
        public void draw(){
            System.out.println("Drawing a rectangle : ");
        }
        public Constructors(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
            System.out.println("I'm inside the constructor");
        }
        public void printArea(){
            System.out.println("Area of the rectangle is : "+ (length*breadth));
        }
    }
//now we can use this to anywhere in the class because of constructor
