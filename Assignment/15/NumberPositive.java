import java.util.Scanner;
class NumberPositive {
	public static void main (String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number to check wheather is it positive or not");
		int number = sc.nextInt();
		if (number >= 0)
		{
			System.out.println("The Number Entered is Positive");
		}
		else 
		{
			System.out.println("The number entered is negative");
		}
		sc.close();
	}

}