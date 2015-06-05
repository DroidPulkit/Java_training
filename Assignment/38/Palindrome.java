import java.util.Scanner;
public class Palindrome
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be reversed");
		int number = sc.nextInt();
		int temp,reverse=0;
		temp = number;
		while(temp != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + temp%10;
			temp = temp/10;
		}
		
		if (reverse == number)
		{
			System.out.println("The number entered is palindrome");
		}
		else
		{
			System.out.println("The number entered is not a palindrome");
		}
		sc.close();
	}
}