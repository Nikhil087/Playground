import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      sum_of_number(n);
    }
  public static void sum_of_number(int num)
  {
  	int sum = num*(num + 1)/2;
    System.out.print(sum);
  }
}