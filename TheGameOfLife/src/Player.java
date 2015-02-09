import java.util.ArrayList;
public class Player 
	{
	static ArrayList<Player> playerStats = new ArrayList<Player>();
	private String career;
	private int salary;
	private String house;
	private String spouse;
	public Player(String c, int s, String h, String sp)
		{
		career = c;
		salary = s;
		house = h;
		spouse = sp;
		}
	public void setCareer()
		{
		this.career = career;
		}
	}