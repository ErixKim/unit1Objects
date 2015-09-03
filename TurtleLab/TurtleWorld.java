import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle2.setPenColor(Color.RED);
        turtle2.penDown();
        
        int x = 10;
        int y = 15;
        for (int i=1; i < 9999; i++){
            turtle.forward(x);
            turtle.turn(90);
            x += 10;
            turtle2.forward(y);
            turtle2.turn(45);
            turtle2.forward(y);
            turtle2.turn(45);
            turtle2.forward(y);
    }
       
        
    }
}
        
         