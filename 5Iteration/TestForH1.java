public class TestForH1
{
	public static void main(String[] args)
	{
		/* int number = 10;
		while(number > 0)
		for (initialize before; condition at top; manipulation at bottom)
		int is at the beginning before loop; number > 0 is at the beginning
		of each loop; and number-- is in the loop after the {} block */
		for(int number = 10; number > 0; number --) // always have 2 semicolons
		{
			System.out.println(number);
			// number--;
		}
		System.out.println("FIRE!");
	}
}