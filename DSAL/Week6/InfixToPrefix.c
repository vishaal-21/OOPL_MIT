#include<stdio.h>
#include<string.h>
typedef struct
{
	char arr[50];
	int top;
}Stack;
void push(Stack *s,char x,int n)
{
	s->arr[++s->top]=x;
}
char pop(Stack *s)
{
	return(s->arr[s->top--]);
}
void peek(Stack *s)
{
	s->top--;
}
int precedence(char ele)
{
    switch(ele)
    {
    case '+':
    case '-':
        return 1;

    case '*':
    case '/':
        return 2;

    case '^':
        return 3;
    }
    return -1;
}
void main()
{
	Stack st;
	char infix[50],prefix[50],ch;
	st.top=-1;
	int i,k=0;
	printf("Enter infix expression : ");
	gets(infix);

	int len=strlen(infix);
	push(&st,'#',len);

	for(i=strlen(infix)-1;i>=0;i--)
    {
        ch=infix[i];
        switch(ch)
        {
        case ')':
            push(&st,ch,len);
            break;

        case '(':
            while(st.arr[st.top]!=')')
                prefix[k++]=pop(&st);
            peek(&st);
            break;

        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
            while(precedence(st.arr[st.top])>precedence(ch))
            {
                prefix[k++]=pop(&st);
            }
            push(&st,ch,len);
            break;
        default:
            prefix[k++]=ch;
        }
    }

    while(st.arr[st.top]!='#')
        prefix[k++]=pop(&st);

    prefix[k]='\0';

    printf("Prefix expression is : ");
    for(i=strlen(prefix)-1;i>=0;i--)
        printf("%c",prefix[i]);
}