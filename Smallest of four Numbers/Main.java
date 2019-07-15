#include<stdio.h>

int main()
{
  int a,b,c,d;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  if(a<b&&a<c&&a<d)
    printf("%d",a);
  else if(b<a&&b<c&&b<d)
    printf("%d",b);
  else if(c<b&&c<a&&c<d)
    printf("%d",c);
  else
    printf("%d",d);
  // Type your code here
}