import java.util.ArrayList;
public class House extends Player 
{
static ArrayList<House> houses = new ArrayList<House>();
private String house;
private int price;
public House(String h, int p)
{
house = h;
price = p;
}
public static void addHouses()
{
houses.add(new House("Split-Level", 40000));
houses.add(new House("Beach House", 140000));
houses.add(new House("Dutch Colonial", 120000));
houses.add(new House("Mobile Home", 60000));
houses.add(new House("Cozy Condo", 100000));
houses.add(new House("Tudor", 180000));
houses.add(new House("Log Cabin", 80000));
houses.add(new House("Victorian", 200000));
houses.add(new House("Farm House", 160000));
}
private int randomHouse = (int) (Math.random() * 9);
@Override
public void playerHouse()
{
System.out.println("Your house is " + houses.get(randomHouse));
}
}
