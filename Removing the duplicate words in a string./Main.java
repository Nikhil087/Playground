
import java.util.Scanner;
class Main
{

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String msg = sc.nextLine();
		String[] arr=msg.split(" ");	
		for(int i=0;i<arr.length;i++)			
		{
			if(arr[i]!=null)
			{
			
			for(int j=i+1;j<arr.length;j++)	
				{
				
		 		if(arr[i].equals(arr[j]))	
					{
						arr[j]=null;	
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)		
		{
			if(arr[i]!=null)
			{
				System.out.print(arr[i]+" ");
			}
			
	     }  
	}
}