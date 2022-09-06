#include<stdio.h>
#include<stdlib.h>
int n,i;
int Smallest(int a[])
{
	int small=a[0];
	for(i=0;i<n;i++)
	{
		if(*(a+i)<small)
			small=*(a+i);
	}

	return small;
}
void main()
{
	printf("Enter array size : ");
	scanf("%d",&n);

	int *a=(int*)malloc(n*sizeof(int));

	if(a==NULL)
		printf("NO memory allocated\n");
	else
	{
		printf("Memory allocation done\n");
	

	printf("Enter %d elements : ",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);

	printf("Elements in order : ");
	for(i=0;i<n;i++)
		printf("%d ",*(a+i));

	printf("\nSmallest number = %d\n",Smallest(a));
}
}
