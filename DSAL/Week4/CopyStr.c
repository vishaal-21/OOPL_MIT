#include<stdio.h>
#include<stdlib.h>
void copy(char str[], char s[],int i)
{
	if(str[i]=='\0')
		return;
	*(s+i)=*(str+i);
	copy(str,s,++i);
}
void main()
{
	int i=0;
	char str[50];
	char s[50];
	printf("Enter a sentence : ");
	gets(str);

	copy(str,s,i);

	printf("Copied string : %s\n",s);
}