import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here\
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ;i < n ; i++)
      {
      arr[i] = s.nextInt();
      }
      int se = s.nextInt();
      int ss1 = s.nextInt();
       for(int i = 0 ;i < n ; i++)
      {
      if(arr[i] == se )
      {
      	System.out.println(i);
      }
      if( arr[i] == ss1)
      {
      System.out.println(i);
      }
      }
    
	if(ss1 >= 1000){ System.out.println("-1");}
  
    }
}
