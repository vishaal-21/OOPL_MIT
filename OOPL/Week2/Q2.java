package Week2;

import java.util.*;
class Q2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n=sc.nextInt();

		int[] a=new int[n+1];

		System.out.println("Enter "+n+" elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		System.out.print("Array is : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

		System.out.print("\nEnter Element to be added : ");
		int ele=sc.nextInt();
		System.out.print("Enter position : ");
		int add=sc.nextInt();

		for(int i=n-1;i>=add;i--)
			a[i+1]=a[i];

		a[add]=ele;

		System.out.print("Array is : ");
		for(int i=0;i<n+1;i++)
			System.out.print(a[i]+" ");

		System.out.print("\nEnter position of element to be deleted (0-"+n+"): ");
		int del=sc.nextInt();

		for(int i=del;i<n;i++)
			a[i]=a[i+1];

		System.out.print("Array is : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}