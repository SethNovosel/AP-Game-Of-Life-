import java.util.Random;
public class Spinner 
	{
	static int spin;
	public static int playerSpin()
		{
		spin = (int) (Math.random() * 5) + 1;
		System.out.println("You spun the number " + spin);
		return spin;
		}
	}