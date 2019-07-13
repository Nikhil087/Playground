#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
  char ch[100];
  scanf("%[^\n]s",&ch);
  int len = strlen(ch);
  char temp;
  int p = 0,flag;
  for(int i = 0;i < len;i++)
  {
     flag = 0;
  	for(int j = 0;j < len;j++)
    {
    	if(ch[i] == ch[j] && i != j)
        {
        flag =1;break;
        }
    }
    if(flag == 0)
    {
    temp = ch[i];
      break;
    }
  }
  if(flag == 0)
  {
  printf("%c",temp);
  }
  else
  {
  printf("All the characters are repetitive");
  }return 0;
}