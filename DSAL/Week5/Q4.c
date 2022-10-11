#include<stdio.h>
typedef struct
{
      int arr[50];
      int top;
} Stack;
void push(Stack *s,int x)
{ 
      s->arr[++s->top]=x;
}
int pop(Stack *s)
{
      return s->arr[s->top--];
}
void display(Stack *s)
{
        int i;
        for(i=0;i<=s->top;i++)
                printf("%d ",s->arr[i]);
}
void main()
{
        Stack st;
        st.top=-1;
        int i,n,k;

        printf("Enter array size : ");
        scanf("%d",&n);

        int a[n];
        printf("Enter elements : ");
        for(i=0;i<n;i++)
                scanf("%d",&a[i]);

        printf("Enter a number (<%d) to remove elements : ",n);
        scanf("%d",&k);

        for (int i=0;i<n;i++) 
        {
                int j=k;
                while(i<k) 
                        push(&st,a[i++]);

                int count=0;
                while(j>0)
                {
                        if(st.arr[st.top]<a[i])
                        {
                                pop(&st);
                                j--;
                                count++;
                        }
                        else if(st.arr[st.top]>a[i])
                        {
                                push(&st,a[i]);
                                break;
                        }
                }
                if(count==k)
                {
                        while(i<n)
                                push(&st,a[i++]);

                        break;
                }
        }
        display(&st);
}