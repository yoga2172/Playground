#include <stdio.h>
int main()
{
  int b,e,ans=1,i;
  scanf("%d%d",&b,&e);
  if(e>=0)
  {
  for(i=1;i<=e;i++)
  {
  ans=ans*b;
  }
    printf("%d",ans);
  }
  else
    printf("Wrong input");
  	//Your code here       
    return 0;
}