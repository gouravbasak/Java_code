package OOPs;

//abstract class format
public abstract class Shape_abstract {
    public void draw(){
        System.out.println("Drawing a shape : ");
    }
    public abstract void printArea();
    //currently i dont know the definition but when my child class extends this file they have to implement this function
}
