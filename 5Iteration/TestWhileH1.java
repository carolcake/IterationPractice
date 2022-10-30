import java.util.Scanner;
public class TestWhileH1
{
	public static void main(String[] args)
	{
		// loop control variable
		int x = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Ready to lift off? ");
		input.nextLine();
		// no semicolon, same as if else statements
		// will repeat the line 
		// control c (especially for mac) stops an infinite loop
		// this means when x does not equal 0
		// will not print the 0, but 10 to 1
		while(x!=0)
		{
			/* this part prints the x variable, starting off with 10
			and counts down until it hits the 1 because it's the closest 
			integer to 0 */
			System.out.println(x); 
			x = x - 1;
		}
		System.out.println("Lift off... Lift off... we have a lift off!");
	}
}