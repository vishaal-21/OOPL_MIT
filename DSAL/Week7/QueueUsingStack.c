#include <stdio.h>
#include <stdlib.h>
typedef struct
{
    int arr[10];
    int top,size;
} Stack;

void push(Stack *s,int x)
{
    s->arr[++s->top] = x;
}

int pop(Stack *s)
{
    return s->arr[s->top--];
}
void display(Stack* s)
{
    int i;
    printf("Queue is : ");
    for(i=0;i<s->top;i++)
        printf("%d\n",s->arr[i]);
}
int main()
{
    Stack s1;
    Stack s2;
    s1.top = -1;
    s2.top = -1;

    int choice,n,item;
    printf("Enter max queue size : ");
    scanf("%d",&n);

    s1.size=s2.size=n;
    printf("\n1. Enqueue\t2. Dequeue\t3.Display\t0. Exit\n");
    do
    {
        printf("Enter choice : ");
        scanf("%d",&choice);

        if (choice == 1)
        {
            printf("Enter number : ");
            scanf("%d",&item);
            push(&s1,item);
        }
        else if (choice == 2)
        {
            if (s2.top == -1)
            {
                while (s1.top != -1)
                {
                    push(&s2,pop(&s1));
                }
            }
            printf("Number dequeued: %d",pop(&s2));
        }
        else if(choice==3)
            display(&s2);
    } while (choice != 0);
}
