import java.util.ArrayList;
public class Salary extends Player 
{
static ArrayList<Salary> salaries = new ArrayList<Salary>();
private int salary;
private int tax;
public Salary(int s, int t)
{
salary = s;
tax = t;
}
public static void addSalaries()
{
salaries.add(new Salary(100000, 45000));
salaries.add(new Salary(90000, 40000));
salaries.add(new Salary(80000, 35000));
salaries.add(new Salary(70000, 30000));
salaries.add(new Salary(60000, 25000));
salaries.add(new Salary(50000, 20000));
salaries.add(new Salary(40000, 15000));
salaries.add(new Salary(30000, 10000));
salaries.add(new Salary(20000, 5000));
}
private int randomSalary = (int) (Math.random() * 10);
@Override
public void playerSalary()
{
System.out.println("Your salary is " + salaries.get(randomSalary));
}
}
