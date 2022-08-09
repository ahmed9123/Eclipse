package flowcharts;

public class Iterations {
	

	
	public void flow1(int a)
	{
		for (a = 100; a < 200; a++ )
		{
			if (a < 200)
			{
				System.out.println("A");
			}
			else
			{
				break;
			}
		}
	}
	
	public void flow2(int a)
	{
		for (a =100; a <= 200; a++)
		{
			
			if (a%2 == 0)
			{
				System.out.println("-");
			}
			else
			{
				System.out.println("*");
			}
		}
	}

}
