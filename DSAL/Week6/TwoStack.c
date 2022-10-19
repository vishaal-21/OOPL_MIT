#include <stdio.h>
typedef struct 
{
    int arr[50];
    int top1, top2;
    int MaxSize;
}Stack;

void push(Stack *s, int stackno, int item)
{
    if (s->top1+1 == s->top2)
        printf("Stack Overflow");

    if (stackno == 1)
    {
        s->arr[++s->top1]=item;
        printf("Item %d Pushed on Stack 1 and top1 = %d\n", item, s->top1);
    }
    else
    {
        s->arr[--s->top2]=item;
        printf("Item %d Pushed on Stack 2 and top2 = %d\n", item, s->top2);
    }

}
int pop(Stack *s, int stackno)
{
    switch(stackno)
    {
        case 1: 
        if (s->top1==-1)
            return -1;
        printf("Item will be Popped from Stack 1 \n");
        return(s->arr[s->top1--]);

        case 2: 
        if (s->top2 == s->MaxSize)
            return -1;
        printf("Item will be Popped from Stack 2 \n");
        return(s->arr[s->top2++]);
        
        default: 
            return -1;
    }
}
void main()
{
    Stack st;
    st.MaxSize=10;
    st.top1 = -1;
    st.top2 = st.MaxSize; 
    push(&st,1,10);
    push(&st,1,20);
    push(&st,1,30);
    push(&st,2,40);
    push(&st,2,50);
    push(&st,2,60);
    printf("%d\n",pop(&st,1));
    printf("%d\n",pop(&st,1));
    printf("%d\n",pop(&st,2));
}