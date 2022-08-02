// #566
import java.util.*;

public class reshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ar1[][] = new int[m][n];
        for(int i=0; i<m;i++ )
        {
            for(int j=0; j<n;j++ )
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        //System.out.println(Arrays.toString(matrixReshape(ar1, r, c)));
        ar1=matrixReshape(ar1, r, c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                
            }
        }
        sc.close();
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int rp=0,cp=0;
        int result[][]=new int[r][c];
        if(r*c!=mat.length*mat[0].length)
        {
            // for(int i=0;i<mat.length;i++)
            // {
            //     for(int j=0;j<mat[0].length;j++)
            //     {
            //         System.out.print(mat[i][j]);
            //     }
            //     System.out.println();
            // }
            return mat; 
        }
        else
        {
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    result[rp][cp++]=mat[i][j];
                    if(cp==c)
                    {
                        rp++;
                        cp=0;
                    }
                    
                }
            }
            // for(int i=0;i<r;i++)
            // {
            //     for(int j=0;j<c;j++)
            //     {
            //         System.out.print(result[i][j]);
            //     }
            //     System.out.println();
            // }
        }
        return result;
    }
}
