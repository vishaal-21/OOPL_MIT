#include<stdio.h>
int n,i;
void Reverse(int a[])
{
	int temp,j;
	for(i=0,j=n-1;i<n/2;i++,j--)
	{
		temp=*(a+i);
		*(a+i)=*(a+j);
		*(a+j)=temp;
	}
}
void main()
{
	printf("Enter array size : ");
	scanf("%d",&n);

	int a[n];

	printf("Enter %d elements : ",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);

	printf("Elements in order : ");
	for(i=0;i<n;i++)
		printf("%d ",*(a+i));

	Reverse(a);
	printf("\nElements in reverse : ");
	for(i=0;i<n;i++)
		printf("%d ",*(a+i));
}
