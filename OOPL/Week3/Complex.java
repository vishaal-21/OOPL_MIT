import java.util.*;
class Complex
{ 
	double real, img;
	void initialize(double a, double b)
	{
		real = a;
		img = b;
	}

	void display()
	{
		System.out.println(real+" + i"+img);
	}

	Complex add(Complex c1, Complex c2)
	{
		Complex add = new Complex();
		add.real = c1.real + c2.real;
		add.img = c1.img + c2.img;

		return add;
	}

	Complex subtract(Complex c1, Complex c2)
	{
		Complex sub = new Complex();
		if(c1.img<c2.img)
		{
			sub.img=Math.abs(c1.img-c2.img);
			c1.real--;
		}
		else 
			sub.img=c1.img-c2.img;

		sub.real=c1.real-c2.real;

		return sub;
	}
}

class Q1
{
	public static void main(String[] args)
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter real part for first number : ");
		c1.real=sc.nextDouble();

		System.out.print("Enter imaginary part for first number : ");
		c1.img=sc.nextDouble();

		System.out.print("\nEnter real part for second number : ");
		c2.real=sc.nextDouble();

		System.out.print("Enter imaginary part for second number : ");
		c2.img=sc.nextDouble();

		c1.initialize(c1.real,c1.img);
		c2.initialize(c2.real,c2.img);

		System.out.println("\nNumbers are : ");
		c1.display();
		c2.display();

		Complex r1 = new Complex();
		r1 = r1.add(c1,c2);
		Complex r2 = new Complex();
		r2 = r2.subtract(c1,c2);

		System.out.println("\nSum of numbers = "+r1.real+" +i"+r1.img);
		System.out.println("Difference of numbers = "+r2.real+" +i"+r2.img);
	}
}