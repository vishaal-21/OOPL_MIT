#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct
{
	char name[50];
	int rno;
	float cgpa;
}Student;

void read(Student *stu, int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("Enter the name of student %d : ",i+1);
        scanf("%s",stu[i].name);
        printf("Enter the rollno of student %d : ",i+1);
        scanf("%d",&stu[i].rno);
        printf("Enter the cgpa of student %d : ",i+1);
        scanf("%f",&stu[i].cgpa);
        printf("\n");
	}
}

void display(Student *stu, int n)
{
	int i;
	printf("Name \t Roll No. \t CGPA\n");
	for(i=0;i<n;i++)
	{
        printf("%s \t %d \t\t %.2f\n",(stu+i)->name,(stu+i)->rno,(stu+i)->cgpa);
	}
}

void sort(Student *stu, int n)
{
	Student temp;
	int i,j;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
            if(stu[j].rno>stu[j+1].rno)
            {
            	temp=stu[i];
            	stu[i]=stu[j];
            	stu[j]=temp;
            }
        }
    }
}

void main()
{
	int n,i;
	printf("Enter numbers of students : ");
	scanf("%d",&n);

	Student* stu = (Student*) malloc(n*sizeof(Student));

	read(stu,n);
	display(stu,n);
	sort(stu,n);
	display(stu,n);
	free(stu);
}