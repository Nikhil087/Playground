import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i <= n - 1; i++){
           arr[i] = in.nextInt();
       }
       // Function call
       subsets_of_size_3(n, arr);
    }
    public static void subsets_of_size_3(int arr_size, int arr[])
    {
        for(int i1 = 0; i1 <= arr_size - 2; i1++)
        {
            for(int i2 = i1 + 1; i2 <= arr_size - 1; i2++)
            {
                for(int i3 = i2 + 1; i3 <= arr_size - 1; i3++)
                {
                    System.out.print("(" + arr[i1] + "," + " " + arr[i2] + "," + " " + arr[i3] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}
