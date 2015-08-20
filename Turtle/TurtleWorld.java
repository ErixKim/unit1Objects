import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(180);
        turtle.forward(25);
        turtle.turn(90);
        turtle.forward(150);
        turtle.turn(45);
        turtle.forward(80);
        turtle.turn(180);
        turtle.forward(80);
       
        
        
        
    }
}