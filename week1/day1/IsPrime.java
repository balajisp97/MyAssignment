package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 13;
		boolean prime =true;
		
		for (int i = 2; i < n; i++) 
		{
			if(n%i==0)
			{
					prime = false;
					break;
				
			}
		}
			if(prime == true)
			{
				System.out.println(n +" is a prime");
				
			}
			else 
			{
				System.out.println(n + " is a not prime");
				
			}
		}

	}


