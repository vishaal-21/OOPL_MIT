import java.util.*;
class Q4
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number : ");
		long n =sc.nextLong();
		String str=Long.toString(n);
		String out="";

		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			if(count==3)
			{
				count=0;
				out=','+out;
			}
			count++;
			out=ch+out;
		}
		System.out.println("Modified string : "+out);
	}
}