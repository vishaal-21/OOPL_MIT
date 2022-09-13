#include<stdio.h>

typedef struct
{
	float real;
	float img;
}COMPLEX;

void sum(COMPLEX c1, COMPLEX c2)
{
	COMPLEX sum;

	sum.real=c1.real+c2.real;
	sum.img=c1.img+c2.img;
	printf("Sum = %.2f + %.2fi\n",sum.real,sum.img);
}

void mul(COMPLEX c1, COMPLEX c2)
{
	COMPLEX mul;

	mul.real=(c1.real*c2.real)-(c1.img*c2.img);
	mul.img=(c1.real*c2.img)+(c1.img*c2.real);
	printf("Multiplication = %.2f + %.2fi\n",mul.real,mul.img);
}
void sub(COMPLEX c1, COMPLEX c2)
{
	COMPLEX sub;

	sub.real=c1.real-c2.real;
	sub.img=c1.img-c2.img;
	
	printf("Difference = %.2f + %.2fi\n",sub.real,sub.img);
}

void main()
{
	COMPLEX c1,c2;

	printf("Enter real and imaginary part of first complex number : \n");
	scanf("%f%f",&c1.real,&c1.img);

	printf("Enter real and imaginary part of second complex number : \n");
	scanf("%f%f",&c2.real,&c2.img);

	printf("Numbers are = \n");
	printf("%.2f + %.2fi\n",c1.real,c1.img);
	printf("%.2f + %.2fi\n",c2.real,c2.img);

	sum(c1,c2);
	mul(c1,c2);
	sub(c1,c2);
}