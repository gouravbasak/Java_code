package Basic;

import OOPs.Encapsulation;

import java.awt.*;

public class Rectangle_with_encap {
    public static void main(String[] args) {
        Encapsulation rect1 = new Encapsulation(); //import the formula through encapsulation
        rect1.length = 4;
        rect1.breadth= 5;
        rect1.draw();
        rect1.printArea();
    }
}
