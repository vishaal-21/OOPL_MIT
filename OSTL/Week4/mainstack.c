#include<stdio.h>
#include "stack.h"
void main()
{
	int n,choice,top=-1;
	printf("Enter maximum array size : ");
	scanf("%d",&n);

	int arr[n];

	while(2<3)
	{
		printf("1. Push\t");
		printf("2. Pop\t");
		printf("3. Display\t");
		printf("-1 to quit\n");
		printf("Enter choice : ");
		scanf("%d",&choice);

		if(choice==1)
		{
			int item;
			printf("Enter element : ");
			scanf("%d",&item);
			top=push(arr,n,top,item);
		}
		else if(choice==2)
		{
			top=pop(arr,top);
		}
		else if(choice==3)
		{
			display(arr,top);
		}
		else if(choice==-1)
			break;
	}
}