#include<stdio.h>
#include<stdlib.h>

typedef struct
{
	int day;
	int month;
	int year;
} Date;

typedef struct
{
	int house_no;
	int zipcode;
	char state[50];
} Address;

typedef struct 
{
	Date d;
	Address a;
	char name[50];
} Employee;

void read(Employee* e,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("\nEnter name of employee %d : ",i+1);
		scanf("%s",(e+i)->name);
		printf("\nEnter DATE of birth : ");
		scanf("%d",&(e+i)->d.day);
		printf("Enter MONTH of birth : ");
		scanf("%d",&(e+i)->d.month);
		printf("Enter YEAR of birth : ");
		scanf("%d",&(e+i)->d.year);
		printf("\nEnter House Number : ");
		scanf("%d",&(e+i)->a.house_no);
		printf("Enter zipcode : ");
		scanf("%d",&(e+i)->a.zipcode);
		printf("Enter State name : ");
		scanf("%s",(e+i)->a.state);
	}
}

void display(Employee* e,int n)
{
	int i;
	printf("Name \t Date Of Birth \t Address\n");
	for(i=0;i<n;i++)
	{
		printf("%s\t%d-%d-%d\t%d-%d-%s\n",(e+i)->name,
			(e+i)->d.day,(e+i)->d.month,(e+i)->d.year,
			(e+i)->a.house_no,(e+i)->a.zipcode,(e+i)->a.state);
	}
}

void main()
{
	int n;
	printf("Enter number of employees : ");
	scanf("%d",&n);

	Employee* emp = (Employee*) malloc(n*sizeof(Employee));

	read(emp,n);
	display(emp,n);
}