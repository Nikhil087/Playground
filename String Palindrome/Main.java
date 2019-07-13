import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int str_len = str.length();
        int end = str_len - 1;
        int front = 0;
        boolean flag = true;
        while(front < end)
        {
            if(str.charAt(front) != str.charAt(end))
            {
                flag = false;
                break;
            }
            front++;
            end--;
        }
        if(flag == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
}
