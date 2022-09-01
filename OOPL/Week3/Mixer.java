import java.util.*;
class Mixer
{
	int[] arr;
	Scanner sc = new Scanner(System.in);

	void accept(int n)
	{
		arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
	}

	Mixer mix(Mixer A)
	{
		Mixer R = new Mixer();
		int len = this.arr.length + A.arr.length;
		R.arr = new int[len];
		int i=0,j=0,k=0;

		while(i<this.arr.length && j<A.arr.length)
		{
			if(this.arr[i]<=A.arr[j])
			{
				R.arr[k] = this.arr[i];
				i++;k++;
			}
			else
			{
				R.arr[k] = A.arr[j];
				j++;k++;
			}
		}

		if(i<this.arr.length)
		{
			for(;i<this.arr.length;i++)
			{
				R.arr[k]=this.arr[i];
				k++;
			}
		}

		if(j<A.arr.length)
		{
			for(;j<A.arr.length;j++)
			{
				R.arr[k]=A.arr[j];
				k++;
			}
		}

		return R;
	}

	void display()
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}

class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Mixer P =  new Mixer();
		Mixer Q =  new Mixer();

		System.out.println("Enter first array size : ");
		int l1=sc.nextInt();
		System.out.println("Enter elements of first array in ascending order and no duplicates: ");
		P.accept(l1);

		System.out.println("Enter second array size : ");
		int l2=sc.nextInt();
		System.out.println("Enter elements of first array in ascending order and no duplicates: ");
		Q.accept(l2);

		Mixer R = P.mix(Q);

		System.out.print("Array 1 : ");
		P.display();

		System.out.print("\nArray 2 : ");
		Q.display();

		System.out.print("\nArray after merging : ");
		R.display();
	}
}