public class Pattern43
{
	public static void main(String Args[])
	{
		int a = 1;
		for(int i = 0; i<5; i++)
		{
			for(int j = 1; j<6; j++)
			{
				if(i<j)
				{
					break;
				}
				else
				{
					System.out.print(a + " ");
					a = a + 1;
				}
			}
			System.out.println();
		}
	}
}