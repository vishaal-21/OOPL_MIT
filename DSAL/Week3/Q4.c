#include<stdio.h>
#include<stdlib.h>

typedef struct
{
	int day;
	int month;
	int year;
} DOB;

typedef struct
{
	int reg_no;
	char name[50];
	char address[50];
} STU_INFO;

typedef struct
{
	char college_name[50];
	char university_name[50];
} COLLEGE;

typedef struct
{
	DOB d;
	STU_INFO in;
	COLLEGE c;
} STUDENT;

void read(STUDENT* stu, int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("Student %d\n",i+1);
		printf("Enter DATE of birth : ");
		scanf("%d",&(stu+i)->d.day);
		printf("Enter MONTH of birth : ");
		scanf("%d",&(stu+i)->d.month);
		printf("Enter YEAR of birth : ");
		scanf("%d",&(stu+i)->d.year);
		printf("\nEnter registration number : ");
		scanf("%d",&(stu+i)->in.reg_no);
		printf("Enter name : ");
		scanf("%s",(stu+i)->in.name);
		printf("Enter address : ");
		scanf("%s",(stu+i)->in.address);
		printf("Enter college name : ");
		scanf("%s",(stu+i)->c.college_name);
		printf("Enter university name : ");
		scanf("%s",(stu+i)->c.university_name);
	}
}

void display(STUDENT* stu, int n)
{
	int i;
 	printf("DOB \t Registration \t Name \t Address\t College Name \t University Name\n");

 	for(i=0;i<n;i++)
 	{
 		printf("%d-%d-%d \t %d \t %s \t %s \t %s \t\t %s\n",(stu+i)->d.day,
 			(stu+i)->d.month,(stu+i)->d.year,(stu+i)->in.reg_no,
 			(stu+i)->in.name,(stu+i)->in.address,
 			(stu+i)->c.college_name,(stu+i)->c.university_name);
 	}
}

void main()
{
	int n;
	printf("Enter number of students : ");
	scanf("%d",&n);

	STUDENT* stu = (STUDENT*) malloc(n*sizeof(STUDENT));

	read(stu,n);
	display(stu,n);
} 