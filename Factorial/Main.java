#include<stdio.h>
int main()
{ 
  int n,i;
  long int fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
   }
  printf("%ld",fact);
	//your code here
}