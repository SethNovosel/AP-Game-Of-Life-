//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
	{
	static Player p = new Player("", 100000, 0, "", 0);
	static int location = 0;
	public static void main(String[] args) 
		{
		System.out.println("Welcome to the game of life.");
		System.out.println("You are now on " + Spaces.allSpaces[location]);
		int spin = Spinner.playerSpin();
		move(spin);
		}
	public static void move(int s)
		{
		System.out.println("You spun the number " + Spinner.spin);
		for(int i = 0; i < Spaces.allSpaces.length; i++)
			{
			System.out.println();
			location += s;
			if(location + s > 18)
				{
				location = 18;
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				if(Spaces.allSpaces[location] == "Get House")
					{
					BuyHouse.addHouses();
					new BuyHouse(null, i).playerHouse();
					p.setWallet(p.getWallet() - BuyHouse.houses.get(BuyHouse.answer - 1).getPrice());
					System.out.println("Your earnings are: " + p.getWallet());
					onward();
					System.out.println();
					}
				}
			else if(location + s > 8)
				{
				location = 8;
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				if(Spaces.allSpaces[location] == "Get Married")
					{
					new GetMarried().getSpouse();
					onward();
					System.out.println();
					}
				}
		else if(location + s > 2)
			{
			location = 2;
			System.out.println("You are now on " + Spaces.allSpaces[location]);
			if(Spaces.allSpaces[location] == "Get Career")
				{
				PlayerCareer.addCareers();
				Payday.addSalaries();
				new PlayerCareer(null).playerCareer();
				p.setSalary(Payday.salaries.get(Payday.randomSalary).getSalary());
				System.out.println("Your salary is: " + p.getWallet());
				onward();
				System.out.println();
				}
			}
		else if(Spaces.allSpaces[location] == "Normal Space")
				{
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
			else if(Spaces.allSpaces[location] == "Have Kid")
				{
				new Kids().haveKids();
				p.setKids(p.getKids() + Kids.answer);
				System.out.println("You have " + p.getKids() + " kids.");
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Retire")
				{
				new Retire().retire();
				System.out.println("Your total earnings are: " + p.getWallet());
				System.out.println();
				break;
				}
			}
		}
	public static void onward()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Press enter to continue");
		String answer = userInput.nextLine();
		}
	}
