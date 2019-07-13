import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
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
    int j,p=0;
    for(int i = 0;i < r;i++)
    {
      int t = 0; 
    	for( j = p;j < c;j++)
        {
        	System.out.print(mat[t++][j]+" ");
        }
      p++;
     // System.out.println();
    }
  }
}