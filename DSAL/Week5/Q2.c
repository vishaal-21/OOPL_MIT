#include<stdio.h>
typedef struct
{
        int arr[50];
        int top;
}Stack;
void push(int x, Stack *s, int n)
{
        s->arr[++s->top]=x;
}
int pop(Stack *s)
{
        return s->arr[s->top--];
}
void DecToBin(Stack *s, int num)
{
        int rem, n=0;
        while(num!=0)
        {
                rem = num%2;
                n++;
                push(rem, s, n);
                num/=2;
        }
        while(s->top!=-1)
                printf("%d", pop(s));
        printf("\n");
}
void main()
{
        Stack st;
        st.top=-1;
        int num;
        printf("Enter an integer : ");
        scanf("%d",&num);
        printf("Binary Equivalent is : ");
        DecToBin(&st,num);
}