import java.util.*;
public class LifeSpots extends Spaces
	{
	static int randomCard = (int) (Math.random() * 5);
	static ArrayList<LifeSpots> lifeCards = new ArrayList<LifeSpots>();
	private String achievement;
	private int reward;
	public LifeSpots(String a, int r)
		{
		achievement = a;
		reward = r;
		}
	public static void addLifeCards()
		{
		lifeCards.add(new LifeSpots("Run world recod mile.", 10000));
		lifeCards.add(new LifeSpots("Climb Mt. Everest.", 10000));
		lifeCards.add(new LifeSpots("Lifetime Achievement Award", 20000));
		lifeCards.add(new LifeSpots("Paint a masterpiece.", 30000));
		lifeCards.add(new LifeSpots("Become President.", 50000));
		lifeCards.add(new LifeSpots("Nobel Peace Prize.", 50000));
		Collections.shuffle(lifeCards);
		}
	public String getAchievement()
		{
		return achievement;
		}
	public int getReward()
		{
		return reward;
		}
	@Override
	public void lifeCard()
		{
		System.out.println("Your life card is: " + lifeCards.get(randomCard).getAchievement() + " Reward: " + lifeCards.get(randomCard).getReward());
		lifeCards.remove(0);
		}
	}
