import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal amount: ");
		double principal = sc.nextFloat();
		System.out.println("Enter the Rate of Interest: ");
		double rate = sc.nextFloat();
		System.out.println("Enter the Time: ");
		double time = sc.nextFloat();
		double simpleInterest;
		simpleInterest = (principal * rate * time)/ 100;
		System.out.println("The Simple Interest is: "  + simpleInterest);
	}
}