package week1.day1;

public class Isprime {

	public static void main(String[] args)
	{
		int n=3;
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("notprime");
				m=1;
				break;
			}
		}
			if(m==0)
			{
				System.out.println(" prime");
			}
			
		}

}


