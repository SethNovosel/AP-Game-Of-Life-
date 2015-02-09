import java.util.ArrayList;
import java.util.Scanner;
public class BuyHouse extends Spaces
	{
	static ArrayList<BuyHouse> houses = new ArrayList<BuyHouse>();
	private String house;
	private int price;
	public BuyHouse(String h, int p)
		{
		house = h;
		price = p;
		}
	public static void addHouses()
		{
		houses.add(new BuyHouse("Split-Level", 40000));
		houses.add(new BuyHouse("Beach House", 140000));
		houses.add(new BuyHouse("Dutch Colonial", 120000));
		houses.add(new BuyHouse("Mobile Home", 60000));
		houses.add(new BuyHouse("Cozy Condo", 100000));
		houses.add(new BuyHouse("Tudor", 180000));
		houses.add(new BuyHouse("Log Cabin", 80000));
		houses.add(new BuyHouse("Victorian", 200000));
		houses.add(new BuyHouse("Farm House", 160000));
		}
	public void setHouse(String house)
		{
		this.house = house;
		}
	public String getHouse()
		{
		return house; 
		}
	public int getPrice()
		{
		return price;
		}
	@Override
	public void playerHouse()
		{
		System.out.println("The houses are:");
		for(int i = 0; i < houses.size(); i++)
			{
			System.out.println(houses.get(i).getHouse() + " " + houses.get(i).getPrice());
			}
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which one do you want?");
		int answer = userInput.nextInt();
		System.out.println("Your bought the: " + houses.get(answer - 1).getHouse());
		}
	}

