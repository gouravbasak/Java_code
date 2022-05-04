package Basic;

import OOPs.Inheritance_with_abstractFormat;
import OOPs.Shape_abstract;

public class Circle_with_inheritance {
    public static void main(String[] args) {
        Shape_abstract shape = new Inheritance_with_abstractFormat(8);
        shape.draw();
        shape.printArea();
    }
}
