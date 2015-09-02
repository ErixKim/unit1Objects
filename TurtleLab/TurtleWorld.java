import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle2.setPenColor(Color.RED);
        turtle2.penDown();
        turtle.forward(355);
        turtle2.turn(180);
        turtle2.forward(355);
    }
}
        
         