// Caroline Hsu - 10/24/2020
/* This program will prompt the user to enter 10 values and the program must
detect the smallest integer value and the largest integer value. The program
will repeat the values back to the user. This program uses a do while loop. */
// import Scanner from API
import java.util.Scanner;
public class HiLoDoWhile
{
	public static void main(String[] args)
	{
		// declare variables and declare a variable of type Scanner
		Scanner input = new Scanner(System.in);
		int counter = 1;
		final int SERIES = 10;
		final int STEP = 1;
		int aNumber;
		int smallest;
		int largest;
		
		/* ask the user to print the first integer value and assign to smallest
		and largest value (because if the same number is entered it will be the 
		largest and smallest value) */
		System.out.print("Enter your first integer value: ");
		aNumber = input.nextInt();
		smallest = aNumber;
		largest = aNumber;
		
		// start do while loop
		do
		{
			// asks the user to input another value
			System.out.print("Please enter another value: ");
			aNumber = input.nextInt();
			/* if statement for if the new number entered is less than the smallest
			value (which was the first value entered) */
			if (aNumber < smallest)
			{
				// assign so that it is the new smallest value
				smallest = aNumber;
			}
			// else if statement for if the new number entered is greater than the
			// smallest value (the first entered value)
			else if (aNumber > largest)
			{
				// assign so it is the new largest value
				largest = aNumber;
			}
			// loop control variable adds one at the end until it hits the while loop
			counter = counter + STEP;
		} while (counter < SERIES); /* says it will continue loop until it is hits 
		the SERIES limit */
		// print the smallest and largest values for the user
		System.out.println("Your smallest value is: " + smallest);
		System.out.println("Your largest value is: " + largest);
		System.out.println("Bada bing bada boom!");
	}
}