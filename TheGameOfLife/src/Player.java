import java.util.ArrayList;
public class Player 
	{
	static ArrayList<Player> playerStats = new ArrayList<Player>();
	private String career;
	private int salary;
	private int wallet;
	private String house;
	private int kids;
	public Player(String c, int w, int s, String h, int k)
		{
		career = c;
		wallet = w;
		salary = s;
		house = h;
		kids = k;
		}
	public static ArrayList<Player> getPlayerStats() 
		{
		return playerStats;
		}
	public static void setPlayerStats(ArrayList<Player> playerStats) 
		{
		Player.playerStats = playerStats;
		}
	public String getCareer() 
		{
		return career;
		}
	public void setCareer(String career) 
		{
		this.career = career;
		}
	public int getSalary() 
		{
		return salary;
		}
	public void setSalary(int salary) 
		{
		this.salary = salary;
		}
	public int getWallet() 
		{
		return wallet;
		}
	public void setWallet(int wallet) 
		{
		this.wallet = wallet;
		}
	public String getHouse() 
		{
		return house;
		}
	public void setHouse(String house) 
		{
		this.house = house;
		}
	public int getKids() 
		{
		return kids;
		}
	public void setKids(int kids) 
		{
		this.kids = kids;
		}
	}