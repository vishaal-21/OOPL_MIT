import java.util.*;
class Complex
{ 
	double real, img;
	Complex()
	{
		real = 0;
		img = 0;
	}
	Complex(double a , double b)
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
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter real part for first number : ");
		double r1=sc.nextDouble();

		System.out.print("Enter imaginary part for first number : ");
		double i1=sc.nextDouble();

		System.out.print("\nEnter real part for second number : ");
		double r2=sc.nextDouble();

		System.out.print("Enter imaginary part for second number : ");
		double i2=sc.nextDouble();

		Complex c1 = new Complex(r1,i1);
		Complex c2 = new Complex(r2,i2);

		System.out.println("\nNumbers are : ");
		c1.display();
		c2.display();

		Complex a = new Complex();
		a = a.add(c1,c2);
		Complex s = new Complex();
		s = s.subtract(c1,c2);

		System.out.println("\nSum of numbers = "+a.real+" +i"+a.img);
		System.out.println("Difference of numbers = "+s.real+" +i"+s.img);
	}
}