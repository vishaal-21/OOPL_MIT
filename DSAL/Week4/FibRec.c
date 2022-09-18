#include<stdio.h>
int fibo(int x)
{
	if(x==0 || x==1)
		return x;

	else
		return(fibo(x-1) + fibo(x-2));
}
void main()
{
	int n,i;
	printf("Enter number of terms : ");
	scanf("%d",&n);

	printf("Fibonacci series is \n");
	for(i=0;i<n;i++)
		printf("%d",fibo(i));
}