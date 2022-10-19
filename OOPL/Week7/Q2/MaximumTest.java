import myPackages.p1.Maximum;
import java.util.*;
public class MaximumTest
{
	public static void main(String[] args)
	{
		int a[]={0,6,2,9,14,23};
		int arr[][]={{0,7,2},{1,7,12,9},{12,10,11}};

		System.out.println("Maximum of 12,23,34 = "+Maximum.max(12,23,34));
		System.out.println("Maximum of 23.45,12.67,22.4 = "+Maximum.max(23.45,12.67,22.4));
		System.out.println("Maximum of [0,6,2,9,14,23] = "+Maximum.max(a));
		System.out.println("Maximum of [{0,7,2},{1,7,12,9},{12,10,11}] = "+Maximum.max(arr));
	}
}