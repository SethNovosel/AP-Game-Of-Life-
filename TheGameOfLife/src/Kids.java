import java.util.Scanner;
public class Kids extends Spaces
	{
	static int answer;
	public void haveKids()
		{
		System.out.println("You can have a kid! Boy(1) or Girl(2)?");
		Scanner userInput = new Scanner(System.in);
		answer = userInput.nextInt();
		if(answer == 1)
			{
			System.out.println("Congratulations on your new baby boy!");
			}
		else
			{
			System.out.println("Congratulations on your new baby girl!");
			}
		}
	}
