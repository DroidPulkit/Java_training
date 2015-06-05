import java.util.Scanner;
public class Arithmetic
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st Operand");
		int number1 = sc.nextInt();
		System.out.println("Enter the 2nd Operand");
		int number2 = sc.nextInt();
		int add, sub, mul, div;
		add = number1 + number2;
		sub = number1 - number2;
		mul = number1 * number2;
		div = number1 / number2;
		System.out.println("Adding the two number: " + add);
		System.out.println("Subtracting the two number: " + sub);
		System.out.println("Multiplying the two number: " + mul);
		System.out.println("Dividing the two number: " + div);
		sc.close();
	}
} 