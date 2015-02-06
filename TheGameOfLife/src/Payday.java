import java.util.ArrayList;
public class Payday extends Spaces
	{
	static ArrayList<Payday> salaries = new ArrayList<Payday>();
	private int salary;
	private int tax;
	public Payday(int s, int t)
		{
		salary = s;
		tax = t;
		}
	public static void addSalaries()
		{
		salaries.add(new Payday(100000, 45000));
		salaries.add(new Payday(90000, 40000));
		salaries.add(new Payday(80000, 35000));
		salaries.add(new Payday(70000, 30000));
		salaries.add(new Payday(60000, 25000));
		salaries.add(new Payday(50000, 20000));
		salaries.add(new Payday(40000, 15000));
		salaries.add(new Payday(30000, 10000));
		salaries.add(new Payday(20000, 5000));
		}
	@Override
	public void payday()
		{
		int randomSalary = (int) (Math.random() * 10);
		System.out.println("Your salary is " + salaries.get(randomSalary));
		}
	public int getSalary()
		{
		return this.salary = salary;
		}
	}

