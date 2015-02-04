import java.util.Random;
public class Spinner 
{
public static void playerSpin()
{
int spin = (int) (Math.random() * 5) + 1;
System.out.println("You spun the number " + spin);
}
}