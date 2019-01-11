package ca.ualberta.cs.lonelytwitter.models;

public abstract class Shape {
    //abstracts can only be inherited by other classes.

    private int x;
    private int y;

    //this chunk of code for getters and setters were generated automatically by right clicking y, then choosing generate, and then setters and getters.
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    //we will now create getters and setters manually.
    public int getX() {
        return x;
    };

    //and here we will create a setter. this allows the setting of the value
    public void setX(int newX) {
        x = newX;
    }


    public abstract void draw(); //currently does nothing. however, every child class will need a draw function.



}
