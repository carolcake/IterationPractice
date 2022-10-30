// Caroline Hsu - 10/15/20
// this program will write all of the even numbers until 1000
public class TestWhileH2
{
	public static void main(String[] args)
	{
		// declare variables
		int even = 2;
		
		// create the loop for all even numbers between 0 and 1000 and print it
		// ignore 16, so use an if statement
		while(even < 1001)
		{
			if (even != 16)
			{
				System.out.println(even);
			}
			even = even + 2; // remember not to use numbers in your program
		}
	}
}