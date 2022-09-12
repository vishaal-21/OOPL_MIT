#include "stack.h"
#include<stdio.h>
int pop(int *arr, int top)
{
	if(top==-1)
	{
		printf("Stack Underflow\n");
		return top;
	}
	else
	{
		return --top;
	}
}