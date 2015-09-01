import java.awt.Color;
import javax.swing.JFrame;
public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(255,0,0);
        Color myCollor = myColor.brighter();
        frame.getContentPane().setBackground(myCollor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}