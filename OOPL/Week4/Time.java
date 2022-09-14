import java.util.*;
class Time
{
	int hours,minutes,seconds;
	Time()
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	Time(int h, int m, int s)
	{
		hours = h;
		minutes = m;
		seconds = s;
	}
	

	void display()
	{
		System.out.println(hours+":"+minutes+":"+seconds);
	}

	Time sum(Time t1, Time t2)
	{
		Time add = new Time();
		add.hours = t1.hours + t2.hours;
		add.minutes = t1.minutes + t2.minutes;
		add.seconds = t1.seconds + t2.seconds;

		if(add.seconds>=60)
		{
			add.minutes++;
			add.seconds-=60;
		}
		if(add.minutes>=60)
		{
			add.hours++;
			add.minutes-=60;
		}

		return add;
	}

	Time subtract(Time t1, Time t2)
	{
		Time sub = new Time();
		sub.hours = t1.hours - t2.hours;
		sub.minutes = t1.minutes - t2.minutes;
		sub.seconds = t1.seconds - t2.seconds;
		
		if(sub.seconds<0)
		{
			sub.seconds+=60;
			sub.minutes--;
		}
		if(sub.minutes<0)
		{
			sub.minutes+=60;
			sub.hours--;
		}

		return sub;
	}

	void compare(Time t2)
	{
		if(this.hours>t2.hours)
			System.out.println("\nTime 1 is greater");
		else if(this.hours<t2.hours)
			System.out.println("\nTime 2 is greater");
		else if(this.hours==t2.hours)
		{
			if(this.minutes>t2.minutes)
				System.out.println("\nTime 1 is greater");
			else if(this.minutes<t2.minutes)
				System.out.println("\nTime 2 is greater");
			else if(this.minutes==t2.minutes)
			{
				if(this.seconds>t2.seconds)
					System.out.println("\nTime 1 is greater");
				else if(this.seconds<t2.seconds)
					System.out.println("\nTime 2 is greater");
				else if(this.seconds==t2.seconds)
					System.out.println("\nBoth times are equal");
			}
		}
	}
}

class Q2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter time 1 : ");
		System.out.print("Hours : ");
		int h1=sc.nextInt();
		System.out.print("Minutes : ");
		int m1=sc.nextInt();
		System.out.print("Seconds : ");
		int s1=sc.nextInt();

		System.out.println("\nEnter time 2 : ");
		System.out.print("Hours : ");
		int h2=sc.nextInt();
		System.out.print("Minutes : ");
		int m2=sc.nextInt();
		System.out.print("Seconds : ");
		int s2=sc.nextInt();

		Time t1 = new Time(h1,m1,s1);
		Time t2 = new Time(h2,m2,s2);

		System.out.println("\nTimes are : ");
		t1.display();
		t2.display();

		Time r1 = new Time();
		r1 = r1.sum(t1,t2);
		Time r2 = new Time();
		r2 = r2.subtract(t1,t2);

		System.out.println("\nSum of times = "); 
		r1.display();
		System.out.println("Difference of times = "); 
		r2.display();

		t1.compare(t2);
	}
}