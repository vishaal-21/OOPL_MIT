#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct
{
    char str[50][50];
    int front, rear, size;
}Queue;
void insertcq(Queue* q)
{
    char item[50];

    if((q->front==0 && q->rear==q->size-1) || (q->front==q->rear+1))
        printf("Queue is full");
    else
    {
        if(q->front==-1)
            q->front=0;

        printf("Enter string : ");
        scanf("%s",&item);

        q->rear=(q->rear+1)%q->size;
        strcpy(q->str[q->rear],item);
    }
}
void deletecq(Queue* q)
{
    if(q->front==-1)
        printf("Queue is empty");
    else
    {
        if(q->front==q->rear)
        {
            q->front=-1;
            q->rear=-1;
        }
        else
            q->front=(q->front+1)%q->size;
    }
}
void displaycq(Queue* q)
{
    int i;

    printf("\nQueue is:\n");
    for(i=q->front; i!=q->rear; i=(i+1)%(q->size))
        printf("%s\n",q->str[i]);
    printf("%s\n",q->str[i]);
}
void main()
{
    Queue q;
    q.front=-1;q.rear=-1;
    int choice,n;

    printf("Enter max queue size : ");
    scanf("%d",&n);
    q.size=n;

    printf("1. Enqueue\t2. Dequeue\t3. Display\t0. Stop");

    do
    {
        printf("\nEnter choice : ");
        scanf("%d",&choice);

        if(choice==1)
            insertcq(&q);
        else if(choice==2)
            deletecq(&q);
        else if(choice==3)
            displaycq(&q);
    }while(choice!=0);
}
