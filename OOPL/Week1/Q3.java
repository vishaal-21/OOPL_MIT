package Week1;

import java.util.*;
class Q3
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter value of n and r in nCr : ");
		int n= sc.nextInt();
		int r= sc.nextInt();

		int ncr=fact(n)/(fact(r)*fact(n-r));
		System.out.println(n+"C"+r+" = "+ncr);

	}
	static int fact(int x)
	{
		if(x<2)
			return 1;
		else 
			return (x*fact(x-1));
	}
}