import java.util.Random;
public class DieSimulator
{
    public static void main( String[] args )
    {
        // option A
        Random generator = new Random();
        int dieValue = generator.nextInt(6);
        dieValue += 1;
        System.out.println( dieValue );
        
        //option B
        double dieValue2 = Math.random(); // returns a double between 0 (inclusive) and 1 (exclusive)
        dieValue2 *= 6; //range [0 , 6)
        dieValue2 += 1; //range [1 , 7)
        System.out.println((int) dieValue2 ); // prints 1, 2, 3, 4, 5, 6
    }
}
        
