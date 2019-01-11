package ca.ualberta.cs.lonelytwitter.models;

public class Circle extends Shape {
    //this is just a regular class. Shape was an abstract class. this function inherits everything from the Shape class (extends)

    Circle() {
        super.setX(0);
        super.setY(0);
    }

    public void draw() {
        //some code here. this is just implementing the draw function from the Shape abstract function.

    }

}