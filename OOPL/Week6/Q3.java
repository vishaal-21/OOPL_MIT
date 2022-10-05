import java.util.*;
abstract class Figure
{
	float a,b;
	abstract double area(float a, float b);
	void print()
	{
		System.out.println("ABSTRACT CLASS");
	}
}

class Rectangle extends Figure
{
	double area(float a, float b)
	{
		return (a*b);
	}
	void print()
	{
		System.out.println("RECTANGLE");
	}

}

class Triangle extends Figure
{
	double area(float a, float b)
	{
		return (a*b)/2.0;
	}
	void print()
	{
		System.out.println("TRIANGLE");
	}

}

class Square extends Figure
{
	double area(float a, float b)
	{
		return (a*b);
	}
	void print()
	{
		System.out.println("SQUARE");
	}

}

class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;

		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Square s = new Square();

		Figure f;
		f=r;
		System.out.print("Enter rectangle dimensions : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area : "+f.area(a,b));
		f.print();

		f=t;
		System.out.print("\nEnter triangle dimensions : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area : "+f.area(a,b));
		f.print();

		f=s;
		System.out.print("\nEnter square dimension : ");
		a=sc.nextInt();
		System.out.println("Area : "+f.area(a,a));
		f.print();
	}
}