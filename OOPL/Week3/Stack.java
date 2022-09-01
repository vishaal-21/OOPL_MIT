import java.util.*;
class Stack
{
	int[] arr;
	int tos;

	void initialize(int n)
	{
		tos=-1;
		arr = new int[n];
	}

	void push(int item)
	{
		arr[++tos]=item;

		if(tos==arr.length)
			System.out.println("Stack Overflow");
	}

	int pop()
	{
		if(tos<0)
			System.out.println("Stack Underflow");

		return arr[tos--];
	}

	void display()
	{
		for(int i=tos;i>=0;i--)
			System.out.println(arr[i]);
	}
}

class Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack();

		System.out.print("Enter stack size : ");
		int n = sc.nextInt();

		s1.initialize(n);

		System.out.println("Push elements : ");
		for(int i=0;i<n;i++)
			s1.push(sc.nextInt());

		System.out.print("Pop how many elements : ");
		int p = sc.nextInt();

		for(int i=0;i<p;i++)
			System.out.print("\nPopped elements : "+s1.pop());

		System.out.println("\nStack is : ");
		s1.display();	
	}
}