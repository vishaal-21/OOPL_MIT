import java.util.*;
class Person
{
	private String name;
	private GregorianCalendar dob;

	Person(String n, GregorianCalendar DOB)
	{
		name = n;
		dob = DOB;
	}
	String getName()
	{
		return name;
	}
	GregorianCalendar getDOB()
	{
		return dob;
	}
}

class College_Graduate extends Person
{
	private double gpa;
	private int gradyear;

	College_Graduate(String name,GregorianCalendar dob, double gpa, int year)
	{
		super(name,dob);
		this.gpa = gpa;
		gradyear = year;
	}
	void display()
	{
		System.out.println("\n\t-->Name : " + getName());
		System.out.println("\t-->DOB : " + getDOB().get(Calendar.DATE)+"/"+(getDOB().get(Calendar.MONTH)+1)+"/"+getDOB().get(Calendar.YEAR));
        System.out.println("\t-->GPA : " + gpa);
        System.out.println("\t-->Graduation Year : " + gradyear);
	}
}

class Q1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Name : ");
		String name = sc.nextLine();

		System.out.print("Enter DOB (yyyy/mm/dd) : ");
		GregorianCalendar dob = new GregorianCalendar(sc.nextInt(),sc.nextInt()-1,sc.nextInt());

		System.out.print("GPA : ");
		double gpa = sc.nextDouble();

		System.out.print("Year of graduation : ");
		int year = sc.nextInt();

		College_Graduate cg = new College_Graduate(name,dob,gpa,year);
		cg.display();
	}
}