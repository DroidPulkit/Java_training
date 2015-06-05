public class Pattern41
{
	public static void main(String Args[])
	{
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
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}