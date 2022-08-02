import java.util.Scanner;

public class searchTwoDMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ar1[][] = new int[m][n];
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        System.out.println(searchMatrix(ar1, target));
        sc.close();
    }
    public static boolean searchMatrix(int[][] matrix, int target) 
    {
        int n=matrix[0].length;
        for(int i=0 ; i < matrix.length ; i++)
        {
            if(target<matrix[i][0])
                return false;
            if(target == matrix[i][0] || target == matrix[i][n-1])
                return true;
            else if(target>matrix[i][0] && target< matrix[i][n-1])
            {
                return binarySearch(matrix[i], target);
            }
            else
            {
            }
        }
        return false;
    }
    public static boolean binarySearch(int [] ar, int target)
    {
        int l = 0, r = ar.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (ar[m] == target)
                return true;
 
            // If x greater, ignore left half
            if (ar[m] < target)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return false;
    }

}
