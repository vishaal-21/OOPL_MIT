package Week2;

import java.util.*;
class Q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n=sc.nextInt();

		int[] a=new int[n];

		System.out.println("Enter "+a.length+" elements : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		System.out.print("Unsorted array : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.print("\nAscending sorted array : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.print("\nDescending sorted array : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}