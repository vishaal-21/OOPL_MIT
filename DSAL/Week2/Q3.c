#include<stdio.h>
int* large(int *a,int *b)
{
	if(*a>*b)
		return a;
	else
		return b;
}
void main()
{
	int a,b;
	int *p=&a;
	int *q=&b;
	int **ptr=&q;


	printf("Enter 2 numbers : ");
	scanf("%d%d",p,q);


	int *p1=large(&a,&b);
	printf("Larger of the two = %d\n", *p1);
	printf("Value of b using variable = %d\n",b);
	printf("Value of b using pointer = %d\n",*q);
	printf("Value of b using pointer to pointer = %d\n",**ptr);
}
