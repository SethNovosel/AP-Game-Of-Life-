//Seth Novosel
import java.util.Scanner;
public class TheGameOfLifeRunner 
{
static int location = 0;
public static void main(String[] args) 
{
int spin = Spinner.playerSpin();
Spaces.fillSpaces();
move(spin);
}
public static void move(int s)
{
for(int i = 0; i < Spaces.spaces.size(); i++)
{
System.out.println("You landed on " + Spaces.spaces.get(location).getName());
location += s;
}
Scanner userInput = new Scanner(System.in);
String answer = userInput.nextLine();
if(answer == "")
	{
	Spinner.playerSpin();
	System.out.println("You landed on " + Spaces.spaces.get(location).getName());
	//location = s;
	location++;
	}
}
}
