#include <stdio.h>
void towerOfHanoi(int n, char from, char to, char aux)
{
    if (n == 1)
    {
        printf("\n Move disk 1 from rod %c to rod %c", from, to);
        return;
    }
    towerOfHanoi(n-1, from, aux, to);
    printf("\n Move disk %d from rod %c to rod %c", n, from, to);
    towerOfHanoi(n-1, aux, to, from);
}
 
void main()
{
    int n;
    printf("Enter number of discs : ");
    scanf("%d",&n);

    towerOfHanoi(n,'A', 'C', 'B');
}