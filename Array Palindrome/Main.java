import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr_size = s.nextInt();
        int arr[] = new int[arr_size];
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = s.nextInt();
        }
        int left = 0;
        int right = arr_size - 1;
        int is_palindrome = 1;
      
        while(left <= right)  
        {
            if(arr[left] != arr[right])
            {
                is_palindrome = 0;
                break;
            }
            left++;
            right--;
        }
        if(is_palindrome == 1){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
    }
}
