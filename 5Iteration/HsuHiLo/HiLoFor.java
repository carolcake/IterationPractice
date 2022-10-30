/* Caroline Hsu - 10/25/2020
This program will prompt the user to enter 10 values and the program must
detect the smallest integer value and the largest integer value. It will
repeat it back to the user. This program uses a for construct.
*/

// import scanner from API
import java.util.Scanner;
public class HiLoFor
{
	public static void main(String[] args)
	{
		// declare variables and Scanner that won't be included
		// in the for loop (everything but loop control variable)
		Scanner input = new Scanner(System.in);
		final int SERIES = 10;
		int aNumber;
		int smallest;
		int largest;
		
		// prompt the user to enter the first integer value and 
		// assign it to smallest and largest values
		System.out.print("Enter your first integer value: ");
		aNumber = input.nextInt();
		smallest = aNumber;
		largest = aNumber;
		
		/* start the for construct and declare the loop control 
		variable which is initializing; include the limit for 
		anything below the series for the condition; and add one 
		for the manipulation until it hits the series boundary */
		for(int counter = 1; counter < SERIES; counter++)
		{
			// ask the user for another value so it can be repeated
			// in the loop and sorted in if and else if conditionals
			System.out.print("Please enter another value: ");
			aNumber = input.nextInt();
			// if statement for if the value entered is smaller than
			// before, assign it as the new smallest number
			if (aNumber < smallest)
			{
				smallest = aNumber;
			}
			// else if statement for if the value entered is larger than
			// before, assign it as the new largest number
			else if (aNumber > largest)
			{
				largest = aNumber;
			}
		}
		// print the results for the user (smallest and largest numbers)
		System.out.println("Your smallest value is: " + smallest);
		System.out.println("Your largest value is: " + largest);
		System.out.println("Bada bing bada boom!");
	}
}