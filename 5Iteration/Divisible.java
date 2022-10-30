/* Caroline Hsu - 10/18/2020
This program will calculate the number of integers in a range from 1 to a 
user-entered number that are divisible by 3, the sum of those integers, 
and the number and sum of the integers not divisible by 3.

Import scanner and define class
Declare variables 
Get the upper-bounds from user and print it
Start with while loop statement and the loop control variable (less than upper
bound)
Use if statement to check if number of integers divisible by 3 and then count
the numbers with adding one each time if statement is true and for sum, add 
loop control variable
Use the else statement to check the number of integers not divisible by 3 and
then count the numbers adding one for each time else statement is true and for
sum, add the loop control variable
Add 1 to loop control variable to repeat block until it hits the upper bound
Print the results */
// import scanner from API
import java.util.Scanner;
public class Divisible
{
	public static void main(String[] args)
	{
		// declare a variable of type Scanner and declare variables
		Scanner input = new Scanner(System.in);
		int upperBound;
		final int DIVISOR = 3;
		int step = 1;
		int x = 1;
		int divisibleCount = 0;
		int divisibleSum = 0;
		int nonDivisibleCount = 0;
		int nonDivisibleSum = 0;
		
		// prompt the user to enter an integer upper bound and read and print it
		System.out.print("Enter an integer upper bound: ");
		upperBound = input.nextInt();
		System.out.println("Your upper bound is: " + upperBound);
		
		// while loop - while x is less than or equal to the upper bound
		while(x <= upperBound)
		{
			// if the loop control variable is divisible by 3
			if(x % 3 == 0)
			{
				// calculates the number of integers divisible by 3 if if statement
				// is true
				divisibleCount = divisibleCount + step;
				// calculates the sum of integers divisible by 3 if if statement 
				// is true
				divisibleSum = divisibleSum + x;
			}
			else // if the loop control variable is not divisible by 3
			{
				// calculates the number of integers not divisible by 3
				nonDivisibleCount = nonDivisibleCount + step;
				// calculates the sum of integers not divisible by 3
				nonDivisibleSum = nonDivisibleSum + x;
			}
			/* adds the step of 1 to the loop control variable until it hits the 
			integer above the upper bound, then it stops and finishes the loop */
			x = x + step;
		}
		// display the number and sum of integers divisible by 3 and the number 
		// and sum of integers not divisible by 3
		System.out.println("The number of integers divisible by 3 are: " + 
												divisibleCount);
		System.out.println("The sum of integers divisible by 3 are: " + 
												divisibleSum);
		System.out.println("The number of integers not divisible by 3 are: " + 
												nonDivisibleCount);
		System.out.println("The sum of integers not divisible by 3 are: " + 
												nonDivisibleSum);
	}
}