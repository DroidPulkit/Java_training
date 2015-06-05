import java.util.Scanner;
class LeapYear {
	public static void main (String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Year to check whether is it a leap year or not");
		int year = sc.nextInt();
		if (year%400 == 0 || year%4 == 0 && year %100 != 0  )
		{
			System.out.println("The Year Entered is Leap Year");
		}
		else 
		{
			System.out.println("The Year entered is not a leap Year");
		}
		sc.close();
	}

}