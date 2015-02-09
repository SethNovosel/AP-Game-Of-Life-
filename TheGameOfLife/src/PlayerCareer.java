import java.util.ArrayList;
public class PlayerCareer extends Spaces
	{
	static int randomCareer = (int) (Math.random() * 9);
	static ArrayList<PlayerCareer> careers = new ArrayList<PlayerCareer>();
	 String careerName;
	public PlayerCareer(String n)
		{
		careerName = n;
		}
	public static void addCareers()
		{
		careers.add(new PlayerCareer("Accountant"));
		careers.add(new PlayerCareer("Computer Consultant"));
		careers.add(new PlayerCareer("Teacher"));
		careers.add(new PlayerCareer("Entertainer"));
		careers.add(new PlayerCareer("Athlete"));
		careers.add(new PlayerCareer("Doctor"));
		careers.add(new PlayerCareer("Police Officer"));
		careers.add(new PlayerCareer("Artist"));
		careers.add(new PlayerCareer("Salesperson"));
		}
	public String getCareer()
		{
		return careerName;
		}
	@Override
	public void playerCareer()
		{
		System.out.println("Your career is: " + careers.get(randomCareer).getCareer());
		}
	}
