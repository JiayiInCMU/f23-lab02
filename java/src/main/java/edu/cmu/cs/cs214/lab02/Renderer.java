package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {

    //Shape rectangle = new Rectangle();

    //public Rectangle rectangle;
    private final Shape rectangle;
    
    Renderer(Shape rectangle) {
        this.rectangle = rectangle;
    }

    void draw() {

        double area = rectangle.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
