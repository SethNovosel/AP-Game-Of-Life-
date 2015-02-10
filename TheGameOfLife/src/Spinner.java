import java.util.Random;
public class Spinner 
	{
	static int spin;
	public static int playerSpin()
		{
		spin = (int) (Math.random() * 5) + 1;
		return spin;
		}
	}