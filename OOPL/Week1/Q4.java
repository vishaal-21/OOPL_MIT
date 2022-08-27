package Week1;

import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number of prime numbers to be displayed : ");
		int n=sc.nextInt();

		System.out.println("First "+n+" prime numbers are : ");

		for(int i=1,primecount=0;primecount<n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				primecount++;
			}
		}
	}
	static boolean isPrime(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
			if(x%i==0)
				count++;
		
		if(count==2)
			return true;
		else 
			return false;
	}
}