#include "stack.h"
#include<stdio.h>
void display(int *arr, int top)
{
	int i;
	for(i=0;i<=top;i++)
	{
		printf("%d\n",arr[i]);
	}
}