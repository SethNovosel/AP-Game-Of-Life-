//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
{
static int location = 0;
public static void main(String[] args) 
{
int spin = Spinner.playerSpin();
Spaces.fillSpaces();
//System.out.println("You are at " + Spaces.spaces.get(location).getName());
move(spin);
}
public static void move(int s)
{
Scanner userInput = new Scanner(System.in);
System.out.println("You landed on " + Spaces.spaces.get(location).getName());
location += s;
System.out.println("You landed on " + Spaces.spaces.get(location).getName());
String answer = userInput.nextLine();
if(answer == "")
	{
	Spinner.playerSpin();
	System.out.println("You landed on " + Spaces.spaces.get(location).getName());
	//location = Spinner.spin;
	location++;
	}
}
}
