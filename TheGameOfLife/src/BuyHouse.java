import java.util.ArrayList;
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
	private int randomHouse = (int) (Math.random() * 9);
	@Override
	public void playerHouse()
		{
		System.out.println("Your house is " + houses.get(randomHouse));
		}
	}

