#include<stdio.h>
#include<string.h>
typedef struct
{
      char arr[50];
      int top;
} Stack;
void push(Stack *s,char x)
{ 
      s->arr[++s->top]=x;
}
char pop(Stack *s)
{
      return s->arr[s->top--];
}
void main()
{
      Stack st;
      st.top=-1;
      int i;
      char s[50];
      printf("Enter string : ");
      gets(s);

      for(i=0;i<strlen(s);i++)
            push(&st,s[i]);

      int flag=0;
      for(i=0;i<strlen(s);i++)
      {
            char ch=pop(&st);
            if(ch!=s[i])
            {
                  flag=1;
                  break;
            }
      }

      if(flag==0)
            printf("Palindrome");
      else
            printf("Not Palindrome");
} 