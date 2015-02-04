public class Stock extends Player
{
private int stock = (int) (Math.random() * 10) + 1;
@Override
public void playerStock()
{
System.out.println("All stock cost $50,000");
System.out.println("Your stock is " + stock);
}
}


