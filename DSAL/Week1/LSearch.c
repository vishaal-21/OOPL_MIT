#include<stdio.h>
void LSearch(int a[],int n,int ele,int pos)
{
    int i;
    pos=-1;
    for(i=0;i<n;i++)
    {
        if(a[i]==ele)
        {
            pos=i;
            break;
        }
    }

    if(pos!=-1)
        printf("Element found at position %d",pos);
    else
        printf("Element not found");
}
void main()
{
    int n,i,ele,pos=-1;

    printf("Enter array size : ");
    scanf("%d",&n);

    int a[n];

    printf("Enter %d numbers : \n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);

    printf("Numbers are : ");
    for(i=0;i<n;i++)
        printf("%d ",a[i]);

    printf("\nEnter element to be searched : ");
    scanf("%d",&ele);

    LSearch(a,n,ele,pos);
}

