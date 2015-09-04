import java.awt.Color;
import java.lang.Object;
public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle2.penUp();
        turtle2.forward(10);
        turtle2.setPenColor(Color.RED);
        turtle2.penDown();
        int x = 10;
        int y = 10;
        int z = 0;
        for (int i=1; i < 150; i++){
            turtle.forward(x);
            turtle.turn(90);
            
            
            turtle.setPenWidth(i/10+1);
            
            x += 10;
            turtle2.forward(y);
            turtle2.turn(45);
            
            turtle2.setPenWidth(i/10+1);
            
            y += 10;
            Thread.sleep(30);
    }
       
        
    }
}
        
         