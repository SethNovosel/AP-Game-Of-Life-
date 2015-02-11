import java.util.Scanner;
public class Retire extends Spaces
	{
	@Override
	public void retire()
		{
		System.out.println("You can retire now! Where do you want to live? Millionaire Estates(1) or Countryside Acrers(2)");
		Scanner userInput = new Scanner(System.in);
		int answer = userInput.nextInt();
		if(answer == 1)
			{
			System.out.println("Congratulations, you are now living peacefully in you mansion in Millionaire Estates!");
			System.exit(0);
			}
		else
			{
			System.out.println("Congratulations, you are now living peacefully on your ranch in Countryside Acrers!");
			System.exit(0);
			}
		}
	}
