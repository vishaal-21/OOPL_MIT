import java.util.*;
class Bank
{
	String name,type;
	long acc_no;
	double balance;
	static float rate;

	Bank()
	{
		name=null;
		type=null;
		acc_no=0l;
	 	balance=20000;
		rate=5.0f;
	}
	Bank(String n, String t, long acc)
	{
		name=n;
		type=t;
		acc_no=acc;
		balance=20000;
		rate=5.0f;
	}

	void deposit(double dep)
	{
		balance+=dep;
	}

	void withdraw(double wd)
	{
		if(balance<wd)
			System.out.println("Not enough balance : ");
		else 
			balance-=wd;
	}

	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Account Number : " +acc_no);
		System.out.println("Account Type : "+type);
		System.out.println("Balance : "+balance);
		System.out.println("Rate of interest : "+rate);
	}

	static void display_rate()
	{
		System.out.println("Rate of interest is : "+rate);
	}
}

class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the following details : ");
		System.out.print("Name : ");
		String name=sc.next();
		System.out.print("Account number : ");
		long number=sc.nextLong();
		System.out.print("Account type : ");
		String type=sc.next();

		Bank b = new Bank(name,type,number);

		while(true)
		{
			System.out.println("\nEnter your choice : ");
			System.out.println("1. Deposit ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Display details ");
			System.out.println("4. Display rate of interest ");
			System.out.println("-1 to quit ");
			int choice =  sc.nextInt();

			if(choice==1)
			{
				System.out.println("Enter amount to be deposited : ");
				double dep=sc.nextDouble();
				b.deposit(dep);
			}
			else if(choice==2)
			{
				System.out.println("Enter amount to be withdrawn : ");
				double wd=sc.nextDouble();
				b.withdraw(wd);
			}
			if(choice==3)
				b.display();
			if(choice==4)
				Bank.display_rate();
			if(choice==-1)
			{
				System.out.println("Thank You");
				break;
			}
		}
	}
}