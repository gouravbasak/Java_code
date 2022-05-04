package Basic;

import OOPs.Abstract;

public class Rectangle_with_abstract {
    public static void main(String[] args) {
        Abstract rect1 = new Abstract(5,7);
        rect1.draw();
        rect1.printArea();
    }
}
