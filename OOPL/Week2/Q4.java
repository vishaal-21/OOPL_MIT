package Week2;

import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array dimension of matrix 1 : ");
		int m1=sc.nextInt();
		int n1=sc.nextInt();

		System.out.println("Enter array dimension of matrix 2 : ");
		int m2=sc.nextInt();
		int n2=sc.nextInt();

		if(m1==m2 && n1==n2)
		{
			int[][] a=new int[m1][n1];
			int[][] b=new int[m2][n2];

			System.out.println("Enter "+(m1*n1)+" matrix 1 elements : ");
			for(int i=0;i<m1;i++)
				for(int j=0;j<n1;j++)
					a[i][j]=sc.nextInt();

			System.out.println("Enter "+(m2*n2)+" matrix 2 elements : ");
			for(int i=0;i<m2;i++)
				for(int j=0;j<n2;j++)
					b[i][j]=sc.nextInt();

			System.out.println("Matrix 1 : ");
			for(int i=0;i<m1;i++)
			{
				for(int j=0;j<n1;j++)
					System.out.print(a[i][j]+" ");

				System.out.println();
			}

			System.out.println("Matrix 2 : ");
			for(int i=0;i<m2;i++)
			{
				for(int j=0;j<n2;j++)
					System.out.print(b[i][j]+" ");

				System.out.println();
			}
			
			int[][] sum=new int[m1][n1];

			System.out.println("Sum matrix : ");
			for(int i=0;i<m1;i++)
			{
				for(int j=0;j<n1;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}	
		}	
		else 
			System.out.println("Matrix addition not possible");
	}
}