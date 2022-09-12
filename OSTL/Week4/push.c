#include "stack.h"
#include<stdio.h>
int push(int *arr, int n, int top, int item)
{
	if((top+1)>n)
	{
		printf("Stack Overflow\n");
		return top;
	}
	else
	{
		arr[++top]=item;
		return top;
	}
}