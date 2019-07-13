import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        print_spiral(a, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print_spiral(int a[][], int n)
    { 
        // r_min --> row_minimum, r_max --> row_maximum
        // c_min --> column_minimum, c_max -- > column_maximum
        int val = 1;
        int rmin = 0, cmin = 0;
        int rmax = n-1, cmax = n-1;
        while ((rmax >= rmin) && (cmax >= cmin))
        {
            // Traversing from Right to left
            for(int i = cmax; (i >= cmin); i--)
            {
                a[rmin][i] = val++;
            }
     
            // Traversing from Top to Bottom
            for(int i = rmin + 1; (i <= rmax); i++)
            {
                a[i][cmin] = val++;
            }
     
            // Traversing from Left to Right
            for(int i = cmin + 1; (i <= cmax); i++)
            {
                a[rmax][i] = val++;
            }
     
            // Traversing from Bottom to Top
            for(int i = rmax - 1; (i >= rmin + 1); i--)
            {
                a[i][cmax] = val++;
            }
     
           // Updating the index values of row and column for the next spiral cycle
           rmin++; cmin++; rmax--; cmax--;
        }
    }
}