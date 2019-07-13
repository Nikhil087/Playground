import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      odd(n);
	}
  public static void odd(int num1)
  {
  	for(int i = 1;i <= num1;i++) 	   
      { 		 		  
         int counter=0; 		  
         for(int num =i; num>=1; num--)
         {
	 	   if(i%num==0)
	 	   {
			counter = counter + 1;
		    }
	 	}
	 	if (counter ==2)
	 	{
	    //Appended the Prime number to the String
	    System.out.println(i);
	 	}	
    }
  }
}