public class SumOfSeries
{
	public static void main(String Args[])
	{
		double a=1,b=1,sum=0;
		for (int i =0; i<9; i++)
		{
			
			sum = sum + (a/b);
			b =  b + 3;
		}
		System.out.println("Answer: " + sum);
	}
}