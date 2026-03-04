package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3);
        Shape shape2 = new Circle(2);
        Shape shape3 = new Square(3);

        Renderer renderer = new Renderer(shape);
        renderer.draw();
        Renderer renderer2 = new Renderer(shape2);
        renderer2.draw();
        Renderer renderer3 = new Renderer(shape3);
        renderer3.draw();
    }
}