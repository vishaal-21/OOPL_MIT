package Week1;

import java.util.*;
class Q1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter 3 numbers : ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();

		
		System.out.println("Largest number = " + largest(a,b,c));
	}
	static int largest(int x, int y, int z)
	{
		if(x>y && x>z)
			return x;
		else if(y>x && y>z)
			return y;
		else
		 	return z;
	}
}