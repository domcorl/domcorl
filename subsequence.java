import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t= sc.nextLine();
            System.out.println(isSubsequence(s, t));
            sc.close();
        
    }
    public static boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=0 && m!=0)
        {
            int j=0;
            for(int i=0;i<m;i++)
            {
                char c=s.charAt(j);
                if(t.charAt(i)==c)
                {
                    j++;
                }
                if(j==n)return true;
            }
        }
        return false;
    }

}
