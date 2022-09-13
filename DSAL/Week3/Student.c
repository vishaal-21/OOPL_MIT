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
        printf("%s \t %d \t\t %.2f\n",stu[i].name,stu[i].rno,stu[i].cgpa);
	}
}

void sort(Student *stu, int n)
{
	int i,j;
	for(i=0;i<n-1;i++)
	{
		int pos=i;
		for(j=i+1;j<n;j++)
		{
            if(stu[j].rno>stu[j+1].rno)
                position=j;
        }

        if(position!=i)
        {
			temp=stu[j].rno;
			stu[j].rno=stu[j+1].rno;
			stu[j+1].rno=s;

			temp1=stu[j].cgpa;
			stu[j].cgpa=stu[j+1].cgpa;
			stu[j+1].cgpa=s;

			temp3 = stu[j].name;
			stu[j].name = stu[j+1].name;
			stu[j+1].name = temp3;
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