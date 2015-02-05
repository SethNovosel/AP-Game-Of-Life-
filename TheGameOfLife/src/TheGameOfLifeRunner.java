//Seth Novosel
public class TheGameOfLifeRunner 
{
public static void main(String[] args) 
{
Spaces[] space = new Spaces[10];
Player[] player = new Player[10];
Spinner.playerSpin();
//space[0] = new Retire();
player[0] = new Salary(0, 0);
for(int i = 0; i < 100; i++)
	{
	space[i].play();
	player[i].playerSalary();
	}
}
}
