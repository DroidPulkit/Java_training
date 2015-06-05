public class Pattern42
{
	public static void main(String Args[])
	{
		int a = 0;
		for(int i = 0; i<6; i++)
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
				}
			}
			a = a + 1;
			System.out.println();
		}
	}
}