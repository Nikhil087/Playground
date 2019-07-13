import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int[][] mat = new int[r][c];
    for(int i = 0;i < r;i++)
    {
    	for(int j = 0;j < c;j++)
        {
        	mat[i][j] = s.nextInt();
        }
    }
    int[][] mat2 = new int[r][c];
       for(int i = 0;i < r;i++)
    {
    	for(int j = 0;j < c;j++)
        {
        	mat2[i][j] = s.nextInt();
        }
    }
    int flag =1;
     for(int i = 0;i < r;i++)
    {
    	for(int j = 0;j < c;j++)
        {
      		if(mat[i][j] != mat2[i][j])
            {
            flag = 0;
            }
        }
     }
    if(flag == 0)
    {
    System.out.print("No");
    }
    else
    {
    System.out.print("Yes");
    }
  }
}