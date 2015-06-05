import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int number = sc.nextInt();
		number = ((number%100)%10)*100 + ((number%100)/10)*10 + number/100;
		System.out.println("Reversing the digit: " + number);
		sc.close();
	}
}