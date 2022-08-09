package flowcharts;

public class Boolean {
	
	public int one;
	public int two;
	public boolean yh;
	
	
	public void method1(int one, int two, boolean yh)
	{
		if (yh == true)
		{
			 one = one + two;
			 System.out.print(one);
		}
		else {
			one = one * two;
			System.out.print(one);
		}
		
		
	}
	
	
	public void project(int one)
	{
		if(one > 2000)
		{	
		 System.out.println("A");
		if (one > 6000)
		{
			System.out.println("C");
		}
		
		else {
			System.out.println("B");
			
			if (one > 4000)
			{
				System.out.println("D");
				
				}
			else {
				System.out.println("E");
			}
		}
		}	
		
		else
		{
			System.out.println("1");
			if (one >100)
			{
				System.out.println("3");
			
			}
			else {
				System.out.println("2");
				if (one> 600)
				{
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (one > 500)
					{
						System.out.println("6");
					}
					
					else
					{
						System.out.println("7");
					}
				}
			}
		}
		
		
		
	}
}
