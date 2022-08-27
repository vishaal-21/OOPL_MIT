#include<stdio.h>
double Add(double a[],int n)
{
    double sum=0; int i;

    for(i=0;i<n;i++)
        sum+=a[i];

    return sum;
}
void main()
{
    int n,i;

    printf("Enter array size : ");
    scanf("%d",&n);

    double a[n];

    printf("Enter %d numbers : \n",n);
    for(i=0;i<n;i++)
        scanf("%lf",&a[i]);

    printf("Numbers are : ");
    for(i=0;i<n;i++)
        printf("%lf ",a[i]);

    printf("\nSum of elements = %lf", Add(a,n));
}

