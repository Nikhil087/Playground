import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
      Scanner s = new Scanner(System.in);
    int r,c;
    r = s.nextInt();
    c = s.nextInt();
    int[][] mat1 = new int[r][c];
    //int[][] mat2 = new int[r][c];
    for(int i = 0;i < r;i++)
    {
    	for(int j = 0;j < c;j++)
        	{
        	mat1[i][j] = s.nextInt();
        	}
    }
     for(int i = 0;i < r;i++)
    {
    	for(int j = 0;j < c;j++)
        {
         System.out.print(mat1[j][i]+" ") ;
        }
       System.out.println();
     }
  }
}