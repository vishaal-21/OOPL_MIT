//WORK IN PROGRESS

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
        for(i=s->top;i>=0;i--)
                printf("%d ",s->arr[s->top]);
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

        for (int i=0; i<k; i++)
                push(&st,a[i]);

        display(&st);

        for(i=k;i<n;i++)
        {
                if(st.arr[i]>st.arr[st.top])
                        pop(&st);
        }
}