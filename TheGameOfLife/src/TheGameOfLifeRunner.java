//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
	{
	static Player p = new Player("", 100000, 0, "", 0);
	static int location = 0;
	public static void main(String[] args) 
		{
		int spin = Spinner.playerSpin();
		move(spin);
		}
	public static void move(int s)
		{
		for(int i = 0; i < Spaces.allSpaces.length; i++)
			{
			System.out.println();
			System.out.println("You landed on " + Spaces.allSpaces[location]);
			if(Spaces.allSpaces[location] == "Normal Space")
				{
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Get Career")
				{
				PlayerCareer.addCareers();
				Payday.addSalaries();
				new PlayerCareer(null).playerCareer();
				p.setSalary(Payday.salaries.get(Payday.randomSalary).getSalary());
				System.out.println("Your salary is: " + p.getWallet());
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Payday")
				{
				Payday.addSalaries();
				new Payday(i).payday();
				p.setWallet(p.getWallet() + p.getSalary());
				System.out.println("Your earnings are: " + p.getWallet());
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Life Space")
				{
				LifeSpots.addLifeCards();
				new LifeSpots(null, i).lifeCard();
				p.setWallet(p.getWallet() + LifeSpots.lifeCards.get(LifeSpots.randomCard).getReward());
				System.out.println("Your earnings are: " + p.getWallet());
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Get Married")
				{
				new GetMarried().getSpouse();
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Get House")
				{
				BuyHouse.addHouses();
				new BuyHouse(null, i).playerHouse();
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Have Kid")
				{
				new Kids().haveKids();
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Retire")
				{
				new Retire().retire();
				onward();
				System.out.println();
				break;
				}
			location += s;
			}
		}
	public static void onward()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Press enter to continue");
		String answer = userInput.nextLine();
		}
	}
