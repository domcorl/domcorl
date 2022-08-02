import java.util.HashMap;
import java.util.Scanner;

public class validSudoku {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        char ar1[][] = new char[m][m];
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<m;j++)
            {
                ar1[i][j]=sc.next().charAt(0);
            }
        }
        System.out.println(isValidSudoku(ar1));
    }
    public static boolean isValidSudoku(char[][] board) {
        
        
        HashMap<String,Character> grid = new HashMap<>();
        HashMap<String,Character> row = new HashMap<>();
        HashMap<String,Character> col = new HashMap<>();
        for(int i=0; i<9;i++)
        {
            for(int j=0; j<9;j++ )
            {
                
            }
        }
        System.out.println(row);
        return true;
    }
}

