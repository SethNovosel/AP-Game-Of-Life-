import java.util.ArrayList;
public class Career extends Player
{
static ArrayList<Career> careers = new ArrayList<Career>();
private String careerName;
private String careerSpecial;
public Career(String n, String s)
{
careerName = n;
careerSpecial = s;
}
public static void addCareers()
{
careers.add(new Career("Accountant", null));
careers.add(new Career("Computer Consultant", null));
careers.add(new Career("Teacher", null));
careers.add(new Career("Entertainer", null));
careers.add(new Career("Athlete", "Can trade 4 life tiles for the $100,000 salary."));
careers.add(new Career("Doctor", null));
careers.add(new Career("Police Officer", "Collect $10,000 for any player who speeds (Spins a 5)."));
careers.add(new Career("Artist", "Collect $10,000 when a player buys your art."));
careers.add(new Career("Salesperson", "Colllect $5,000 when a player buys stock."));
}
private int randomCareer = (int) (Math.random() * 9);
@Override
public void playerCareer()
{
System.out.println("Your career is " + careers.get(randomCareer));
}
}