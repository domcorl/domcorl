
import java.util.*;
public class validSudoku2 {
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
        sc.close();
    }
    public static boolean isValidSudoku(char[][] board) {
        
        HashSet<String> grid = new HashSet<>();

        for(int i=0; i<9;i++)
        {
            for(int j=0; j<9;j++ )
            {
                if(board[i][j]=='.' )
                {
                    continue;
                }
                
                if(!grid.add("Row"+i+board[i][j]) || !grid.add("Column"+j+board[i][j]))
                {
                    return false;
                }
                int s=(i/3)*3+(j/3);
                if(!grid.add("Grid"+s+board[i][j]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
