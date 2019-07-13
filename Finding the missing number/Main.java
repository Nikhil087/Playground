import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = s.nextInt();
        }
        int mv = 0;
       
        for(int val = 1; val <= n; val++)
        {
            boolean is_found = false;
            for(int indx = 0; indx <= n - 1; indx++){
                if(arr[indx] == val)
                {
                    is_found = true;
                    break;
                }
            }
            if(is_found == false){
                mv = val;
                break;
            }
        }
        System.out.print(mv);
    }
}