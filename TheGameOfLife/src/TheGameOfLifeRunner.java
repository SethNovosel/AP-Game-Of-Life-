//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
	{
	static int location = 0;
	public static void main(String[] args) 
		{
		int spin = Spinner.playerSpin();
		//Spaces.fillSpaces();
		move(spin);
		}
	public static void move(int s)
		{
		for(int i = 0; i < Spaces.allSpaces.length; i++)
			{
			System.out.println("You landed on " + Spaces.allSpaces[location]);
			if(Spaces.allSpaces[location] == "Normal Space")
				{
				System.out.println("yes");
				}
			else if(Spaces.allSpaces[location] == "Get Career")
				{
			
				}
			else if(Spaces.allSpaces[location] == "Payday")
				{
		
				}
			else if(Spaces.allSpaces[location] == "Life Space")
				{
			
				}
			else if(Spaces.allSpaces[location] == "Get Married")
				{
		
				}
			else if(Spaces.allSpaces[location] == "Get House")
				{
		
				}
			else if(Spaces.allSpaces[location] == "Salary Trade")
				{
		
				}
			else if(Spaces.allSpaces[location] == "Retire")
				{
				
				}
			location += s;
			}
		}
	}
