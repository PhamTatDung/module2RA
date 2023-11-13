package baitap2.Run;

import baitap2.model.Circle;
import baitap2.model.Rectangle;
import baitap2.model.Shape;
import baitap2.model.Square;

public class shapeManeger {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(5.0, 7.0),
                new Square(3.0)
        };
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square colorable = (Square) shape;
                colorable.howToColor();
            }
        }

    }
}
