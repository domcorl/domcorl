// #88

import java.util.*;

public class mergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar1[] = new int[n];
        for(int i=0; i<n;i++ )
        {
            ar1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        
        int ar2[] = new int[m];
        for(int i=0; i<n;i++ )
        {
            ar2[i]=sc.nextInt();
        }
        merge(ar1,ar2,n,m);
        System.out.println(Arrays.toString(ar1));
        sc.close();
    }

    public static void merge(int[] ar1, int[] ar2,int m,int n) 
    {
        int p1=m-1,p2=n-1,i=m+n-1;
        for(p2=n-1;p2>=0;p2--)
        {
            if(p1>=0 && ar1[p1]>ar2[p2])
            {
                ar1[i--]=ar1[p1--];
            }
            else
            {
                ar1[i]=ar2[p2];
            }
        }
    }
}