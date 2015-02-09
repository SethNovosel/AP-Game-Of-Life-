import java.util.ArrayList;
public class Payday extends Spaces
	{
	static int randomSalary = (int) (Math.random() * 9);
	static ArrayList<Payday> salaries = new ArrayList<Payday>();
	private int salary;
	public Payday(int s)
		{
		salary = s;
		}
	public static void addSalaries()
		{
		salaries.add(new Payday(100000));
		salaries.add(new Payday(90000));
		salaries.add(new Payday(80000));
		salaries.add(new Payday(70000));
		salaries.add(new Payday(60000));
		salaries.add(new Payday(50000));
		salaries.add(new Payday(40000));
		salaries.add(new Payday(30000));
		salaries.add(new Payday(20000));
		}
	public void setSalary(int salary)
		{
		this.salary = salary;
		}
	public int getSalary()
		{
		return salary;
		}
	@Override
	public void payday()
		{
		System.out.println("Your salary is " + salaries.get(randomSalary).getSalary());
		}
	
	}

