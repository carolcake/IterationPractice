import java.util.Scanner;
public class TestDoWhileH1
{
	public static void main(String[] args)
	{
		char answer;
		Scanner mirror = new Scanner(System.in); 
		do 
		{
			System.out.println("You are so beautiful");
			System.out.print("Again? (Y/N): ");
			answer = mirror.nextLine().charAt(0); // reads first character of
			// line/string, if you enter "yes" it will read y
			// the 0 is the position it reads
		} while((answer == 'Y') || (answer == 'y')); // need semicolon
		System.out.println("Thank you for using this digital magic mirror!");
	}
}