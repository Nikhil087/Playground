#include <stdio.h>
#include <string.h>
 
int main()
{
   char name[100];
   int i = 0,j = 0, count[26] = { 0 };

  // scanf("%[^\n]s",name);
 gets(name);
   while (name[i] != '\0') {
  
 
      if (name[i] >= 'a' && name[i] <= 'z') {
          j= name[i] - 'a';
         count[j]++;
      }
     
      i++;
   }

   
    
     for(i=0;i<26;i++)
     {
         if(count[i] == 0)
         {
             printf("%c ", i + 'a', count[i]);
             count[i]=0;
         }
     }


   return 0;
}