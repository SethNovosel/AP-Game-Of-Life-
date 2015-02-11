//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
	{
	static Player p = new Player("", 100000, 0, "", 0);
	static int location = 0;
	static int i = 0;
	public static void main(String[] args) 
		{
		System.out.println("Welcome to the game of life.");
		System.out.println("You are now on " + Spaces.allSpaces[location]);
		for(i = 0; i < Spaces.allSpaces.length; i++)
			{
			int spin = Spinner.playerSpin();
			move(spin);
			}
		}
	public static void move(int s)
		{
			System.out.println();
			System.out.println("You spun the number " + s);
			if(location < 43 && location + s >= 43)
				{
				if(Spaces.allSpaces[location] == "Retire")
					{
					System.out.println("You are now on " + Spaces.allSpaces[location]);
					System.out.println("Your total earnings are: " + p.getWallet());
					System.out.println();
					new Retire().retire();
					}
				}
			else if(location < 18 && location + s >= 18)
				{
				location += s;
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
			else if(location < 8 && location + s >= 8)
				{
				location += s;
				location = 8;
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				if(Spaces.allSpaces[location] == "Get Married")
					{
					new GetMarried().getSpouse();
					onward();
					System.out.println();
					}
				}
			else if(location < 2 && location + s >= 2)
				{
				location += s;
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
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Payday")
				{
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				Payday.addSalaries();
				new Payday(i).payday();
				p.setWallet(p.getWallet() + p.getSalary());
				System.out.println("Your earnings are: " + p.getWallet());
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Life Space")
				{
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				LifeSpots.addLifeCards();
				new LifeSpots(null, i).lifeCard();
				p.setWallet(p.getWallet() + LifeSpots.lifeCards.get(LifeSpots.randomCard).getReward());
				System.out.println("Your earnings are: " + p.getWallet());
				onward();
				System.out.println();
				}
			else if(Spaces.allSpaces[location] == "Have Kid")
				{
				System.out.println("You are now on " + Spaces.allSpaces[location]);
				new Kids().haveKids();
				p.setKids(p.getKids() + Kids.answer);
				System.out.println("You have " + p.getKids() + " kids.");
				onward();
				System.out.println();
				}
			location += s;
		}
	public static void onward()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Press enter to continue");
		String answer = userInput.nextLine();
		}
	}
