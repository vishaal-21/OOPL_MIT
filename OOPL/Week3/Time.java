import java.util.*;
class Time
{
	int hours,minutes,seconds;
	void initialize(int h, int m, int s)
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
		Time t1 = new Time();
		Time t2 = new Time();

		System.out.println("Enter time 1 : ");
		System.out.print("Hours : ");
		t1.hours=sc.nextInt();
		System.out.print("Minutes : ");
		t1.minutes=sc.nextInt();
		System.out.print("Seconds : ");
		t1.seconds=sc.nextInt();

		t1.initialize(t1.hours,t1.minutes,t1.seconds);

		System.out.println("\nEnter time 2 : ");
		System.out.print("Hours : ");
		t2.hours=sc.nextInt();
		System.out.print("Minutes : ");
		t2.minutes=sc.nextInt();
		System.out.print("Seconds : ");
		t2.seconds=sc.nextInt();

		t2.initialize(t2.hours,t2.minutes,t2.seconds);

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