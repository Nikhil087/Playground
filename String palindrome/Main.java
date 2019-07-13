#include<stdio.h>
int main()
{
  //Type your code here
  char s[30];
  scanf("%s",&s);
  int i,flag=0;
  for(i = 0; s[i] != '\0'; ++i);
  int len = i;
  int temp = len-1;
  for(int i = 0;i<len;i++)
  {
  if(s[i] != s[temp])
  {
  flag = 1;
    break;
  }
    else
    {
    temp--;
    }
  }
  if(flag == 0 )
  {
  printf("%s is a palindrome",s );
  }
  else
  {
  printf("%s is not a palindrome",s);
  }
  return 0;
  
}