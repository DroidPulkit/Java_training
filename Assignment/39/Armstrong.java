import java.util.Scanner;
public class Armstrong
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check if is a Armstrong number");
		int number = sc.nextInt();
		int temp,number2;
		temp = number;
		int ans = 0;
		while(temp != 0)
		{
			
			number2 = temp%10;
			ans = ans + (number2 * number2 * number2);
			temp = temp /10;
		}
		if(ans == number)
		{
			System.out.println("The number is a Armstrong number");
		}
		else
		{
			System.out.println("The number is not a Armstrong number");
		}
	}
}